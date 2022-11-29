package org.study.GUI;

import java.util.Date;

class A{
	public A() {
		System.out.println("A기본생성자");
	}
}

interface A1{
	void m1(int a);
}

class B{
	
	A1 a1;
	A a;
	Date day;
		
	public B() {
		System.out.println("B 기본생성자");
	}
	
	public B(A a) {	// > 생성자 통해서 주입(DI)
		this.a=a;
	}
					// > 매서드를 통해서 주입
	public void dayMethod(Date day) {
		this.day=day;
		System.out.println();
	}
	
	
	public A getA() {
		return a;
	}

	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public void setA(A a) {
		this.a = a;
	}
	
	public void inerM(A1 a1) {
		this.a1=a1;
	}
}

public class ClassDI {
							//매개변수
	public static void strM(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
				//매개인자
		strM(new String("문자열"));	//call (원래는 이렇게 넣는게 맞음)
		strM("문자열");	//이렇게도넣을수 있음
		
		
		//매개변수에 객체 타입
		new B(new A());	//객체가 들어가기때문에 new로 넣어줘야한다

//		new B().inerM(new A1());	// 인터페이스기때문에 불가
	
		//매개변수에 인터페이스 > 익명클래스
		new B().inerM(new A1() {
			
			@Override
			public void m1(int a) {
				System.out.println("A1 인터페이스 inerM 매서드구현 > 익명클래스");
				// 인터페이스기때문에 오버라이딩해야함				
			}
		});	
		//매개변수에 인터페이스 > 람다식
		new B().inerM((int a)->{
			System.out.println("A1 인터페이스 inerM 매서드구현 > 람다식");
		});
		
	
	
	}
	
}
