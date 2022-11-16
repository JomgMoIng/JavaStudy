package org.study.basicPackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormet {

	public static void main(String[] args) {
		
		System.out.println("SimpleDateFormat");
		

//		DateFormat 날짜를 포맷
		
		//날짜생성
		Date now = new Date(); 

		// > 날짜 포맷설정
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 

		//3.날짜 ㅍ뫳에 날짜를 설정
		String day1 = format.format(now);
		System.out.println(day1);
		
		SimpleDateFormat format2 = new SimpleDateFormat("");
		
		
	}
}
