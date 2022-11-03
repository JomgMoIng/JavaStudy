package org.study.loopEx1;

import java.util.Scanner;

public class whileEx06 {
	public static void main(String[] args) {
		System.out.println("while(ture)");
		// while(true) 문으로 로그인 만들어 보기
		// 아이디와 비밀번호가 일치하면 while 문을 종료("로그인성공")
//	일치하지 않으면 "로그인실패"출력하고 다시입력
//	while, if break, Scanner

		String dbId = "root";
		String dbPw = "1111";

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("아이디를 입력하세요");
			String a = input.next();
			System.out.println("비밀번호를 입력하세요");
			String b = input.next();

			if (a.equals(dbId) && b.equals(dbPw)) {
				System.out.println("로그인 성공");

				break;
			} else {
				System.out.println("로그인 실패");
			}

		}

		input.close();

	}
}
