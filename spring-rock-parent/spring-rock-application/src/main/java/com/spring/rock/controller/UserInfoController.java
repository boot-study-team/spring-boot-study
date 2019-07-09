package com.spring.rock.controller;

import com.spring.rock.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/user")
@Slf4j
public class UserInfoController {

    @Resource
    UserInfoService userInfoService;

    @RequestMapping("/getInfo")
    public String getInfo(){
        log.info("info=====");
        log.warn("warn=====");
        log.error("error=====");
        log.debug("debug=====");
        return userInfoService.getInfo();
    }
}
