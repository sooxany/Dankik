package com.example.demo.repository;

import com.example.demo.entity.UserEntity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
	// 이메일로 회원 정보 조회 (select * from new_user while userID = ?)
	Optional<UserEntity> findByUserID(String userID);
	
	
}
