package org.study.basicPackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormet {

	public static void main(String[] args) {
		
		System.out.println("DateFormat");

		Date now = new Date();

		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, Locale.KOREA);
//		DateFormat df1 = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);
//		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.KOREA);
//		DateFormat df3 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.KOREA);
//		DateFormat df4 = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.KOREA);
		
		System.out.println(df.format(now));
		
		DateFormat df3 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);

		System.out.println(df3.format(now));
		
	}
}
