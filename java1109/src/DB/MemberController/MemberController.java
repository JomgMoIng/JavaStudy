package DB.MemberController;

import java.awt.List;
import java.util.Scanner;

import DB.MemberCommend.MemberJoinCommend;
import DB.MemberDto.MemberDTO;

public class MemberController {

	public static void main(String[] args) {
		
		MemberJoinCommend commend1 = new MemberJoinCommend();
		MemberJoinCommend commend2 = new MemberJoinCommend("제목1");
		
		//회원가입 MemberDto
		//userId중복 안되게
		
		
		MemberDTO member1 = new MemberDTO("aa", "qq", 135, "sda", "sdsd");
		System.out.println(member1.getUserId());
		System.out.println(member1.getUserPw());
		System.out.println(member1.getUserAge());
		System.out.println(member1.getUserName());
		System.out.println(member1.getUserAddr());
				
		MemberDTO member2 = new MemberDTO("bb", "ww", 135, "sda", "sdsd");
		System.out.println(member2.getUserId());
		
		MemberDTO member3 = new MemberDTO("cc", "ee", 135, "sda", "sdsd");
		System.out.println(member3.getUserId());
		
		MemberDTO member4 = new MemberDTO("dd", "rr", 135, "sda", "sdsd");
		System.out.println(member4.getUserId());
		
		MemberDTO member5 = new MemberDTO("ee", "tt", 135, "sda", "sdsd");
		System.out.println(member5.getUserId());
		
		
		System.out.println("==============");
//		member1.getMemberDto();
//		member2.getMemberDto();
//		member3.getMemberDto();
//		member4.getMemberDto();
//		member5.getMemberDto();
		
//		String userId = member1.getUserId();
//		String userPw = member1.getUserPw();
//		
//		if(userId.equals("m111") && userPw.equals("1111")) {
//			System.out.println("로그인 성공");
//		} else {
//			System.out.println("로그인 실패");
//		}
		
		System.out.println("===================");
		
		Scanner input = new Scanner(System.in);
		System.out.println("회원가입");
		
		System.out.print("아이디 : ");
		String userId = input.next();
		System.out.print("비밀번호 : ");
		String userPw = input.next();
		System.out.print("나이 : ");
		int userAge = input.nextInt();
		System.out.print("이름 : ");
		String userName = input.next();
		System.out.print("주소 : ");
		String userAddr = input.next();
		
		MemberDTO member6 = new MemberDTO(userId, userPw, userAge, userName, userAddr);
		
		member6.getMemberDto();
		
		
	}
}
