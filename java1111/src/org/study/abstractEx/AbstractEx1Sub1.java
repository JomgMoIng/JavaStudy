package org.study.abstractEx;

public class AbstractEx1Sub1 extends AbstractEx1 {
	
	//1. 상속받은 추상매서드를 구현
	@Override
	public void abstractMethod() {
		System.out.println("추상매서드 오버라이딩");
	}
	
	//2. 다시 추상클래스로 구현(또 다른 추상클래스를 만들어서 구현해야함)
	//추상매서드
//	public abstract void abstractMethod2();

	
}
