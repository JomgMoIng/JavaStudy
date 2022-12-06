package org.project.commend;

import java.util.Scanner;

import org.project.dao.MemberDao;

public class MemberDeleteDo implements MemberCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원삭제");
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("아이디  : ");
		String userId = input.next();
		
		MemberDao dao = new MemberDao();
		
		int result = dao.deleteDo(userId);
		
		if(result!=1) {
			System.out.println("회원삭제 실패");
		}else {
			System.out.println("회원삭제 성공");
		}
		
		System.out.println(result);
		
		
		
	}

	
}
