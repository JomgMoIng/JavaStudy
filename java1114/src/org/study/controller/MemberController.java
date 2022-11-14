package org.study.controller;

import java.util.Scanner;

import org.study.commend.CRUDCommend;
import org.study.commend.DBDeleteCommend;
import org.study.commend.DBInsertCommend;
import org.study.commend.DBSelectCommend;
import org.study.commend.DBUpdateCommend;

public class MemberController {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		boolean bool = true;
		
		while(bool) {
		
		System.out.print("쿼리문입력 : ");
		String query = scn.next();
		CRUDCommend commend = null; // null 기본
		
		if(query.equals("insert")) {
			commend = new DBInsertCommend();
			commend.excuteCommend();
		} else if(query.equals("select")) {
			commend = new DBSelectCommend();
			commend.excuteCommend();
		} else if(query.equals("update")) {
			commend = new DBUpdateCommend();
			commend.excuteCommend();
		} else if(query.equals("delete")) {
			commend = new DBDeleteCommend();
			commend.excuteCommend();
		} else if(query.equals("exit")) {
			System.out.println("쿼리문 종료");
//			break;
			bool = !bool;
		} else {
			System.out.println("쿼리문 입력 오류! 다시입력!!");
		}
		
		
		}	
		
		
		
		
		


		
		
	}
}
