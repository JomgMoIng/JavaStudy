package org.study.controller;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import org.study.commend.DBQueryCommend;
import org.study.commend.MemberDeleteCommend;
import org.study.commend.MemberInsertCommend;
import org.study.commend.MemberSelectCommend;
import org.study.commend.MemberUpdateCommend;
import org.study.dto.Member;

public class MemberController {

	public static void main(String[] args) {
		
		// Scanner이용, while(true) 이용
		// query > insert 면 콘솔에 "회원가입 Commend"
		// query > delete 면 콘솔에 "회원탈퇴 Commend"
		// query > update 면 콘솔에 "회원수정 Commend"
		// query > select 면 콘솔에 "회원조회 Commend"
		// query > exit 면 콘솔에 "종료"
		// query > 나머지면 "입력쿼리 오류"
		
		// 다형성 이용해서 DBQueryCommend(부모타입)의 참조변수를 이용
		// 상속을 통해서 excuteQueryCommend() 오버라이드 해서
		// 서브(자식)클래스를 객체를 이용해서 구현하시오
		
		Scanner input = new Scanner(System.in);
		
		
		DBQueryCommend str = null;
		String query = "";
		
		Member m1 = new Member("m1", "1111", 20, "@gmail.com");

		while(true) {
			System.out.println("커멘드 입력 : ");
			query = input.next();
			if(query.equals("insert")){
				str = new MemberInsertCommend();
				str.excuteQueryCommend();
			} else if(query.equals("delete")) {
				str = new MemberDeleteCommend();
				str.excuteQueryCommend();
			} else if(query.equals("select")) {
				str = new MemberSelectCommend();
				str.excuteQueryCommend();
			} else if(query.equals("update")) {
				str = new MemberUpdateCommend();
				str.excuteQueryCommend();
			} else if(query.equals("exit")) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("입력쿼리 오류");
			}
		}
		
		
		
		
		
		


		
		
		
		
		
	}
}
