package org.study.interfaceEx;

public class InterfaceEx1SubMain {
public static void main(String[] args) {
	
//	new InterfaceEx1(); 불가

	// InterfaceEx1Sub 타입(구현객체 타입, 자식타입)
	InterfaceEx1Sub in1 = new InterfaceEx1Sub();

	in1.num1 = 10;
	in1.abstractMethod1();
	in1.abstractMethod2();
	in1.defaultMethod();
	in1.method1();
	System.out.println("========");
	
	InterfaceEx1 in2 = new InterfaceEx1Sub();
	
	in2.abstractMethod1();
	in2.defaultMethod();
	int MaxNum2 = in2.MAXNUM;
	
	System.out.println("========");
	InterfaceEx2 in3 = new InterfaceEx1Sub();
	in3.abstractMethod2();
	
	
}
}
