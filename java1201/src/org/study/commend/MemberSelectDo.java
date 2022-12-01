package org.study.commend;

import java.util.ArrayList;
import java.util.Scanner;

import org.study.dao.MemberDao;
import org.study.dto.MemberDto;

public class MemberSelectDo implements MemberCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원조회");

		MemberDao dao = new MemberDao();
		
		ArrayList<MemberDto> lists = dao.selectDo();

		if(lists!=null) {
			System.out.println("회원조회 성공");
			// lists에 모든 요소를 출력

			for(MemberDto list :lists) {
				System.out.print(list.getUserId()+" ");
				System.out.print(list.getUserPw()+" ");
				System.out.println(list.getAge());
			}
		
		}else {
			System.out.println("회원조회 실패");
		}
		
	}

	
}
