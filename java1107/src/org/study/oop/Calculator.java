package org.study.oop;

public class Calculator {

	public int num1;
	public int num2;
	public String op;
	
	public static final String PROJECTNAME = "CALCULATOR";
	

	//매개변수 3개(num1,num2,op)
	
	// +
	public void sum() {
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}
	// -
	public void sub() {
		System.out.println(num1+"-"+num2+"="+(num1-num2));
	}
	// *
	public void muti() {
		System.out.println(num1+"*"+num2+"="+(num1*num2));
	}
	// /
	public void div() {
		System.out.println(num1+"/"+num2+"="+(num1/(double)num2));
	}
	// %
	public void rem() {
		System.out.println(num1+"%"+num2+"="+(num1%num2));
	}




}
