package com.example.demo.service;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import java.util.List;
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

}
