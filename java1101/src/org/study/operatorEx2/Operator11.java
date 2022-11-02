package org.study.operatorEx2;

import java.util.Scanner;

public class Operator11 {
	public static void main(String[] args) {

		System.out.println("삼항 연산자");
		System.out.println("숫자 입력 : ");
		Scanner in = new Scanner(System.in);
		
		int num=in.nextInt();
		
		int result=num>10?1:0;
		System.out.println("결과 : " +result);
		
		boolean bool=num>10?true:false;
		System.out.println("결과 : " + bool);

		String str=num>10?"10보다 큽니다":"10보다 작거나 같습니다";
		System.out.println("결과 : " + str);
		
		if(num>10) {
		System.out.println("결과 : 10보다 큽니다");	
		}else {
			System.out.println("결과 : 10보다 작거나 같습니다");
		}

		//두개일때는 else if가 오류날수있으니 else만 쓰기!
		if(num>10) {
			System.out.println("결과 : 10보다 큽니다");	
			}else if(num<=10) {
				System.out.println("결과 : 10보다 작거나 같습니다");
			}

		int i = 10;
		System.out.println(i++);
		
		
		
		
		
	}
}
