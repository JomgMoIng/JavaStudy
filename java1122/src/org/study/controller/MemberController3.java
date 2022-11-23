package org.study.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.study.collection.MemberDto;

public class MemberController3 {

	public static void main(String[] args) {


		ArrayList<org.study.dto.MemberDto> lists = new ArrayList<org.study.dto.MemberDto>();
		

		lists.add(new org.study.dto.MemberDto("m1", "11", "m1@gmail.com", 11));

		String userId = lists.get(0).getUserId();
		String userPw = lists.get(0).getUserPw();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		String id = input.next();
		System.out.print("비밀번호 입력 : ");
		String pw = input.next();
		
		if(userId.equals(id) && userPw.equals(pw)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
	}
}
