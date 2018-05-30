package com.test.springboot.v2.demo.controller;

import com.test.springboot.v2.demo.dao.mybatis.vo.ArenaInfo;
import com.test.springboot.v2.demo.service.ArenaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("arena")
public class ArenaController {

    @Resource
    private ArenaService arenaService;

    //add?uid=1000&title=t1&arenaDescribe=desc1
    @GetMapping("add")
    public Object add(ArenaInfo arenaInfo, long uid) {
        return arenaService.add(arenaInfo, uid);
    }

    //delete?arenaId=2
    @GetMapping("delete")
    public Object delete(long arenaId) {
        return arenaService.delete(arenaId);
    }

    //update?id=1&uid=1000&title=t11&arenaDescribe=desc1
    @GetMapping("update")
    public Object update(ArenaInfo arenaInfo) {
        return arenaService.update(arenaInfo);
    }

    @GetMapping("findAll")
    public Object findAll() {
        return arenaService.findAll();
    }
}
