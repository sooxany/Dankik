package com.example.demo.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
public class MemberController {
	// 생성자 주입
	private final UserService userService;
	
	//회원가입 페이지 출력 요청
	@GetMapping("member/save")
	public String saveForm() {
		return "save";
	}
	
	// 로그인 후 메인 페이지 출력 요청
	@GetMapping("member/main")
	public String mainForm() {
		return "main";
	}
	
	// 세탁 예약 시스템 페이지 출력 요청
	@GetMapping("member/reserve")
	public String reserveForm() {
		return "reserve";
	}
	
	@PostMapping("/member/save")
	public String save(@ModelAttribute UserDto userDto) {
		System.out.println("MemberController.save");
		System.out.println("userDto = " + userDto);
		userService.save(userDto);
		return "login";
	}
	
	@GetMapping("/member/login")
	public String loginForm() {
		return "login";
	}
	
	@GetMapping("/member/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "home";
	}
	
	@GetMapping("/member/home")
	public String homeForm() {
		return "home";
	}
	
	@GetMapping("/member/woongbi_gender")
	public String woongbigenderForm() {
		return "woongbi_gender";
	}
	
	@GetMapping("/member/woongbi_selection")
	public String woongbiselectionForm() {
		return "woongbi_selection";
	}
	
	@GetMapping("/member/woongbi_dry_reservation")
	public String woongbidryreservationForm() {
		return "woongbi_dry_reservation";
	}
	
	
	@GetMapping("/member/woongbi_wash_reservation")
	public String woongbiwashreservationForm() {
		return "woongbi_wash_reservation";
	}
	
	@GetMapping("/member/jib_dry")
	public String jibdryForm() {
		return "jib_dry";
	}
	
	@GetMapping("/member/jib_gender")
	public String jibgenderForm() {
		return "jib_gender";
	}
	
	@GetMapping("/member/jib_selection")
	public String jibselectionForm() {
		return "jib_selection";
	}
	
	@GetMapping("/member/jib_wash")
	public String jibwashForm() {
		return "jib_wash";
	}
	
	@GetMapping("/member/jin_wash")
	public String jinwashForm() {
		return "jin_wash";
	}
	
	@GetMapping("/member/jin_dry")
	public String jindryForm() {
		return "jin_dry";
	}
	
	@GetMapping("/member/jin_gender")
	public String jingenderForm() {
		return "jin_gender";
	}
	
	@GetMapping("/member/jin_selection")
	public String jinselectionForm() {
		return "jin_selection";
	}
	@PostMapping("/member/login")
	public String login(@ModelAttribute UserDto userDto, HttpSession session) {
		UserDto loginResult = userService.login(userDto);
		if (loginResult != null) {
			// login 성공
			session.setAttribute("loginID", loginResult.getUserID());
			return "main";
			
		} else {
			// login 실패
			return "login";
		}
	}
	
	@PostMapping("/member/id-check")
	public @ResponseBody String idcheck(@RequestParam("userID") String userID) {
		System.out.println("userID = " + userID);
		String checkResult = userService.idcheck(userID);
		return checkResult;
		
	
}
}
