package org.study.abstractEx;

import java.io.Closeable;
import java.util.Scanner;

public class DBController {

	public static void main(String[] args) {

		//부모타입 객체 참조변수
//		SQLQueryCommend a1 = new DBInsertDo();
//		a1.excuteQueryCommend();
//		a1 = new DBDeleteDo();
//		a1.excuteQueryCommend();
//		a1 = new DBUpdateDo();
//		a1.excuteQueryCommend();
//		a1 = new DBSelectDo();
//		a1.excuteQueryCommend();
//	

		
		
		
		SQLQueryCommend ins = new DBInsertDo();
		SQLQueryCommend upd = new DBUpdateDo();
		SQLQueryCommend del = new DBDeleteDo();
		SQLQueryCommend sel = new DBSelectDo();
		
		
	Scanner input = new Scanner(System.in);
	System.out.print("쿼리문을 입력 : ");
			
		while(true) {
			String query = input.next();

			if(query.equals("insert")) {
				ins.excuteQueryCommend();
			} else if(query.equals("update")) {
				upd.excuteQueryCommend();
			} else if(query.equals("delete")) {
				del.excuteQueryCommend();
			} else if(query.equals("select")) {
				sel.excuteQueryCommend();
			} else if(query.equals("exit")) {
				System.out.println("종료");
				break;
			} else {
				System.out.print("입력오류. 쿼리문 재입력 :");
			}
		}
		
		
	
		input.close();
	
	
	
	
	
	}
}
