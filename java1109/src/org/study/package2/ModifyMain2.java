
package org.study.package2;

import org.study.package1.ModifyEx1;
//다른 패키지
public class ModifyMain2 {

	public static void main(String[] args) {
	
		ModifyEx1 m1 = new ModifyEx1(); // 다른클래스 public 불러올수있음
		m1.num1 = 100;
		m1.m1();
		
		
//		new ModifyEx2(); //다른패키지 디폴트(생략)여서 불러올수 없음
	}
}
