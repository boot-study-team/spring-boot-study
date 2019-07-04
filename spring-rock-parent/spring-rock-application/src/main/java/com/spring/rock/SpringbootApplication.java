package com.spring.rock;

import com.spring.rock.service.UserInfoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@SpringBootApplication
@RestController
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

    @Resource
    UserInfoService userInfoService;


    @RequestMapping("/test")
    public String test(){
        System.out.println(userInfoService.getInfo());
        return userInfoService.getInfo();
    }


}
