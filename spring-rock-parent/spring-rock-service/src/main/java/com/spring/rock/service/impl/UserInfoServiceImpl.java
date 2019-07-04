package com.spring.rock.service.impl;

import com.spring.rock.entity.UserInfoEntity;
import com.spring.rock.mappers.UserInfoMapper;
import com.spring.rock.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public String getInfo() {
        UserInfoEntity entity = userInfoMapper.getUserInfo();
        return entity.getUserName();
//        return "123123";
    }
}
