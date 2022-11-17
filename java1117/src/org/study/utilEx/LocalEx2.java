package org.study.utilEx;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalEx2 {

	public static void main(String[] args) {
		
		System.out.println("날짜 비교하기");
		
		//날짜를 비교 할 수 있다.
		LocalDateTime StartDateTime = LocalDateTime.now(); //오늘
		LocalDateTime endDateTime = LocalDateTime.of(2023, 8,1,23,59,59); //임의 시간
		
		//이전 날짜냐?
		boolean bool = StartDateTime.isBefore(endDateTime);
		System.out.println(bool);
		
		//같은 날짜냐?
		bool = StartDateTime.isEqual(endDateTime);
		System.out.println(bool);
		
		//이후 날자냐?
		bool = StartDateTime.isAfter(endDateTime);
		System.out.println(bool);
		
		//표시 방법 (시작일이 끝나는날보다 이후인가요?)
		if(StartDateTime.isAfter(endDateTime)) {
			System.out.println("선택날짜 이후입니다.");
		} else {
			System.out.println("선택날짜 이후가 아닙니다.");
		}
		
		System.out.println("ZoneDateTime");
		
		ZonedDateTime utcZone = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utcZone);
		
		ZonedDateTime seoul = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(seoul);


		

		
	}
}
