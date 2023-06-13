package com.example.demo.service;

import org.springframework.stereotype.Service;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.example.demo.dto.RWoongbiDto;
import com.example.demo.entity.WoongbiEntity;
import com.example.demo.repository.WoongbiRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class WoongbiService {

private final WoongbiRepository woongbiRepository;
	
	public void woongbi_wash_reservation(RWoongbiDto woongbiDto) {
		// 1. dto -> entity 변환
		// 2 .repository의 save 메소드 호출
		WoongbiEntity woongbiEntity = WoongbiEntity.toWoongbiEntity(woongbiDto);
		woongbiRepository.save(woongbiEntity);
		// repository의 save 메소드 호출 ( 조건. entity 객체를 넘겨줘야 함)
		
	}
	
}
