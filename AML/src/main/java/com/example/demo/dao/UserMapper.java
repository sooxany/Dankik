package com.example.demo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.dto.UserDto;

public interface UserMapper {
	public void insertUser (UserDto user);
	public void updateUser (UserDto user);
	public void deleteUser (String userID);
	public UserDto selectOneUser (String userI);
	public List<UserDto> selectAllUser();

}