package org.study.oop;

import java.util.Date;

public class FieldEx {
	//클래스의 필드
	//인스턴스 맴버
	public int num; 	//기본자료형
	public String name; //String
	public int[] arr1; 	//배열
	public Date day; 	//라이브러리
	public Car car; 	//다른 클래스
	//클래스의 맴버
	public static final String MEMBERNAME ="JAVA";
	
	//프라이빗은 직접적으로 접근이 불가하여
	private static final String MEMBERNAME2 ="JAVA22";
	// 다른 객체를 이용하여 접근가능
	
	public static void method() {
		System.out.println(MEMBERNAME);
	}
	
	public static void method2() {
		System.out.println(MEMBERNAME2);
	}
}
