package org.study.gui;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface In1{
	abstract void ab1();
}

class InnerClass{
	//내부클래스 
	
	// 인스턴스 클래스
	class InstanceClass{
		int num1;
	}
	//static 클래스
	static class StaticClass{
		static final int NUMMAX = 100;
	}
	//지역클래스
	void instanceMethod() {
		class InstanceClass{
			int ins;
			void inM() {
				System.out.println("인스턴스클래스");
			}
		}
		InstanceClass in1 = new InstanceClass();
		in1.inM();
	}
	
}

public class Test1128 {

	public static void main(String[] args) {

		List<Integer> lists = new ArrayList<Integer>();
		
		lists.add(new Integer(10));	//박싱
		lists.add(20);	//자동 박싱
		lists.add(30);
		lists.add(40);
		lists.add(50);
		
		//for each
		for(Integer el : lists) {
			System.out.print(el+" ");
		}
		
		System.out.println();
		
//		lists.clear();	 전체 삭제
//		lists.removeAll(lists);	전체 삭제
		
		//iterator
		Iterator<Integer> iter = lists.iterator();
		
		while(iter.hasNext()) {
			Integer list = iter.next();
			System.out.print(list+" ");
		}
		
		
		System.out.println("=============================");

		//다형성 이용
		//익명클래스
		new In1() {

			@Override
			public void ab1() {
				System.out.println("In1 오버라이딩");
			}
			
		}.ab1();
		
		
		//람다식
		In1 i1 = ()->{
			System.out.println("람다식으로 In1 오버라이딩");
		};
		
		i1.ab1();
		
		System.out.println("=============================");
		
		
		
//		System.out.println("컴파일 에러")	문법적 오류로 실행이 불가능한 오류 : 컴파일에러
		
		System.out.println("실행중(Run Time)에러");
		
		int[] iArr = new int[3];
		
		//예외(치명적인 에러가 아닌, 무시정도의 에러)
		try {	//예외처리
			//예외발생 예상 코드
		iArr[4]=10; 	
		System.out.println("예외가 발생 되지 않았다");
		}catch(ArrayIndexOutOfBoundsException e) {
			e.getSuppressed();
			System.out.println("배열의 인덱스 초과 예외 발생");
			}
		
		
		
		System.out.println("실행중 치명적인 에러");
		
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
		

	}
}
