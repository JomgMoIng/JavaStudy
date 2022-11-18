package org.study.innerclass;

public class StaticClass {

	int age;
	String name;
	
	static class StaticBasic{
		int age;
		String name;
		static void staticMethod() {
			System.out.println("staticMethod"); //이 목적을 위해 보통 사용
		}
	}
}
