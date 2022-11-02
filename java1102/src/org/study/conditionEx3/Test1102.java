package org.study.conditionEx3;

import java.util.Scanner;

public class Test1102 {

	public static void main(String[] args) {
//산술계산
//+-*/
//1.int형 두수를 입력받아  산술연산자를 이용하여 입력받고 연산에따라 계산하여 결과값 콘솔에 표시
		
		Scanner nner = new Scanner(System.in);

		System.out.println("첫번째 정수를 입력하시오");
		int num1= nner.nextInt();

		System.out.println("두번째 정수를 입력하시오");
		int num2= nner.nextInt();

		System.out.println("산술연산자를 입력하시오");
		String op=nner.next();
		
		
		
		if(op.equals("+")) {
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		}else if(op.equals("-")){
			System.out.println(num1+"-"+num2+"="+(num1-num2));			
		}else if(op.equals("*")){
			System.out.println(num1+"*"+num2+"="+(num1*num2));			
		}else if(op.equals("/")){
			System.out.println(num1+"/"+num2+"="+(num1/(double)num2));			
		}else {
			System.out.println("연산자 입력 오류");
		}
		
		
	}
}
