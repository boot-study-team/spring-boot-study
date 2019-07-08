package com.spring.rock.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(name="eureka-1")
public interface UserFeignClient {

    @RequestMapping(value = "/provider/getInfo", method = RequestMethod.POST)
    String getInfo();

}
