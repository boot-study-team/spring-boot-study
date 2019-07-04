package com.spring.rock.mappers;


import com.spring.rock.entity.UserInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserInfoMapper {

    public UserInfoEntity getUserInfo();
}
