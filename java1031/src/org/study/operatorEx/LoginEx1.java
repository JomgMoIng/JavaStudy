package org.study.operatorEx;

import java.util.Scanner;

public class LoginEx1 {

	public static void main(String[] args) {
		// id,pw를 scanner입력을 받아서
		// id가 일치하면 "아이디가 일치합니다"
		// pw가 일치하면 "아이디가 일치합니다"
		// 콘솔에 출력하는 프로그램을 만들어 보세요
		// if문(조건1 > 2개), equals, System.put.print(), Scanner이용

		String UserId = "m111";
		String UserPw = "1111";

		Scanner scn = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 : ");
		String id = scn.next();
		
		System.out.print("비밀번호를 입력하세요 : ");
		String pw = scn.next();
		
		if (id.equals(UserId)) {
			System.out.println("아이디가 일치합니다");
		}else {
			System.out.println("아이디가 일치하지않습니다");
		}

		if (pw.equals(UserPw)) {
			System.out.println("비밀번호가 일치합니다");
		}else {
			System.out.println("비밀번호가 일치하지않습니다");
		}

		
		
		
		scn.close();
		
		
	}
}
