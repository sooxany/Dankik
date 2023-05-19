package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.UserMapper;
import com.example.demo.dto.UserDto;
 
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class AmlApplicationTests {
 
    @Autowired
    private UserMapper uMapper;
    
    @Test
    public void userTest() 
    {
        UserDto user = new UserDto();
        user.setUserID("test1");
        user.setUserPassword("123456");
        uMapper.insertUser(user);
        
        System.out.println(uMapper.selectOneUser("test"));
    }

}
