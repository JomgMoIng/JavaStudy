package org.study.controller;

import java.util.ArrayList;
import java.util.Iterator;

import org.study.collection.MemberDto;

public class MemberController {

	public static void main(String[] args) {
		
		//ArrayList 생성, 요소는 MemberDto
		
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		
		//Lists 요소 5개 생성 MemberDto userId는 중복불가
		//for문 foreach문 콘솔에 출력
		// 아이디 : ~, 비밀번호 : ~, 이메일 : ~, 나이 : ~
		
		
		
		lists.add(new MemberDto("aa", "11", "ㄱGmail", 1));

				
		if(!lists.contains(lists.get(0).getUserId())) {
			lists.add(new MemberDto("bb", "22", "ㄴGmail", 2));
			if(!lists.contains(lists.get(0).getUserId()) && !lists.contains(lists.get(1).getUserId())) {
				lists.add(new MemberDto("cc", "33", "ㄷGmail", 3));
				if(!lists.contains(lists.get(0).getUserId()) && !lists.contains(lists.get(1).getUserId()) &&!lists.contains(lists.get(2).getUserId()) ) {
					lists.add(new MemberDto("dd", "44", "ㄹGmail", 4));
					if(!lists.contains(lists.get(0).getUserId()) && !lists.contains(lists.get(1).getUserId()) &&!lists.contains(lists.get(2).getUserId())&&!lists.contains(lists.get(3).getUserId()) ) {
						lists.add(new MemberDto("ee", "55", "ㅁGmail", 5));
					}
				}
			}
		}
		
		System.out.println(lists.get(0).getUserId());
		System.out.println(lists.get(1).getUserId());
		System.out.println(lists.get(2).getUserId());
		System.out.println(lists.get(3).getUserId());
		System.out.println(lists.get(4).getUserId());

		for(int i=0;i<lists.size();i++) {
			System.out.print("아이디 : "+lists.get(i).getUserId()+" ");
			System.out.print("비밀번호 : "+lists.get(i).getUserPw()+" ");
			System.out.print("이메일 : "+lists.get(i).getUserName()+" ");
			System.out.println("나이 : "+lists.get(i).getUserage()+" ");
		}
		
		for(MemberDto i : lists) {
			for(MemberDto dto : lists) {
				
				System.out.print("아이디 : "+dto.getUserId()+" ");
				System.out.print("비밀번호 : "+dto.getUserPw()+" ");
				System.out.print("이메일 : "+dto.getUserName()+" ");
				System.out.println("나이 : "+dto.getUserage()+" ");
			}
		}

		Iterator<MemberDto> iter = lists.iterator();
		
		while(iter.hasNext()) {
			MemberDto s = iter.next();
			System.out.print("아이디 : "+s.getUserId()+" ");
			System.out.print("비밀번호 : "+s.getUserPw()+" ");
			System.out.print("이메일 : "+s.getUserName()+" ");
			System.out.println("나이 : "+s.getUserage());
		}
		
		String str1="문자열";
		String str2=new String("문자열");
		 System.out.println(str1.equals(str2));
		
		
	}
}
