package org.study.utilEx;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalEx1 {

	public static void main(String[] args) {
		
		//날짜 조절
		//.plus~ , .min~
		LocalDateTime curdate = LocalDateTime.now();
		
		System.out.println("현재 날짜 시간 : "+curdate);
	
		System.out.println(curdate.plusYears(3)); //년 더하기

		System.out.println(curdate.minusYears(2)); //년 빼기
		
		System.out.println(curdate.plusMonths(13)); //월 더하기
		
		System.out.println(curdate.minusMonths(3)); //월 빼하기
		
		System.out.println(curdate.plusDays(2)); //일 더하기
		
		System.out.println(curdate.minusDays(3)); //일 빼기
		
		System.out.println(LocalDateTime.now().plusHours(3)); //시간도 마찬가지
		
		
		
	}
}
