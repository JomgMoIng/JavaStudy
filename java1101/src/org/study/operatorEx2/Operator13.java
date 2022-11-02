package org.study.operatorEx2;


public class Operator13 {
	public static void main(String[] args) {

		System.out.println("반복문");
		
		// for 문에서는 증감식이 무조건 선처리 후증가로 진행된다
		
		//i 0 부터 시작하여 9까지처리하고 종료
		for(int i=0;i<10;i++) {
			System.out.print(i);
		}
		System.out.println("==============");

		//사진 예시
		for(int j=1;j<10;j++) {
			System.out.println("<img src='shopping_"+j+".jpg')>");
		}
		
	}
}
