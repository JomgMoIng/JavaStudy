package org.study.utilEx;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class LocalDateTimeEx2 {

	public static void main(String[] args) {
		System.out.println("LocalDateTime");
		

		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println(dateTime);
		
		System.out.println(dateTime.getYear());
		System.out.println(dateTime.getMonthValue());
		System.out.println(dateTime.getDayOfMonth());
		System.out.println(dateTime.getHour());
		System.out.println(dateTime.getMinute());
		System.out.println(dateTime.getSecond());
		
		LocalDateTime dateTime2 = LocalDateTime.of(2022, 11,17,11,25,01);
		
		System.out.println(dateTime2.getYear());
		System.out.println(dateTime2.getMonthValue());
		System.out.println(dateTime2.getDayOfMonth());
		System.out.println(dateTime2.getDayOfWeek());
		System.out.println(dateTime2.getHour());
		System.out.println(dateTime2.getMinute());
		System.out.println(dateTime2.getSecond());
		
		

		
	}
}
