package org.project.commend;

import java.util.Scanner;

import org.project.dao.MemberDao;

public class MemberUpdateDo implements MemberCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원수정");
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("아이디 : ");
		String userId = input.next();
		System.out.println("비밀번호 : ");
		String userPw = input.next();
		System.out.println("나이 : ");
		int age = input.nextInt();
		System.out.println("이메일 : ");
		String email = input.next();
		
		MemberDao dao = new MemberDao();
		
		int result = dao.updateDo(userId, userPw, age, email);
		
		if(result!=1) {
			System.out.println("회원수정 실패");
		} else {
			System.out.println("회원수정 성공");
		}
		System.out.println(result);
		
	}

	
}
