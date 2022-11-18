package org.study.exception;

public class Test1118 {

	public static void main(String[] args) {
		

		int i = 10; //기본형
		
		//박싱
		Integer i2 = new Integer(i); // 객체형
		
		//언박싱
		int i3 = i2.intValue(); // 기본형
		
		//자동박싱
		Integer j1 = 10; // 기본 > 객체
		
		//자동 언박싱
		int j2 = j1; //객체 > 기본
	}
}
