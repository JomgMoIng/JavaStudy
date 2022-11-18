package org.study.innerclass;

public class InnerClassEx {
	
	public InnerClassEx() {
		// TODO Auto-generated constructor stub
	}
	
	//인스턴스 클래스
	class InstanceClass2{
		int num1;
		void m1() {
			System.out.println("InstanceClass2");
		}
	}
	//static 클래스
	public static class StaticClass2{
		static int NUM=2;
		static void m2() {
			System.out.println("StaticClass2, static 매서드");
		}
	}

	//지역 클래스
	void localMethod() {
		class LocalClass2{
			int num;
			void m2() {
				System.out.println("LocalClass2");
			}
		}
		LocalClass2 loc2 = new LocalClass2();
		loc2.m2();
	}
	
	
	
	
	
		
}
