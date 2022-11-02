package org.study.operatorEx2;

import java.util.Scanner;

public class Operator9 {
	public static void main(String[] args) {

		System.out.println("비트 연산자");

		// 1은 트루 0은 false라 이해했음
		System.out.println(1 & 1);
		System.out.println(1 & 0);
		System.out.println(0 & 1);
		System.out.println(0 & 0); // &는 둘다 true 여야 true 아니면 false
		System.out.println(10 & 12); // 10은 2진수 1010, 12는 2진수 1100 &로 1000

		System.out.println(1 | 1);
		System.out.println(1 | 0);
		System.out.println(0 | 1);
		System.out.println(0 | 0); // |는 하나만 false 면 false, 둘다 true여야 true
		System.out.println(10 | 12); // 10은 2진수 1010, 12는 2진수 1100 |로 1110

		System.out.println(1 ^ 1);
		System.out.println(1 ^ 0);
		System.out.println(0 ^ 1);
		System.out.println(0 ^ 0); // ^는 서로 다르면 true, 서로 같으면 false
		System.out.println(10 ^ 12); // 10은 2진수 1010, 12는 2진수 1100 |로 0110

		System.out.println("=================");

		int i1 = 10;
		int i2 = 0b111; // 진수 = 7
		int i3 = 0111; // 8진수 = 73
		int i4 = 0xaaa; // 16진수 = ?

//10진수  1 1 1
//      10^2+10^1+10^0
//2진수    1 1 1
//     2^2+2^1+2^0
		System.out.println("=================");

		System.out.println(10 & 12);
		System.out.println(Integer.toBinaryString(10 & 12));

		System.out.println("=================");

		Scanner input = new Scanner(System.in);

		System.out.println("첫번째 숫자 입력: ");
		int num1 = input.nextInt();

		System.out.println("두번째 숫자 입력: ");
		int num2 = input.nextInt();

		System.out.println("수행할 연산자입력.(&,|,^) ");
		String op = input.next();

		if (op.equals("&")) {
			String binary = Integer.toBinaryString(num1 & num2);
			System.out.println(num1 & num2); // 10진수
			System.out.println(binary); // 2진수 문자열
		} else if (op.equals("|")) {
			String binary = Integer.toBinaryString(num1 | num2);
			System.out.println(num1 | num2); // 10진수
			System.out.println(binary); // 2진수 문자열
		} else if (op.equals("^")) {
			String binary = Integer.toBinaryString(num1 ^ num2);
			System.out.println(num1 ^ num2); // 10진수
			System.out.println(binary); // 2진수 문자열
		} else {
			System.out.println("연산자 입력 오류 다시 입력해주세요.");
		}

		input.close();

	}
}
