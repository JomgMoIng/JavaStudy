package org.study.conditionEx;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		System.out.println("조건이 두개 일때");
		//아이디 비밀번호를 입력받아서
		//아이디와 비밀번호가 일치하면 로그인 성공
		//하나라도 틀리면 로그인 실패
		
		System.out.print("아이디 입력 : ");
		System.out.print("비밀번호 입력 : ");

		String id="m111";
		String pw="1111";
		
		Scanner input = new Scanner(System.in);
		
		String userId=input.next();
		String userPw=input.next();
				
		if(userId.equals(id) && userPw.equals(pw)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
//		부정을 붙였지만 뒤바꿔서 위와 값은 같음
//		if(!userId.equals(id) || !userPw.equals(pw)) {
//			System.out.println("로그인 실패");
//		}else {
//			System.out.println("로그인 성공");
//		}
		
			
		
		
		
		
		
		input.close();
		
		
		
	}
	
	
	
}

