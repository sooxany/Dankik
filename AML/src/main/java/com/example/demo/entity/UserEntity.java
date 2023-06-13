// 일종의 테이블 역할

package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import com.example.demo.dto.UserDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Setter
@Getter
@Table(name = "newnew_user")
public class UserEntity {
	// 아래 형식과 같은 column 만들어줌
	@Id // pk 지정
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	private Long id;
	
	@Column(unique = true) // unique 제약 조건 추가
	private String userID;
	@Column
	private String userPassword;
	
	private String userName;
	
	private String userPhonenumber;

	
	public static UserEntity toUserEntity(UserDto userDto) {
		UserEntity userEntity = new UserEntity();
		userEntity.setUserID(userDto.getUserID());
		userEntity.setUserPassword(userDto.getUserPassword());
		userEntity.setUserName(userDto.getUserName());
		userEntity.setUserPhonenumber(userDto.getUserPhonenumber());
		
		
		
		return userEntity;
		
	}
}
