package org.study.test;

import java.util.Scanner;

public class ActionQuerySol extends OverrideBasic{

	Scanner scn = new Scanner(System.in);
	@Override
	public void excuteQuery() {
		// TODO Auto-generated method stub
		System.out.print("회원 가입 입력 :");
		String userId = scn.next();
		System.out.println(userId);
	}
}
