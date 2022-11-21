package org.study.generic; 

import java.util.Date; 

public class ClassTypeMain {

		
	public static void main(String[] args) {
		
						//객체 생성
		ClassType c1 = new ClassType();
		//타입	객체참조변수(객체의 주소값)
		
//		접근
//		.
		
		//기본타입(primitive type)
		c1.nm1 = 100;
		
		//c1.name = new stirng("이름");
		c1.name = "이름";
		c1.obj = new Object();
		c1.day= new Date();
		
		//private 멤버 > setter,getter
		c1.setId("m1");
		c1.getId();
		
	
		
		
	}	
		
		
	
}
