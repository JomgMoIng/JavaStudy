package org.study.polymorphism;

public class MainClass {
	public static void main(String[] args) {

		Parent p1 = new Sub1();
		p1.excuteQueryCommend();
		p1 = new Sub2(); 	// 부모타입으로 이미 만들었으니 그걸 이용 //밑에 i와 같은 원리
		p1.excuteQueryCommend(); 
							
		int i = 10;			// 위와 같음
		i = 399;

		
		
	}
}
