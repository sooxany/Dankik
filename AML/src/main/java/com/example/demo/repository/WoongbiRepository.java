
package com.example.demo.repository;

import com.example.demo.entity.WoongbiEntity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WoongbiRepository extends JpaRepository<WoongbiEntity, Long>{
	// 이메일로 회원 정보 조회 (select * from new_user while userID = ?)
	
	
}
