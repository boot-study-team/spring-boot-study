package com.spring.rock.controller;

import com.spring.rock.feign.UserFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Resource
    RestTemplate restTemplate;

    @Resource
    UserFeignClient userFeignClient;

    /**
     * restTemplate方式测试调用提供者
     * @return
     */
    @RequestMapping("/getConsumerInfo")
    public String getConsumerInfo(){
        System.out.println(restTemplate.postForObject("http://eureka-1:8081/provider/getInfo",null,String.class));
        return restTemplate.postForEntity("http://eureka-1:8081/provider/getInfo",null,String.class).toString();
    }

    /**
     * FeignClient方式测试调用提供者
     * @return
     */
    @RequestMapping("/getConsumerInfoByFeign")
    public String getConsumerInfoByFeign(){
        System.out.println(userFeignClient.getInfo());
        return userFeignClient.getInfo();
    }
}
