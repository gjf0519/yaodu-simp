package com.yaodu.controller;

import com.yaodu.config.exception.ResultEntity;
import com.yaodu.entity.User;
import com.yaodu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/local/user/{id}")
    @ResponseBody
    public ResultEntity<User> getUserById(@PathVariable int id){
        User user = userService.getUserById(id);
        return ResultEntity.success(user);
    }

    @RequestMapping("/reptile/user/{id}")
    @ResponseBody
    public ResultEntity<User> getReptileUserById(@PathVariable int id){
        User user = userService.getReptileUserById(id);
        return ResultEntity.success(user);
    }
}
