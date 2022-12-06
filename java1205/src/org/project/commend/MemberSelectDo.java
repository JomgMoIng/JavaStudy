package org.project.commend;

import java.util.ArrayList;
import java.util.List;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;

public class MemberSelectDo implements MemberCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원조회");
		
		MemberDao dao = new MemberDao();
		
		List<MemberDto> lists = dao.selectDo();
				
				if(lists!=null) {
					System.out.println("회원조회 성공");
					
					for(MemberDto list :lists) {
						System.out.print(list.getUserId()+" \t");
						System.out.print(list.getUserPw()+" \t");
						System.out.print(list.getAge()+" \t");
						System.out.println(list.getEmail()+" \t");
					}
				} else {
					System.out.println("회원조회 실패");
				}
		
		
		
	}

	
}
