package org.study.oop;

public class MethodEx {
	
	// 반환타입 X, 매개변수 X
	public void method1() {
		System.out.println("인스턴스 매서드 method1");
		return; //반환할것이 없으니 생략가능
	}
	
	// 반환타입 int, 매개변수 X
	public int method2() {
		int num1 = 10;
		int num2 = 20;
		
		return num1 + num2 ;
	}

	// 반환타입 String, 매개변수 X
	public String method3() {
		String name = "m111";
		return name;
	}
	
	// 반환타입 X, 매개변수 O
	public void method4(int num1, int num2) {
		int sum = num1+num2;
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	
		return; //생략가능
	}
	
	//반환타입 O, 매개변수 O
	public int method5(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("반환값 int, 매개인자 2");
		return sum;
	}
	
	
	//반환타입 O, 매개변수 O
	public void method6(int num1, int num2,String op) {
		
		if(op.equals("+")) {
		System.out.println(num1+op+num2+"="+(num1+num2));
		} else if(op.equals("-")){
		System.out.println(num1+op+num2+"="+(num1-num2));	
		} else if(op.equals("*")){
			System.out.println(num1+op+num2+"="+(num1*num2));
		} else if(op.equals("/")) {
			System.out.println(num1+op+num2+"="+(num1/(double)num2));
		} else if(op.equals("%")) {
			System.out.println(num1+op+num2+"="+(num1%num2));
					} else {
			System.out.println("연산자 입력 오류");
		}

	}
	
	
	
	
	
	

}
