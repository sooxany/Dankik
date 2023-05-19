package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.UserDto;

public abstract class UserService {
	public abstract boolean login (String userID, String userPassword);
	public abstract boolean join (UserDto user); 
	public abstract void modify(UserDto user);
	public abstract void withdraw(String userID);
	public abstract UserDto getUser(String userID);
	public abstract List<UserDto> getUserList();

}
