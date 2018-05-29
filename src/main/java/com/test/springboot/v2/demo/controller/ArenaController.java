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

    @GetMapping("add")
    public Object add(ArenaInfo arenaInfo) {
        return arenaService.add(arenaInfo);
    }

    @GetMapping("delete")
    public Object delete(long arenaId) {
        return arenaService.delete(arenaId);
    }

    @GetMapping("update")
    public Object update(ArenaInfo arenaInfo) {
        return arenaService.update(arenaInfo);
    }

    @GetMapping("findAll")
    public Object findAll() {
        return arenaService.findAll();
    }
}
