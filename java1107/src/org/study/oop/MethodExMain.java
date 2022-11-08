package org.study.oop;

public class MethodExMain {

	public static void main(String[] args) {

		MethodEx m1 = new MethodEx();
		
		//void 반환값이 없어 그냥 호출
		m1.method1();

		// 방법1 반환값 그대로 호출
		System.out.println(m1.method2());
		// 방법 2 인트형에 담아서 호출
		int num1 = m1.method2();
		System.out.println(num1);

		// 방법1 반환값 그대로 호출
		System.out.println(m1.method3());
		// 방법 2 인트형에 담아서 호출
		String str = m1.method3();
		System.out.println(str);
		
		m1.method4(20, 30);
		m1.method4(1515, 199);
		
		// 반환값을 받기위해 일단 매개인자에 담아 콜한다
		m1.method5(15, 20);
		
		//위에 방법대로 인트형에 담아서 반환값 호출
		int sum = m1.method5(15, 20);
		System.out.println(sum);
		
		m1.method6(10, 30, "+");
		m1.method6(10, 30, "-");
		m1.method6(10, 30, "*");
		m1.method6(10, 30, "/");
		m1.method6(10, 30, "%");
		m1.method6(10, 30, "**");
		
	}
}
