package org.study.interfaceEx;

public class InterfaceEx3MainClass {

public static void main(String[] args) {
	
	InterfaceEx3Main in = new InterfaceEx3Main();
	
	in.excuteQuery1();
	in.excuteQuery2();
	System.out.println(in.MAXNUM1);
	System.out.println(in.MAXNUM2);
	in.name = "InterfaceEx3Main";
	System.out.println(in.name);
	
	System.out.println("=========");
	
	InterfaceEx3 in2 = new InterfaceEx3Main();

	in2.excuteQuery1();
	in2.excuteQuery2();
	System.out.println(in2.MAXNUM1);
	System.out.println(in2.MAXNUM2);
	
	
	
	
}


}
