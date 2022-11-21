package org.study.generic;

public class GenericExMain<T> {

	public static void main(String[] args) {
	
	//제네릭 타입
	GenericEx1<Integer> g1 = new GenericEx1<Integer>();	
	
//	
	g1.t1 = new Integer(10);

//	자동 박싱으로 인트형 넣어도 사용가능
//	g1.t1=10;
	
	
	int num1 = g1.m1(10).intValue(); //언박싱
		
//	자동 언박싱
//	int num1 = g1.m1(10);
	
	GenericEx1<String> g2 = new GenericEx1<String>();
	
	g2.t1 = "s";
	
	g2.m1("String Type");
	
	System.out.println(g1.t1);
	System.out.println(num1);
	System.out.println(g2.t1);
	System.out.println(g2.m1("문자열"));
	
	
	
	
	
	
	
	}
	
}
