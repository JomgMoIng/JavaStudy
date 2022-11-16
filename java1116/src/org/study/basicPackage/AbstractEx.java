package org.study.basicPackage;

 abstract class Ab1{
	 
	 int num;
	 
	//추상메서드
	//선언부 O
	abstract void m1(); //구현부X
}

 
 abstract class B extends Ab1{
	 abstract void m2();
 }

 
 class A extends Ab1{
	 
	 @Override
	void m1() {
		 System.out.println("추상메서드 오버라이드");
	 }
 }

 
 
 
 
public class AbstractEx {

	public static void main(String[] args) {
		A a = new A();
		a.num=100;
		a.m1();
		
		Ab1 ab = new A();
		ab.num=200;
		ab.m1();
		
		
	}
}
