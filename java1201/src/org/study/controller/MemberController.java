package org.study.controller;

import java.util.Scanner;

import org.study.commend.MemberCommend;
import org.study.commend.MemberDeleteDo;
import org.study.commend.MemberInsertDo;
import org.study.commend.MemberSelectDo;
import org.study.commend.MemberUpdateDo;

public class MemberController {

	public static void main(String[] args) {

		System.out.println("CRUD");
		
		Scanner input = new Scanner(System.in);
		
		MemberCommend commend = null;
		String query = null;

		while(true) {
			System.out.println("SQL문을 입력하세요(insert,update,select,delete)");		
			query=input.next();

			
			if(query.equals("insert")) {
			commend = new MemberInsertDo();
			commend.excuteQueryCommend();
			} else if(query.equals("update")) {
				commend = new MemberUpdateDo();
				commend.excuteQueryCommend();
			} else if(query.equals("select")) {
				commend = new MemberSelectDo();
				commend.excuteQueryCommend();
			} else if(query.equals("delete")) {
				commend = new MemberDeleteDo();
				commend.excuteQueryCommend();
			} else if(query.equals("exit")) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("입력오류");
			}
		}


		
		
	}
}
