package org.study.innerclass;

// 내부클래스 "클래스 내부에 선언한 클래스"
// 내부크래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다

public class InnerClassbasic {

	class InstanceClass{
		int i = 10;
		// static int i2=20; // static 클래스에서만 선언
		final static int NUM=100;
	}

	static class StaticInner{
		int i =10;
		static int i2=20;
	}

	public void localMethod() {
		class LocalClass{
			int i = 10;
			//static int i2=20; // static 클래스에서만 선언
			final static int NUM=100;
			void local1() {
				System.out.println("local 메서드");
			}
		}
		
		LocalClass l1 = new LocalClass();
		l1.local1();

		
	
	}


	public static void main(String[] args) {
		
		System.out.println(InstanceClass.NUM);
		System.out.println(StaticInner.i2);
		
	}

}
