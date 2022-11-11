package org.study.abstractEx;

//추상클래스
public abstract class Abstract1Main {

	public static void main(String[] args) {

//		new Abstract1(); 추상클래스 new 구현불가
		new Abstract1Sub1(); //구현객체 new 구현가능
		
		Abstract1Sub1 a1 = new Abstract1Sub1();

		a1.abstractM1();
		a1.abstractM2("추상메서드2");


		Abstract1Sub1SubSub a2 = new Abstract1Sub1SubSub();

		a2.abstractM1();
		a2.abstractM2("추상메서드3");
		a2.abstractM3();
		a2.m1();
	
		// 부모 타입 > 자식 객체
		// 다형성

		Abstract1 a3 = new Abstract1Sub1SubSub();
		
		a3.num1 = 10;
		a3.abstractM1();
		a3.abstractM2("name");
		a3.m1();
		
		//구현객체간의 상속관계가 없으면 다형성이 성립하지 않는다
//		 > 서로 같은 부모로 상속을 받았을뿐 두 클래스는 영향을 주지 못한다
//		Abstract1Sub1 a4 = new Abstract1Sub1SubSub(); 

		
		
		
	}
}
