package org.study.operatorEx;

import java.util.Scanner;

public class Operator2 {

	public static void main(String[] args) {
		
		System.out.println("대입 연산자");
	
		int i=10;
		char ch='a';
		
		int j=10+50*19;
		
		String str1=new String();
		str1="string > 문자열";
		
		System.out.println("복합대입연산자");
		
		int num=10; 
		num=num+10; //num+=10;
		System.out.println(num);
		num=num-10; //num-=10;
		System.out.println(num);
		num*=10; //num=num*10;
		System.out.println(num);
		num/=10; //num=num/10;
		System.out.println(num);
		num%=10; //num=num%10;
		System.out.println(num);

		System.out.println("비교연산자");

		Scanner scn=new Scanner(System.in);
		System.out.println("숫자1 : ");
		int num1=scn.nextInt();
		
		System.out.println("숫자2 : ");
		int num2=scn.nextInt();

System.out.println(num1 > num2);
		
		int d=10;
		int c=20;
		//비교연산자 >, >=, <, <=, ==(같나), !=(같지않나)
		
		System.out.println(d!=c);

if(d>9) {
	System.out.println("10보다 큽니다.");
}
	
if(c>9)System.out.println("10보다 큽니다.");
	
	int age=11;
	String strAge="11";
	// System.out.println(age==strAge);

	System.out.println(strAge.equals("11"));


	
	}
	
}
