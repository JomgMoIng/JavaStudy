package org.study.oop;

public class Class1Main {
	public static void main(String[] args) {

		System.out.println("static맴버(클래스맴버)");

		Class1.title = "클래스맴버";
		Class1.classMethod(); 
		
		System.out.println(Class1.PROJECTNAME);
		
		Class1 c1 = new Class1();
		c1.name = "m1";
		c1.age = 20;
		c1.title = "title1";
		
		c1.classMethod();
		
		System.out.println(FieldEx.MEMBERNAME);
		
	}
}
