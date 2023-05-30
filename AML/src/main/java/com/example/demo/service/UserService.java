package com.example.demo.service;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserRepository userRepository;
	
	public void save(UserDto userDto) {
		// 1. dto -> entity 변환
		// 2 .repository의 save 메소드 호출
		UserEntity userEntity = UserEntity.toUserEntity(userDto);
		userRepository.save(userEntity);
		// repository의 save 메소드 호출 ( 조건. entity 객체를 넘겨줘야 함)
		
	}
	
	public UserDto login(UserDto userDto) {
		/* 
		 1. 회원이 입력한 ID를 DB에서 조회함
		 2. DB에서 조회한 비밀번호와 사용자가 입력한 비밀번호가 일치하는지 판단
		 */
		
		Optional<UserEntity> byUserID = userRepository.findByUserID(userDto.getUserID());
		if (byUserID.isPresent()) {
			// 조회 결과가 있다 (해당 ID를 가진 회원 정보가 있다)
			UserEntity userEntity = byUserID.get();
			if (userEntity.getUserPassword().equals(userDto.getUserPassword())) {
				//비밀번호 일치
				// entity -> dto 변환 리턴
				UserDto dto = UserDto.toUserDto(userEntity);
				return dto;
			} else {
				return null;
			}
			
		} else {
			// 조회 결과가 없다 (해당 ID를 가진 회원이 없다)
			return null;
		}
				
	}
	public String idcheck(String userID) {
		Optional<UserEntity> byUserID = userRepository.findByUserID(userID);
				if (byUserID.isPresent()) {
					// 조회 결과가 있다 -> 사용할 수 없다
					return null;
				}
		
				else {
					// 조회 결과가 없다 -> 사용할 수 있다
					return "Ok";
				}
	}

	
}
