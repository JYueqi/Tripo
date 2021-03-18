package com.db.demo01;

import com.db.demo01.Mapper.*;
import com.db.demo01.pojo.*;
import org.junit.jupiter.api.Test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class Demo01ApplicationTests {

    @Autowired
    userMapper userMapper;

    @Test
    void contextLoads() {

        String pwd;

        pwd = userMapper.getUserPassword("root");

        if(pwd.equals("root")){
            System.out.println("ok");
        }
        else {
            System.out.println("no");
        }
    }

}
