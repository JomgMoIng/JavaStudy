package org.study.oop;

public class Class1 {

	public String name;
	public int age;
	//static 클래스 멤버라 new 필요없이 . 으로 불러올수 있음
	public static String title;
	// final 상수라 변경불가
	public static final String PROJECTNAME="JAVAPROJECT";
	
	
	public void intstanceMechod() {
		System.out.println("인스턴스매서드");
	}
	
	public static void classMethod() {
		System.out.println("클래스 매서드");
	}
	
	
}
