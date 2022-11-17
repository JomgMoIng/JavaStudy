package org.study.utilEx;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeEx {

	public static void main(String[] args) {
		System.out.println("LocalDateTime");
		
		LocalDate ldate = LocalDate.now();
		LocalTime ltime = LocalTime.now();

		int year = ldate.getYear();
		int month = ldate.getMonthValue();
		int date = ldate.getDayOfMonth();
		int hour = ltime.getHour();
		int minute = ltime.getMinute();
		int second = ltime.getSecond();
				
		System.out.println(year+"년 "+month+"월 "+date+"일 "+hour+"시 "+minute+"분 "+second+"초 ");
		
		
	}
}
