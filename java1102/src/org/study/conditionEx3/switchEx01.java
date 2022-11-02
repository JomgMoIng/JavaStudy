package org.study.conditionEx3;

import java.util.Scanner;

public class switchEx01 {

	public static void main(String[] args) {
		System.out.println("switch");

		Scanner input = new Scanner(System.in);
		System.out.println("key값 입력 : ");
		int key = input.nextInt();

		switch (key) {
		case 1:
			System.out.println("관리자권한");
			break;
		case 2:
			System.out.println("중간관리자권한");
			break;
		case 3:
			System.out.println("일반사원권환");
			break;
		default:
			System.out.println("접속불가.. 관리자에서 문의");
		}

		
		
		
	}
}
