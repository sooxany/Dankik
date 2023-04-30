// 자바 버전으로 출력하기 .. view는 화면에 보이는 것이 없어서 에러가 나기에 controller 패키지를 생성해서 화면에 보이도록

package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/")
	public String index() {
		return "Hello World";
	}
}
