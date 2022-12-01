package org.study.dbconnect;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

// DB연동
public class DBConnect {
	
	public static Connection getConnection() {

		// 1. JDBC 드라이버 찾기
		
		Connection conn = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";	//오라클 드라이버
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	//오라클 기본 DB URL
		String user = "system";	//user ID
		String password = "1234";	//user password
		
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 OK");
			
			//2. DB연결 > xe
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 Success");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 Fail");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB연결 Fail");
		}
		
//		System.out.println(conn);
		
		if(conn!=null) {
			System.out.println("오라클 연동 성공");
		} else {
			System.out.println("오라클 연동 실패");
		}


		return conn;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
