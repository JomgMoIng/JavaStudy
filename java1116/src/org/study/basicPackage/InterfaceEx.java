package org.study.basicPackage;

interface A0{
	void m1();
}
interface A1{
	
//	public static final int MAXIMUM = 100;
	int MAXIMUM = 100;
//	abstract public void ab1();
	void ab1();
	
	default void d1() {
		System.out.println("default");
	}
//	일반매서드 사용 불가
//	void int1() {
//		System.out.println("인스턴스매서드");
//	}
}

interface B2 extends A1, A0{
	void m2();
}

class MainClass implements B2{

	@Override
	public void ab1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}


public class InterfaceEx {

	public static void main(String[] args) {

		new A0() {
			
			@Override
			public void m1() {
				System.out.println("구현객체를 따로 만들지않고 오버라이드");
			}
		};
		
		MainClass m1 = new MainClass();
		m1.ab1();
		m1.d1();
		m1.m1();
		m1.m2();
		
		A0 m2 = new MainClass();
		m2.m1();
	}
}
