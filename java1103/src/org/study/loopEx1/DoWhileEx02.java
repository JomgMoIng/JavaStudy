package org.study.loopEx1;

import java.util.Scanner;

public class DoWhileEx02 {
	public static void main(String[] args) {
		System.out.println("Do~while");
		System.out.println("구구단");
//		int i = 1;
//
//		do {
//			i++;
//			System.out.println(i + "단");
//
//			int j = 0;
//			do {
//				j++;
//				System.out.println(i * j);
//			} while (j < 9);
//		} while (i < 9);

		//시작단, 끝단 입력받아서 시작부터 ~ 끝단까지 구구단을 콘솔에 출력

		Scanner input = new Scanner(System.in);
		

		System.out.println(" 첫단을 입력하세요");
		int firstNum = input.nextInt();
		System.out.println(" 끝단을 입력하세요");
		int lastNum = input.nextInt();		
		
		int i = firstNum-1;
		do {
			i++;
			System.out.println(i+"단입니다");

					
				int j=0;
				
				do {
					j++;
					System.out.println(i+"*"+j+"="+(i*j));
				}while(j<9);
		}while(i<lastNum);
		
		

	}

}
