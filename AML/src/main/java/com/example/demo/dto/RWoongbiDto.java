package com.example.demo.dto;

import com.example.demo.entity.WoongbiEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RWoongbiDto {
	private Long id;
	private String reservation_date;
	private String reservation_time;
	private String laundry_num;
	
	
	public static RWoongbiDto toWoongbiDto1(WoongbiEntity woongbiEntity) {
		RWoongbiDto woongbiDto = new RWoongbiDto();
		
		woongbiDto.setReservation_date(woongbiEntity.getReservation_date());
		woongbiDto.setReservation_time(woongbiEntity.getReservation_time());
		woongbiDto.setLaundry_num(woongbiEntity.getLaundry_num());
		
		return woongbiDto;
	}
	

}
