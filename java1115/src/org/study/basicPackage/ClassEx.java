package org.study.basicPackage;


public class ClassEx {

	public static void main(String[] args) {
		
		try {
			Class.forName("oraclejdbc.driver.OracleDriver");
			System.out.println("Oracle 연동 success");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Oracle 연동 fail");
		}
		
	}
}
