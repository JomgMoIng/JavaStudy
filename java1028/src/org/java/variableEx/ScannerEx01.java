package org.java.variableEx;

import java.util.Scanner; // java 기본클래스은 기본으로 안가져와도된다
//						다른 클래스꺼는 기본적으로 가져와야됨

public class ScannerEx01 {
	
public static void main(String[] args) {
	
	System.out.println("Scanner");
	
		System.out.println("데이터를 입력하세요:");
			Scanner scn=new Scanner(System.in);
	String str1=scn.nextLine();

	System.out.println("입력값 : " + str1);

	System.out.print("나이 입력 : ");
		int age=scn.nextInt();

		System.out.print(	"당신의 나이 : " +age);

	

		scn.close();

}
}
