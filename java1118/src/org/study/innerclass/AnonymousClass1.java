package org.study.innerclass;

interface A{
	
	void ab1();
}
//기존 방식
//class A1 implements A{
//
//	@Override
//	public void ab1() {
//		System.out.println("오버라이딩 ab1");
//	}
//	
//}
//익명클래스
class A1 implements A{
	
	public void ab1() {
	}
}



public class AnonymousClass1 {
	
	public static void main(String[] args) {
		//기존오버라이딩방식
//		A1 a = new A1();
//		a.ab1();

		//익명클래스 new 부모(){}
		new A() {
			
			@Override
			public void ab1() {
				System.out.println("오버라이딩2");
			}
		}; 
		
		
		
}
}