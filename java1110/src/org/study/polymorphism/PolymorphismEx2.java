package org.study.polymorphism;

	class Parent{
		void excuteQuery() {
			System.out.println("SQL실행");
		}
	}
	
	class sub1 extends Parent{
		
		@Override
		void excuteQuery() {
			System.out.println("SQL1");
		}
	}

	class sub2 extends Parent{
		@Override
		void excuteQuery() {
		System.out.println("SQL2");
		}
	}
	
public class PolymorphismEx2 {
public static void main(String[] args) {
	
	Parent pa = new Parent();
	pa.excuteQuery();
	
	pa = new sub1();
	pa.excuteQuery();
	
	pa = new sub2();
	pa.excuteQuery();
	
	
	
	
	
	
	
	
	
	
}

	
	
	
	
	
}

