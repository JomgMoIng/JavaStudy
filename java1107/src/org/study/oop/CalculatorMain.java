package org.study.oop;

import java.util.Scanner;

public class CalculatorMain {

public static void main(String[] args) {
	
	// calculator 생성 한 후에 필드 num1, num2, op를 초기화 한 후
	// 매서드 sum(+), sub(-), muti(*), div(/),rem(%)
	// op에 따라서 +-*/% > if~else if이용해서
	// 호출하는 프로그램을 작성하시오

	Scanner input = new Scanner(System.in);
	
	
	Calculator c1 = new Calculator();
	
	while(true) {
	
	System.out.println("첫번째 수를 입력하세요");
	c1.num1= input.nextInt();
	System.out.println("두번째 수를 입력하세요");
	c1.num2= input.nextInt();
	System.out.println("연산자를 입력하세요");
	c1.op = input.next();
	
	
	
	if(c1.op.equals("+")) {
		c1.sum();
	}else if(c1.op.equals("-")) {
		c1.sub();
	}else if(c1.op.equals("*")) {
		c1.muti();
	}else if(c1.op.equals("/")) {
		c1.div();
	}else if(c1.op.equals("%")) {
		c1.rem();
	}else if(c1.op.equals("exit")) {
		break;
	}else {
		System.out.println("망함");
	}
	}
	
	
	
	
	input.close();
	
}

	
}
