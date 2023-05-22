package com.example.demo.service;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.dto.UserDto;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@Controller
@RequiredArgsConstructor
public class UserService {
	private final UserRepository userRepository;
	
	public void save(UserDto userDto) {
	
	}

}
