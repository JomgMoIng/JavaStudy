package org.study.commend;

import java.util.Scanner;

import org.study.dao.MemberDao;

public class MemberUpdateDo implements MemberCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원수정");
		
		MemberDao dao = new MemberDao();

		Scanner input = new Scanner(System.in);
		
		System.out.println("아이디 : ");
		String userId = input.next();
		System.out.println("비밀번호 : ");
		String userPw = input.next();
		System.out.println("나이 : ");
		int age = input.nextInt();
		
		int result =dao.insert(userId,userPw,age);
		
		System.out.println(result);
		
	}

	
}
