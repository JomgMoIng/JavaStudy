package org.study.exceptionEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect2 {

	public static Connection getConnection() throws Exception {

		Connection conn = null;

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";
		String driver = "oracle.jdbc.driver.OracleDriver";

		Class.forName(driver);
		System.out.println("드라이버OK");

		
		conn = DriverManager.getConnection(url, user, password);
		System.out.println("Connection Success");

		
		return conn;
	}

}
