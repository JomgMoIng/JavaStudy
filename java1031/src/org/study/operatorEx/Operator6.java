package org.study.operatorEx;

import java.util.Scanner;

public class Operator6 {
	public static void main(String[] args) {

		System.out.println("논리 연산자");
		System.out.println("&&"); // 모든 조건이 true 일때 true
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("||"); // 하나이상의 조건이 true 일때 true
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println("^"); // 서로 값이 다르면 true
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);

		String userId="m111";
		String userPw="1111";
		System.out.println("로그인--------------");
		System.out.println(userId.equals("m111"));
		System.out.println(userPw.equals("1111"));
		
		System.out.println("로그인 boolean--------------");
		Boolean bool1=userId.equals("m111");
		Boolean bool2=userPw.equals("1111");
		
//		System.out.println(bool1 && bool2); 둘다 트루라 투르
//		System.out.println(bool1 || bool2); 하나라도 투르라 투르
		System.out.println(!bool1 || bool2);
		System.out.println(bool1 || !bool2);
		System.out.println(!bool1 || !bool2); //둘다 트루지만 부정이 둘다 붙어 false

		
		
		
		
	}
}
