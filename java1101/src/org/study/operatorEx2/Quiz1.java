package org.study.operatorEx2;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {

//		대문자를 입력받아서 소문자 변경
//		소문자를 입력받아서 대문자 변경

		System.out.println("대문자를 입력받아서 소문자 변경");
		Scanner input = new Scanner(System.in);

		
		
		char ch = input.next().charAt(0);
		
		System.out.println("Ch > "+(char)(ch+32));
		
		System.out.println("소문자를 입력받아서 소문자 변경");
		
		char ch2 = input.next().charAt(0);
		
		System.out.println("ch2 > "+(char)(ch2-32));


		
		
		
		input.close();

	}
}
