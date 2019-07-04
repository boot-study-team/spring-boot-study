package com.spring.rock.controller;

import com.spring.rock.service.UserInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Resource
    UserInfoService userInfoService;

    @RequestMapping("/getInfo")
    public String getInfo(){
        return userInfoService.getInfo();
    }
}
