package org.study.oop3;

public class OverLoading1 {

	// 오버로딩 java에서 허용
	// 구현부에서 매서드 이름이 같아도 매개인자 유형이 다르면 사용 가능
	public void method1() {
		System.out.println("method1");
	}

	public void method1(int num1) {
		System.out.println(num1);
	}

	public void method1(int num1, String name) {
		System.out.println(num1);
		System.out.println(name);
	} // 이름만 바꿧지 같은 유형이라 사용 불가
//	public void method1(int num2, String name2){
//		System.out.println(num2);
//		System.out.println(name2);
//	}

	public void method1(String name, int num1) {
		System.out.println(name);
		System.out.println(num1);
	}

	
	
	
}
