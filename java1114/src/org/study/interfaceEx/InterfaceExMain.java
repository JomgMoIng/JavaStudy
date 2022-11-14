package org.study.interfaceEx;

interface In1 {
//	public static final int MAXNUM=500;
	int MAXNUM = 500; // 위와같음, 생략한것

	// public abstract void in1Method1();
	void in1Method1(); // 위와같음, 생략한것

	default void defaultMethod() {
		System.out.println("defaultMethod");
	}

}

interface In2 extends In1 {
	public abstract void excuteCommend();

}

class In12 implements In2 {

	@Override
	public void in1Method1() {
		System.out.println("in2Method1 오버라이딩");
	}

	@Override
	public void excuteCommend() {
		System.out.println("in2Method2 오버라이딩");
	}

}

public class InterfaceExMain {

	public static void main(String[] args) {

		In12 i12 = new In12();
		In1 i1 = new In12();
		In2 i2 = new In12();
		
		i1.in1Method1();
		i2.in1Method1();
		i2.excuteCommend();
		i12.in1Method1();
		i12.excuteCommend();
		System.out.println(i12.MAXNUM);
		i12.defaultMethod();
		
	}
}
