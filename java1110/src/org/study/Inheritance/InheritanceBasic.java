package org.study.Inheritance;

class Parent{

	public int num1;
	private int num2;
	protected String op;
	
	// 기본생성자( 다른생성자 생성시 기본생성자를 만들어 줘야함)
	public Parent() {
		
	}
	//다른생성자
	public Parent(int num1) {
		this.num1=num1;
	}
	
	public void parentMethod() {
		System.out.println("ParentMethod");
	}
	
	
}

class Son1 extends Parent{
	public int num3;
	
	public void parentMethod() {
		System.out.println("자식parentMethod");
//		super.parentMethod();
	}
}

class Son2 extends Parent{
	public int num4;
	public void son2Method() {
		System.out.println("son2Method");
	}
}

public class InheritanceBasic {
	public static void main(String[] args) {
		Parent p = new Parent();
		Son1 s1 = new Son1();
		Son2 s2 = new Son2();
	
		s1.parentMethod();
		s2.parentMethod();
	
	}
}
