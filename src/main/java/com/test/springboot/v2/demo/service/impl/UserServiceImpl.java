package com.test.springboot.v2.demo.service.impl;

import com.google.common.base.Strings;
import com.test.springboot.v2.demo.dao.CodeInfoDao;
import com.test.springboot.v2.demo.dao.UserInfoDao;
import com.test.springboot.v2.demo.dao.mybatis.vo.CodeInfo;
import com.test.springboot.v2.demo.dao.mybatis.vo.UserInfo;
import com.test.springboot.v2.demo.exceptioin.InnsException;
import com.test.springboot.v2.demo.exceptioin.InnsExceptionEnum;
import com.test.springboot.v2.demo.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

@Repository
public class UserServiceImpl implements UserService {

    @Resource
    private UserInfoDao userInfoDao;

    @Resource
    private CodeInfoDao codeInfoDao;

    @Override
    public UserInfo addUser(UserInfo userInfo, String code) {
        String phone = userInfo.getPhone();
        String password = userInfo.getPassword();
        checkPhone(phone);
        checkPassword(password);
        checkUseCode(phone, code);

        List<UserInfo> userInfos = userInfoDao.getByPhone(phone);
        if (userInfos != null && userInfos.size() > 0) {
            throw new InnsException(InnsExceptionEnum.PHONE_ALREDAY_EXIST);
        }
        userInfo.setPassword(encryPassword(password));
        userInfo.setCreateDate(new Date());
        userInfoDao.save(userInfo);
        return userInfo;
    }

    @Override
    public UserInfo login(String phone, String password) {
        List<UserInfo> userInfos = userInfoDao.getByPhone(phone);
        if (userInfos == null || userInfos.size() == 0) {
            throw new InnsException(InnsExceptionEnum.PHONE_NOT_EXIST);
        }
        UserInfo userInfo = userInfos.get(0);
        if (!userInfo.getPassword().equals(encryPassword(password))) {
            throw new InnsException(InnsExceptionEnum.OLD_PASSWORD_ERROR);
        }
        return userInfo;
    }

    @Override
    public List<UserInfo> findAll() {
        return userInfoDao.findAll();
    }

    private String encryPassword(String password) {
        if (password.length() == 32) {
            password = DigestUtils.md5Hex(password);
        } else {
            password = DigestUtils.md5Hex(DigestUtils.md5Hex(password));
        }
        return password;
    }

    private void checkPassword(String password) {
        if (Strings.isNullOrEmpty(password)) {
            throw new InnsException(InnsExceptionEnum.PASSWORD_CAN_NOT_BE_EMPTY);
        }
        if (password.length() == 32) {
            return;
        }
        if (!Pattern.matches("[0-9a-zA-z`~!@#\\$%\\^&\\*\\(\\)\\-_=+\\[\\]\\{\\};:'\",<>./?\\\\|]{6,20}", password)) {
            throw new InnsException(InnsExceptionEnum.PASSWORD_IS_INVALID);
        }
    }

    private void checkPhone(String phone) {
        if (!isPhone(phone)) {
            throw new InnsException(InnsExceptionEnum.PHONE_IS_INVALID);
        }
    }

    private void checkEmail(String email) {
        if (!isEmail(email)) {
            throw new InnsException(InnsExceptionEnum.EMAIL_IS_INVALID);
        }
    }

    private void checkAccount(String account) {
        if (Strings.isNullOrEmpty(account) || (!Pattern.matches("^[a-zA-Z][a-zA-z_0-9]*[a-zA-Z0-9]$", account) && !isEmail(account))) {
            throw new InnsException(InnsExceptionEnum.ACCOUNT_IS_INVALID);
        }
    }

    private boolean isPhone(String phone) {
        return phone != null && Pattern.matches("^1\\d{10}$", phone);
    }

    private boolean isEmail(String email) {
        return email != null && Pattern.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*", email);
    }

    private CodeInfo checkUseCode(String phoneOrEmail, String code) {
        CodeInfo codeInfo = codeInfoDao.get(phoneOrEmail);
        if (codeInfo == null) {
            throw new InnsException(InnsExceptionEnum.VALIDATE_CODE_NOT_EXIST);
        }
        if (!codeInfo.getCode().toString().equals(code)) {
            throw new InnsException(InnsExceptionEnum.CODE_ERROR);
        }
        // 使用过的短信验证码改为失效
        if ((codeInfo.getUsed() != null && codeInfo.getUsed()) || codeInfo.getCreateDate().getTime() + 10 * 60000 < System.currentTimeMillis()) {
//            throw new InnsException(InnsExceptionEnum.VALIDATE_CODE_OVERDUE);
        }
        return codeInfo;
    }
}
