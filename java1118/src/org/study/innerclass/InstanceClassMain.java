package org.study.innerclass;

import org.study.innerclass.InstanceClass.instanceBasic;

//외부클래스
public class InstanceClassMain {

	public static void main(String[] args) {
	System.out.println("내부클래스(인스턴스클래스)");
		
	InstanceClass outC = new InstanceClass();	//외부 클래스
		outC.age = 20;
		outC.name = "외부클래스";
		System.out.println(outC.name);
		//외부클래스타입. 내부클래스 //내부클래스 객체 생성
		InstanceClass.instanceBasic inC = outC.new instanceBasic();
		inC.age = 10;
		inC.name = "내부클래스";
		System.out.println(inC.name);
		
		//위에꺼를 풀어 쓴 버젼
		InstanceClass.instanceBasic inC2 = new InstanceClass().new instanceBasic();
		inC2.age = 10;
		inC2.name = "내부클래스";
		System.out.println(inC2.name);
		
		
		
	}

	
	
}
