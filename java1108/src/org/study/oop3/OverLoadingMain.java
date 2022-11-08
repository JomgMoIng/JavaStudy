package org.study.oop3;

public class OverLoadingMain {

	public static void main(String[] args) {

		OverLoading1 over1 = new OverLoading1();

		over1.method1();
		over1.method1(100);
		over1.method1(100, "OverLoading1");
		over1.method1("OverLoading2", 100);

		System.out.println();
		System.out.print(true);
		System.out.print('c');
		System.out.print(new char[] {'c','a','f','e'});
		System.out.print(1.15);
		System.out.print((float)1.15);
		System.out.print(10);
		System.out.print(10L);
		System.out.print(new OverLoading1());
		System.out.print(new String ("String"));
		System.out.print("String");
		
		
		
		
		
		
	}
}
