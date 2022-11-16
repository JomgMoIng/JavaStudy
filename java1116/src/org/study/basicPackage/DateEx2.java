package org.study.basicPackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx2 {

	public static void main(String[] args) {
		
		System.out.println("Date");
		
		Date now = new Date();
		System.out.println(now);
		
		//일요일이0,월요일이1~토요일이6 나머지 요일 선택오류		
//		switch문 이용해서 오늘 날짜를 Date의 getDay() 이용해서
//		콘솔에 요일을 출력하시오
		
		int weekday = now.getDay();
		
		switch(weekday) {
		case 0:
		System.out.println("일요일");
		break;
	case 1:
		System.out.println("월요일");
		break;
	case 2:
		System.out.println("화요일");
		break;
	case 3:
		System.out.println("수요일");
		break;
	case 4:
		System.out.println("목요일");
		break;
	case 5:
		System.out.println("금요일");
		break;
	case 6:
		System.out.println("토요일");
		break;
	default:
		System.out.println("뭔요일?");
		}
		
//		DateFormat 날짜를 포맷
		
		Date now2 = new Date(); //날짜생성

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); //날짜 포맷

		format.format(now2); // > 날짜를 날짜포맷

		System.out.println(format.format(now2));

		
		
	}
}
