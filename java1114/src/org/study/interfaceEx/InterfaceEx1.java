package org.study.interfaceEx;

interface InterfaceEx1 {

//	public int num1; // 인스턴스(new)안됨
	public static final int MAXNUM = 1000;	// final상수 사용가능
	public abstract void abstractMethod1(); //abstract 매서드
	public static void staticMethod1(){		//static 매서드
		System.out.println("static 매서드");
	}
	default void defaultMethod() {			//default 매서드
		System.out.println("default 매서드");
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
