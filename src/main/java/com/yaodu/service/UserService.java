package com.yaodu.service;

import com.alibaba.fastjson.JSON;
import com.yaodu.entity.User;
import com.yaodu.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
//@Scope("singleton")//prototype   @PostConstruct @PreDestroy
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User getUserById(int id){
        User user = userMapper.getUserById(id);
        log.info("根据ID查询用户user:{}", JSON.toJSONString(user));
        return user;
    }

    public User getReptileUserById(int id){
        User user = userMapper.getUserById(id);
        log.info("根据ID查询用户user:{}", JSON.toJSONString(user));
        return user;
    }

    @Transactional
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }
}