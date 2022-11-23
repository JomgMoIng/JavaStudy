package org.study.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.study.collection.MemberDto;

public class MemberController2 {

	public static void main(String[] args) {

		//Scanner 이용 아이디, 비밀번호, 이메일, 나이
		ArrayList<org.study.dto.MemberDto> lists = new ArrayList<org.study.dto.MemberDto>();
		
		Scanner input = new Scanner(System.in);
		
		//exit가 입력되면 회원가입 종료 > 모든 회원목록 콘솔에 출력
		
		while(true) {
			

		
		System.out.println("종료 하려면 exit 입력");
		String s = input.next();
		if(!s.equals("exit")) {
			System.out.println("회원가입 실행");
			
			System.out.println("아이디를 입력하세요");
			String userId = input.next();
			System.out.println("비밀번호를 입력하세요");
			String userPw = input.next();
			System.out.println("이메일를 입력하세요");
			String useremail = input.next();
			System.out.println("나이를 입력하세요");
			int userage = input.nextInt();
			


			lists.add(new org.study.dto.MemberDto(userId, userPw, useremail, userage));
		} else {
			break;
			
		}
		
		
		}
		
		System.out.println("회원 명단");
		
		for(org.study.dto.MemberDto  dto : lists) {
			System.out.print("아이디 : "+dto.getUserId()+" ");
			System.out.print("비밀번호 : "+dto.getUserPw()+" ");
			System.out.print("이메일 : "+dto.getEmail()+" ");
			System.out.println("나이 : "+dto.getAge()+" ");
		}
		
		
	}
}
