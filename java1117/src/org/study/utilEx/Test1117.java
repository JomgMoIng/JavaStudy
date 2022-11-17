package org.study.utilEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1117 {

	public static void main(String[] args) {
		

		
		try {
			//class를 찾는~ Oracle JDBC 드라이버
			Class.forName("Oracle.jdbc.driver.OracleDriver");
			System.out.println("Oralce Driver Connect Success");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Oralce Driver Connect Fail");
		}
		
//		1. 날짜 생성
		 Date now = new Date();
//		2. 포맷
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		3. 포맷(날짜) > 
		 String day1 = sdf.format(now);
		
		 System.out.println(day1);
		 
	}
	
	
}
