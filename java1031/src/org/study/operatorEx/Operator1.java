package org.study.operatorEx;

import java.util.Scanner;

public class Operator1 {

	public static void main(String[] args) {
		
		System.out.println("산술연산자");
		
//		int num1=10;
//		int num2=20;

//		System.out.println(num1+"+"+num2+"="+(num1+num2));
//		System.out.println(num1+"-"+num2+"="+(num1-num2));
//		System.out.println(num1+"*"+num2+"="+(num1*num2));
//		System.out.println(num1+"/"+num2+"="+(num1/(double)num2));
//		System.out.println(num1+"%"+num2+"="+(num1%num2));
//		
		
		System.out.println("두숫자(정수)를 입력받아서 산술연살을 하시오");
		
		Scanner scn=new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int num1=scn.nextInt();
		
		System.out.print("두번째 숫자: ");
		int num2=scn.nextInt();
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / (double)num2);
		System.out.println(num1 % num2);
		
		
		
		
		
		
	}
}
