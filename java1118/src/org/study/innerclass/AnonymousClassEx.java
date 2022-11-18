package org.study.innerclass;

interface In1 {
	public abstract void m1();
}

abstract class ABS1 {
	abstract void m1();

}

class C1 {
	void m1() {
		System.out.println("c1");
	}
}

public class AnonymousClassEx {

	public static void main(String[] args) {

		In1 i1 = new In1() {

			@Override
			public void m1() {
				System.out.println("인터페이스 m1");
			}
		};

		ABS1 abs1 = new ABS1() {

			@Override
			void m1() {
				System.out.println("추상클래스 m1");
			}
		};

		C1 c1 = new C1() {	// new C1();
			@Override
			void m1() {
				System.out.println("일반클래스");
			}
			
		};

		i1.m1();
		abs1.m1();
		c1.m1();
		

	}
}
