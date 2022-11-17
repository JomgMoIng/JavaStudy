package org.study.utilEx;

import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class TimeEx {

	public static void main(String[] args) {
		
		
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		// 1970.01.01 기준
		long time = System.currentTimeMillis();
		System.out.println("시스템 밀리초 구하기: " +time);

		// 경과시간 구하기
		long time1 = System.currentTimeMillis();
		long time2 = System.currentTimeMillis();
																// 밀리세컨드라서초로변환
		System.out.println("경과시간(초) 구하기 : "+ (time2 - time1) /1000.0);
		
		//TimeZone 지역 시간 나타내기(기준 런던0시, 한국+9)
		TimeZone us = TimeZone.getTimeZone("US/Samoa");
		TimeZone eu = TimeZone.getTimeZone("Europe/London");
		
		System.out.println(us);
		System.out.println(eu);
		
		Calendar cal = Calendar.getInstance(us);
		Calendar cal2 = Calendar.getInstance(eu);
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal2.get(Calendar.DAY_OF_MONTH));
		
		
	}
}
