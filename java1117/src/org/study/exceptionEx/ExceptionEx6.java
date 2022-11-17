package org.study.exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx6 {

	public static void main(String[] args) {
		System.out.println("Exception");
		
		//Scanner 정수를 입력을 받아서 num1을 나누어서
		//결과를 출력 num1/num2
		int num1 = 100;
		
		try {
			//예외가 발생 할 것 같은 명령문
			Scanner input = new Scanner(System.in);
			
			System.out.println("나눌 숫자를 입력하시오");
			int num2 = input.nextInt();

			//ArithmeticException
			System.out.println(num1/num2);  //0으로 나누면 에러가 나올수 있음
			System.out.println("예외안됨");
			
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("0");
		}catch(InputMismatchException e) {
			e.printStackTrace();
			System.out.println("1");
		}catch(Exception e) {	
			e.printStackTrace();
		}finally {
			System.out.println("예외와 상관 없이 실행");
		}
		


		
		System.out.println("프로그램 정상 실행");
		
	
}
}
