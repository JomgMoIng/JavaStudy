package org.study.operatorEx;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {

		// Scanner를 이용해서 정수를 입력받아서 홀짝프로그램을 수행하시오.
		// Scanner, If문, 산출연산자...
		// 출력값이 "짝수입니다", "홀수입니다" 으로 출력해보세요
		System.out.println("정수(양의정수)를 입력하시오");
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 값 : ");
		int num1 = scn.nextInt();

		if (num1 % 2 == 0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}

		scn.close();

	}
}
