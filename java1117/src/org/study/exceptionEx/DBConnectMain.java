package org.study.exceptionEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

public class DBConnectMain {

	public static void main(String[] args) throws Exception  {
		

		
		DBConnect.getConnection();

		DBConnect2.getConnection();


		int i = new Integer(10);
		
		

	}


}
