package org.study.oop3;

public class MethodBasic {

	public String userId;
	
	public void method0() {
		userId="m111";
		System.out.println("id : "+userId);
	}
	
	//매서드
	//인스턴스 매서드
	//1
	public void method1() {
		System.out.println("반환 X , 매개X, method1");
		return; // 생략 가능
	}
	//2
	public int method2() {
		int num1 = 10;
		int num2 = 20;
		System.out.println("반환 O, 매개 X, method2 ");
		return num1+num2;
	}
	//3
	public void method3(int num1, int num2) {
		System.out.println("반환X, 매개O, method3");
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		return; // 생략가능
	}
	//4
	public int method4(int num1, int num2) {
		System.out.println("반환O, 매개O, method4");
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		
		return num1+num2; // 생략가능
	}
	
	//클래스 매서드
	public static void classMethod1() {
		System.out.println("클래스 매서드");
	}
	
	
	
	
	
}
