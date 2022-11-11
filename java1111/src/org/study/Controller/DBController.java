package org.study.Controller;

import java.util.Scanner;

import org.study.Commend.DBDeleteDo;
import org.study.Commend.DBInsertDo;
import org.study.Commend.DBSelectDo;
import org.study.Commend.DBUpdateDo;
import org.study.Commend.SQLQueryCommend;

public class DBController {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("쿼리문을 입력하세요 : ");
		
		
		SQLQueryCommend s1 = new DBInsertDo();
		SQLQueryCommend s2 = new DBSelectDo();
		SQLQueryCommend s3 = new DBUpdateDo();
		SQLQueryCommend s4 = new DBDeleteDo();
		
		while(true) {
			String te = input.next();
			if(te.equals("insert")) {
				s1.excuteQueryCommend();
				System.out.print("재입력 : ");
			}else if(te.equals("select")) {
				s2.excuteQueryCommend();
				System.out.print("재입력 : ");
			}else if(te.equals("update")) {
				s3.excuteQueryCommend();
				System.out.print("재입력 : ");
			}else if(te.equals("delete")) {
				s4.excuteQueryCommend();
				System.out.print("재입력 : ");
			}else if(te.equals("exit")) {
				System.out.println("종료");
				break;
			}else {
				System.out.print("입력오류. 다시 입력하세요 : ");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
