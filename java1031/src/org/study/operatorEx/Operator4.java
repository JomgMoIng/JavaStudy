package org.study.operatorEx;

import java.util.Scanner;

public class Operator4 {
	public static void main(String[] args) {

		System.out.println("조건 연산자");

		String userId = "m111";
		String userPw = "1111";

		System.out.println(userId.equals("m111") && userPw.equals("1111") );
		System.out.println(userId.equals("m111") && userPw.equals("2222") );
		System.out.println(userId.equals("m222") && userPw.equals("1111") );
		System.out.println(userId.equals("m222") && userPw.equals("2222") );
		System.out.println("==================");
//		조건1 && 조건2 > 모든조건이 true 일때만 true		
//		System.out.println(true && true);
//		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
		
//아이디와 비밀번호가 동시에 일치하면 "로그인 성공", 그렇지 않으면 "로그인 실패"
// 콘솔에 출력
// Scanner, 아이디 > id , 비밀번호 > pw 입력을 받아서
		// userId, userPw가 동시에 일치하는 프로그래밍을 해보세요.	
		//&, if else
		

		Scanner scn = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요");
		String id = scn.next();

		System.out.println("비밀번호를 입력하세요");
		String pw = scn.next();

		if (id.equals(userId) && pw.equals(userPw)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}


		
		
	}
}
