package org.study.oop3;

public class MethodMain {
	
	public static String userId; // > static없이 사용불가
	public static final String PROJECT = "PROJECT2022";

public static void main(String[] args) {
//	클래스 매소드는 스태틱이 아닌것을 참조 할수 없다 >> method0()
	userId = "m111"; //static 매서드는 static 필드 사용  
	
	MethodBasic method1 = new MethodBasic();
	//0
	method1.method0();
	
	//1
	method1.method1();
	//2
	System.out.println(method1.method2());
	int sum = method1.method2();
	System.out.println(sum);
	//3
	method1.method3(100, 200);
	//4
	System.out.println(method1.method4(20, 30));
	int sum2 = method1.method4(20, 30);
	System.out.println(sum2);
	
	
	method1.classMethod1();
	
	
	
}	
	
	
}
