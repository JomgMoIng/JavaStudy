package org.study.abstractEx;

//구현객체  <ㅡ 추상클래스 Abstract1
public class Abstract1Sub1 extends Abstract1 {

	@Override
	public void abstractM1() {
		System.out.println("추상메서드 abstractM1");
	}

	@Override
	public void abstractM2(String name) {
		System.out.println(name);
		
	}


	
}
