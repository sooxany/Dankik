package com.example.demo.dto;

public class UserDto {
	private String userID;
	private String userPassword;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public String toString() {
		return "UserDto [userId=" + userID + ",UserPw="+userPassword+"]";
	}

}
