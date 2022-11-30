package org.study.controller;

import java.util.Scanner;

import org.study.commend.MemberCommend;
import org.study.commend.MemberDeleteDo;
import org.study.commend.MemberInsertDo;
import org.study.commend.MemberSelectDo;
import org.study.commend.MemberUpdateDo;

public class MemberController {

	public static void main(String[] args) {
		// Controller > 사용자 요청(Request)을 받아서 
//		Commend 에 일을 시키고  
//		결과를 받아 반환값을 이용해서 다시 view로 응답(Response)
//		
		
		
		Scanner input = new Scanner(System.in);
		
		String query = null;

		while(true) {
			System.out.println("SQL문을 입력하세요(insert,update,select,delete");		
			query=input.next();

//			MemberCommend n = new Member+null+Do();
			
			
			
			if(query.equals("insert")) {
			MemberCommend m = new MemberInsertDo();
			m.excuteQueryCommend();
			} else if(query.equals("update")) {
				MemberCommend m = new MemberUpdateDo();
				m.excuteQueryCommend();
			} else if(query.equals("select")) {
				MemberCommend m = new MemberSelectDo();
				m.excuteQueryCommend();
			} else if(query.equals("delete")) {
				MemberCommend m = new MemberDeleteDo();
				m.excuteQueryCommend();
			} else if(query.equals("exit")) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("입력오류");
			}
		}



			
			
		
		
		
	}
}
