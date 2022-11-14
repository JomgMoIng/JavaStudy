package org.study.interfaceEx;

public interface InterfaceEx3 {

	public static final int MAXNUM1 = 1000; // 
	static int MAXNUM2 = 2000; // 인스턴스화가 불가능하니 자동으로 추상매서드로 읽음(static final)
						// final 생략가능
	
	public abstract void excuteQuery1();	
	void excuteQuery2(); // 인스턴스화가 불가능하니 자동으로 추상매서드로 읽음(public abstract)
						// 생략 가능





}
