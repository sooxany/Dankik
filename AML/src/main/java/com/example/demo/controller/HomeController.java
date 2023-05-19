package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	//기본페이지 요청 메소드
	@GetMapping("/")
	public String index() {
		return "index"; // index라는 html 파일을 띄우겠다/ templates 폴더의 index.html을 찾아감
	}
	

}
