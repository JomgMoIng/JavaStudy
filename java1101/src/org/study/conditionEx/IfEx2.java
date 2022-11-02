package org.study.conditionEx;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		System.out.println("조건이 하나 일때");
		
		String id="m111";
		
		Scanner input = new Scanner(System.in);
		
		//점수를 입력해서 90점 이상이면 A출력 90~    
		//점수를 입력해서 80점 이상이면 B출력 80~89   80<= kor < 90   80<=kor && kor<90
		//점수를 입력해서 70점 이상이면 C출력 70~79
		//점수를 입력해서 60점 이상이면 D출력 60~69
		//점수를 입력해서 60점 미만이면 F출력

		int kor = input.nextInt();
		
		if(kor>=90 && kor<=100) {
			System.out.println("A");
		}
		if(kor>=80 && kor<90)	System.out.println("B"); // 한줄이라 중괄호 생략
		if(kor>=70 && kor<80)
			System.out.println("C"); // 한줄이라 중괄호 생략 
		if(kor>=60 && kor<70) {
			System.out.println("D");
		}
		if(kor<60 && kor>=0) {
			System.out.println("F");
		}
		if(kor<0 || kor>100) {
			System.out.println("값이 올바르지 않습니다");
		}
		
//		위와 같음
//		if(kor>=90) {
//			System.out.println("A");
//		} else if(kor>=80)	System.out.println("B"); // 한줄이라 중괄호 생략
//		else if(kor>=70)
//			System.out.println("C"); // 한줄이라 중괄호 생략 
//		else if(kor>=60) {
//			System.out.println("D");
//		}else if(kor<60) {
//			System.out.println("F");
//		}
				
		
		System.out.println("프로그램 종료합니다");
		
		
		input.close();
		
	}
	
	
	
}

