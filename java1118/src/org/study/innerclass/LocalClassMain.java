package org.study.innerclass;

//외부클래스
public class LocalClassMain {

	public static void main(String[] args) {

		System.out.println("지역 클래스");
		
		LocalClass lClass = new LocalClass();
		lClass.localMethod();
		lClass.localMethod();
	}

}
