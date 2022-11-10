package org.study.oop;

import java.util.Scanner;

public class ConstructExMain {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		ConstructEx c1 = new ConstructEx();

		ConstructEx c2 = new ConstructEx(10, 200);
		
		System.out.print("첫번째 숫자 입력 : ");
		int i = scn.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int s = scn.nextInt();
		System.out.print("연산자 입력 : ");
		String oop = scn.next();
		
		
		ConstructEx c3 = new ConstructEx(i, s, oop);

//		System.out.println(c3.getNum1());
//		System.out.println(c3.getNum2());
//		System.out.println(c3.getOp());

		
		
		int num1 = c3.getNum1();
		int num2 = c3.getNum2();
		String op = c3.getOp();
		

		if(op.equals("+")) {
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		} else if (op.equals("-")) {
			System.out.println(num1+"-"+num2+"="+(num1-num2));			
		} else if (op.equals("*")) {
			System.out.println(num1+"*"+num2+"="+(num1*num2));			
		} else if (op.equals("/")) {
			System.out.println(num1+"/"+num2+"="+(num1/(double)num2));			
		} else if (op.equals("%")) {
			System.out.println(num1+"%"+num2+"="+(num1%num2));			
		} else {
			System.out.println("머함");
		}
		
		
		
		
		
		
		
	}


	
}
