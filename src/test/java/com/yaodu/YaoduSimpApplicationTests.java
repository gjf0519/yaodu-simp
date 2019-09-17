package com.yaodu;

import com.yaodu.controller.UserController;
import com.yaodu.entity.User;
import com.yaodu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YaoduSimpApplicationTests {

    @Autowired
    UserController userController;
    @Autowired
    UserService userService;

    @Test
    public void contextLoads(){
        userController.getUserById(1);
    }

    @Test
    public void insertUser() {
        User user = User.builder()
                .username("ggg")
                .password("fsdfs")
                .role("1")
                .permission("fsdfa")
                .build();
        userService.insertUser(user);
    }

}
