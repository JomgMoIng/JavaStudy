package org.study.basicPackage;

import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		System.out.println("Date");

		Date date = new Date();
		
		System.out.println(date);
		System.out.println(date.getYear()+1900); // 1900년부터 측정해서 1900을 더해줘야 한다 //-표시 사용가능하지만 권하지 않는다
		System.out.println(date.getMonth()+1); // 월이 0부터 출발해서 1을 더해줘야 한다
		System.out.println(date.getDate());	//일
		System.out.println(date.getHours());	//시
		System.out.println(date.getSeconds());	//분
		System.out.println(date.getMinutes());	//초
		System.out.println(date.getDay());		//요일 > 일요일이 0부터 시작
		
		System.out.println((date.getYear()+1900)+"년"+
		(date.getMonth()+1)+"월"+
				date.getDate()+"일"+
		date.getHours()+"시"+
				date.getMinutes()+"분"+
		date.getSeconds()+"초");
		
		
		
		
		
		
		
		

		
		
	}
}
