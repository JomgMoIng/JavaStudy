package org.study.controller;

import java.util.ArrayList;
import java.util.Scanner;

import org.study.dto.MemberDto2;

public class MemberDto2Controller {

	public static void main(String[] args) {

		ArrayList<MemberDto2> lists = new ArrayList<MemberDto2>();

		Scanner input = new Scanner(System.in);

		System.out.println("회원가입");

		String key = "exit";

		while (true) {

			System.out.println("종료 하려면 exit 입력");
			String s = input.next();

			if (s.equals(key)) {

				break;

			} else {

				System.out.println("아이디를 입력하세요");
				String userId = input.next();
				System.out.println("이메일을 입력하세요");
				String email = input.next();
				System.out.println("전화번호를 입력하세요");
				String phone = input.next();
				System.out.println("나이를 입력하세요");
				int age = input.nextInt();

				lists.add(new MemberDto2(userId, email, phone, age));

			}
		}

		System.out.println("회원 정보");
		
		for(MemberDto2 dto : lists) {
			System.out.print("아이디 : " +dto.getUserId()+" ");
			System.out.print("이메일 : " +dto.getEmail()+" ");
			System.out.print("전화번호 : " +dto.getPhone()+" ");
			System.out.println("나이 : " +dto.getAge());
		}
		
		System.out.println("로그인 아이디");
		String logId = input.next();

		System.out.println("로그인 이메일");
		String logemail = input.next();

		Integer i = null;

		for(i=0;i<lists.size();i++) {
			String id = lists.get(i).getUserId();
			String email = lists.get(i).getEmail();
			
			if(id.equals(logId) && email.equals(email)) {
				System.out.println("로그인 성공");
			} else {

			}
			
		}

		
//		if(lists.get(0).getUserId().contains(logId) && lists.get(0).getEmail().contains(logemail)) {
//			System.out.println("로그인 성공");			
//		}else if(lists.get(1).getUserId().contains(logId) && lists.get(1).getEmail().contains(logemail)) {
//			System.out.println("로그인 성공");
//		}else if(lists.get(2).getUserId().contains(logId) && lists.get(2).getEmail().contains(logemail)) {
//			System.out.println("로그인 성공");
//		}else if(lists.get(3).getUserId().contains(logId) && lists.get(3).getEmail().contains(logemail)) {
//			System.out.println("로그인 성공");
//		}else if(lists.get(4).getUserId().contains(logId) && lists.get(4).getEmail().contains(logemail)) {
//			System.out.println("로그인 성공");
//		}else {
//			System.out.println("로그인 실패");
//		}
		
		
	}
}
