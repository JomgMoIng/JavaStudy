package org.project.commend;

import java.util.List;
import java.util.Scanner;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;

public class MemberSelectAgeDo implements MemberCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("30대 회원을 출력");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("시작나이 : ");
		int ageStart = input.nextInt();
		System.out.println("끝나이 : ");
		int ageEnd = input.nextInt();
		
		MemberDao dao = new MemberDao();

		List<MemberDto> members = dao.selectAge(ageStart, ageEnd);
//		List<MemberDto> members = dao.selectAge(ageStart, ageEnd);
		
		if(members!=null) {
			System.out.println("회원조회 실패");
		} else {
			for(MemberDto member:members) {
				System.out.print(member.getUserId()+" \t");
				System.out.print(member.getUserPw()+" \t");
				System.out.print(member.getAge()+" \t");
				System.out.println(member.getEmail()+" \t");
			}
		}
	}

}
