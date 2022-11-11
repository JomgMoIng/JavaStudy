package org.study.abstractEx;

public class AbstractMain {

	public static void main(String[] args) {
		
		
//		new AbstractEx1();		추상클래스라 불가
//		new AbstractEx1Sub2();	추상클래스라 불가
		
		AbstractEx1Sub1 a1 = new AbstractEx1Sub1();
		a1.abstractMethod();
		
		AbstractEx1Sub2Sub a2 = new AbstractEx1Sub2Sub();
		a2.abstractMethod();
		a2.abstractMethod2();
	
	
	}
	
}
