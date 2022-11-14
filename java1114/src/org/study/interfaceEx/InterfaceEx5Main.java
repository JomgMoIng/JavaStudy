package org.study.interfaceEx;

interface A1{
	public abstract void a1();
}

interface B1{
	public abstract void b1();
}

class ABSub {

}
						//클래스 extends 클래스 implements 인터페이스1, 인터페이스2
public class InterfaceEx5Main extends ABSub implements A1, B1 {

	@Override
	public void b1() {
		System.out.println("오버라이딩 b1");
	}

	@Override
	public void a1() {
		System.out.println("오버라이딩 a1");
	}
	
	public static void main(String[] args) {
//		a1(); 스태틱이 아니라 구현 불가
		ABSub a = new ABSub();
	
	}
	
	
	
}
