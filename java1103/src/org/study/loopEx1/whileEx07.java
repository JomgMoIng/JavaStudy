package org.study.loopEx1;

import java.util.Scanner;

public class whileEx07 {
	public static void main(String[] args) {
		System.out.println("while(ture)");
		// while(true) 문으로 로그인 만들어 보기
		// 계산기(+*/-) "exit"를 입력하면 while 문 종료
		// 정수 두숫자 입력, 연산자 입력 (+=*/) > Scanner이용
		// 연산자에 따라 연산을 실행 > 연산자가 "+" > 숫자1+숫자2=두수의합 > 콘솔에 출력
		// if, else if, Scanner, while(true), 변수2개(정수), String(연산자)
		
		Scanner input = new Scanner(System.in);

		
		while(true) {
		

			
			
			System.out.println("첫번째 숫자를 입력하세요");
			int a = input.nextInt();
			System.out.println("두번째 숫자를 입력하세요");
			int b = input.nextInt();
			System.out.println("연산자를 입력하세요");
			String str = input.next();
			

			if(str.equals("+")) {
				System.out.println(a+"+"+b+"="+(a+b));
			} else if(str.equals("-")) {
				System.out.println(a+"-"+b+"="+(a-b));
			} else if(str.equals("*")) {
				System.out.println(a+"*"+b+"="+(a*b));
			} else if(str.equals("/")) {
				System.out.println(a+"/"+b+"="+(a/(double)b));
			} else if(str.equals("exit")) {
			System.out.println("계산기 종료");
			break;
			}	else {
				System.out.println("입력오류! 다시입력");
			}
			
		}
			
			
		
		
		
		
		
		
		
		
		
		
input.close();
	}
	
}
