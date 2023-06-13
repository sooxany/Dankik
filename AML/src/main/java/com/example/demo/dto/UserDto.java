package com.example.demo.dto;

import com.example.demo.entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto {
	private Long id;
	private String userID;
	private String userPassword;
	private String userName;
	private String userPhonenumber;
	
  

	
	public static UserDto toUserDto(UserEntity userEntity) {
		UserDto userDto = new UserDto();
		userDto.setId(userEntity.getId());
		userDto.setUserID(userEntity.getUserID());
		userDto.setUserPassword(userEntity.getUserPassword());
		userDto.setUserName(userEntity.getUserName());
		userDto.setUserPhonenumber(userEntity.getUserPhonenumber());
		
		return userDto;
	}
	
	
//	
//	public String getUserID() {
//		return userID;
//	}
//	public void setUserID(String userID) {
//		this.userID = userID;
//	}
//	public String getUserPassword() {
//		return userPassword;
//	}
//	public void setUserPassword(String userPassword) {
//		this.userPassword = userPassword;
//	}
//	
//	public String toString() {
//		return "UserDto [userId=" + userID + ",UserPw="+userPassword+"]";
//	}

}
