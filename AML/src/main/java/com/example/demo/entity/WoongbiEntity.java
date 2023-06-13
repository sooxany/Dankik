

//일종의 테이블 역할

package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import com.example.demo.dto.RWoongbiDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Setter
@Getter
@Table(name = "woongbi")
public class WoongbiEntity {
	// 아래 형식과 같은 column 만들어줌
	@Id // pk 지정
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	private Long id;
	
	@Column(unique = true) // unique 제약 조건 추가
	
	private String reservation_date;
	
	private String reservation_time;
	
	private String laundry_num;

	
	public static WoongbiEntity toWoongbiEntity(RWoongbiDto woongbiDto) {
		WoongbiEntity woongbiEntity = new WoongbiEntity();
		
		woongbiEntity.setReservation_date(woongbiDto.getReservation_date());
		woongbiEntity.setReservation_time(woongbiDto.getReservation_time());
		woongbiEntity.setLaundry_num(woongbiDto.getLaundry_num());
		
		
		return woongbiEntity;
		
	}
}

