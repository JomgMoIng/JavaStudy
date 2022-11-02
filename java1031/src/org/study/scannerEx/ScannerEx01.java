package org.study.scannerEx;

import java.util.Scanner;
// import java.util.*;  자바 유틸에 있는 것 다 갖고오는 것
public class ScannerEx01 {

	public static void main(String[] args) {
		System.out.println("Scanner");
		//프로그래머가 입력
		
		Scanner scn = new Scanner(System.in);
		//주소를 입력 하려면 공백이 필요하니 nextLine 이용
		System.out.print("주소를 입력하세요 > ");
		String addr=scn.nextLine(); // 입력문자열을 return;
		// 문자열이라 스트링으로 받음
		System.out.print("주소 : " + addr);

		System.out.print("이름을 입력하세요 > ");
		String name=scn.next(); //공백 X
		System.out.print("이름 : " + name);

		System.out.print("나이를 입력하세요 > ");
		int age= scn.nextInt();
		System.out.print("나이 : " + age);
		
		System.out.print("키를 입력하세요 >");
		double hei= scn.nextDouble();
		System.out.print("키 : " + hei);
	}
	
	
//	시스템 입력
//	Scanner > 문자, 정수, 실수, boolean, 문자열 등 입력
// java.util.Scanner; > rt.jar
	//	java.util
//	Scanner scn = new Scanner(System.in);
//	scn.next(); // 문자열 입력(공백X, 단어, "이름", "문자열")
//	scn.nextLine(); // 문자열 입력(공백O, "문자열 입력 123")
//	scn.nextInt(); // 정수형 입력
//	scn.nextDouble(); // 실수형 입력
//	
	
	
}
