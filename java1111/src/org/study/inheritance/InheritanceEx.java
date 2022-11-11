package org.study.inheritance;

class A {
	int num1;
	private int num2;
	protected int num3;
	
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public A(String name) {
		System.out.println(name);
	}
	
	public void method1() {
		System.out.println("A Method1");
	}
}

class B extends A {
	int num4;

	public B() {
		super("문자열");
		System.out.println("B생성자");
	}
	@Override
	
	
	public void method1() {
		System.out.println("오버라이드 B Method1");
	}
}

public class InheritanceEx {

	public static void main(String[] args) {
		A a = new A();

		a.num1 = 10;
		a.num3 = 20;
		a.method1();
	
		B b = new B();

		b.num1 = 100;
		b.num3 = 200;
		b.num4 = 300;
		b.method1();
	
	}
}
