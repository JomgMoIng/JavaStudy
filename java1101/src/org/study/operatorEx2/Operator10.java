package org.study.operatorEx2;

import java.util.Scanner;

public class Operator10 {
	public static void main(String[] args) {

		System.out.println("쉬프트 연산자");
		
		// "<< , >> " 왼쪽이나 오른쪽 쉬프트 연산자를 쓰면 2진수 두자리씩 그 방향으로 밀려난다(소수점 짤림)
		int i = 15;
		
		System.out.println("오른쪽 shift연산자");
		System.out.println("15 > " + Integer.toBinaryString(i));
		System.out.println("15 >> 2 " + Integer.toBinaryString(i>>2));
		System.out.println("10진수 결과 : "+(i>>2));
		System.out.println("2진수 결과 : "+Integer.toBinaryString(i>>2));

		System.out.println("왼쪽 shift연산자");
		System.out.println("15 > " + Integer.toBinaryString(i));
		System.out.println("15 << 2 " + Integer.toBinaryString(i<<2));
		System.out.println("10진수 결과 : "+(i<<2));
		System.out.println("2진수 결과 : "+Integer.toBinaryString(i<<2));

	}
}
