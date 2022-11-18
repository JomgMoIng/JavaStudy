package org.study.innerclass;

//외부클래스
public class StaticClassMain {

	public static void main(String[] args) {
		System.out.println("static 클래스");

		StaticClass s1 = new StaticClass();

		s1.age = 10;
		s1.name = "내부클래스";
		System.out.println(s1.name);

		//StaticClass.StaticBasic 유형에 대한 잘못된 엔클로징 인스턴스 사양
//		s1.new StaticBasic();  static 불가
		
		StaticClass.StaticBasic s2 = new StaticClass.StaticBasic();
		s2.age = 10;
		s2.name = "static클래스";

		System.out.println("나이 : " + s2.age);
		System.out.println("이름 : " + s2.name);

		StaticClass.StaticBasic s3 = new StaticClass.StaticBasic();
		s3.staticMethod(); //이 목적을 위해 보통 사용
	}

}
