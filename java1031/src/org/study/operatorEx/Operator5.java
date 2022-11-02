package org.study.operatorEx;

import java.util.Scanner;

public class Operator5 {
	public static void main(String[] args) {

		System.out.println("조건 연산자");

		String userId = "m111";
		String userPw = "1111";


		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("=============");
		System.out.println(!false);
		System.out.println(!true);
//아이디가 틀리거나 비밀번호가 틀리거나
		System.out.println("=============");

	Scanner scn = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요");
		String id = scn.next();

		System.out.println("비밀번호를 입력하세요");
		String pw = scn.next();
		
		if(!userId.equals(id) || !userPw.equals(pw)) {
			System.out.println("아이디나 비밀번호가 틀렸습니다");
		}else {
			System.out.println("로그인성공");
		}
		System.out.println("=============");

		
		
		
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);


	}
}
