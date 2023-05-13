package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.dao.UserMapper;
import com.example.demo.dto.UserDto;
 

@SpringBootApplication
public class AmlApplication {
 
    private UserMapper uMapper;
     
    public void userTest() 
    {
        UserDto user = new UserDto();
        user.setID("test");
        user.setPassword("123456");
        uMapper.insertUser(user);
        
        System.out.println(uMapper.selectOneUser("test"));
    }

 
    
}
