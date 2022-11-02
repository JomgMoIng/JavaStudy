package org.study.operatorEx2;

import java.util.Scanner;

public class Operator8 {
	public static void main(String[] args) {

		System.out.println("조건 연산자");
		
		int i = 10;
		if(i>10) {
			System.out.println("10보다 큽니다.");
		}else {
			System.out.println("10보다 크지 않습니다");
		}
		
		boolean rs=i>10?true:false;
		System.out.println(rs);
		
		String str=i>10?"10보다 큽니다":"10보다 같거나 크지않습니다";
		System.out.println(str);
		
		
//		System.out.println("정수(양의정수)를 입력하시오");
//		Scanner scn = new Scanner(System.in);
//		System.out.print("정수 값 : ");
//		int num1 = scn.nextInt();
//
//		String str = (num1 % 2 == 0) ? "짝수입니다" : "홀수입니다";
//		System.out.println(str);

//		위아래 이 두개는 같은 내용

		
		//		if (num1 % 2 == 0) {
//			System.out.println("짝수입니다");
//		} else {
//			System.out.println("홀수입니다");
//		}

		
	}
}
