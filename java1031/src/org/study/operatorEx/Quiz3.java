package org.study.operatorEx;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {

// Scanner를 이용하여, 두 정수(int num1, int num2) 와 연산자
// (+ - * / %)중 하나를 입력받아서
//	연산자가 + 면 num1+num2
//	연산자가 - 면 num1+num2
//	연산자가 * 면 num1+num2
//	연산자가 / 면 num1+num2
//	연산자가 & 면 num1+num2 를 콘솔에 출력하시오
//	ex) 연산자가 +, num1=10, num2=20 > 10+20 콘소렝출력

		System.out.println("숫자를 입력하시오");
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		System.out.println("기호를 입력하시오");
		String str = scn.next();
		System.out.println("숫자를 입력하시오");
		int num2 = scn.nextInt();

		if (str.equals("+")) {
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		} else {
			if (str.equals("-")) {
				System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			} else {
				if (str.equals("*")) {
					System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
				}else {
					if (str.equals("/")) {
						System.out.println(num1 + "/" + num2 + "=" + (num1 /(double)num2));
					}else {
						if (str.equals("%")) {
							System.out.println(num1 + "%" + num2 + "=" + (num1 % (double)num2));
						}
					}
				}
			}
		}

	}
}
