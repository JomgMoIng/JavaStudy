package org.study.conditionEx;

import java.util.Scanner;

public class IfEx5 {

	public static void main(String[] args) {
		System.out.println("조건이 두개 일때");
		// 90 이상 A, 95이상이면 A+

		Scanner input = new Scanner(System.in);
		int kor = input.nextInt();

		// 90if문 안에 95if문을 넣고 나머지를 else주어서 A와 A+을 나눴다

		//else : 나머지
		//else if : 나머지중에 조건
		
		
		
//		else if 를이용한  조건이 2개이상인 조건문
//		if (kor >= 90) {
//			if (kor >= 95) {
//				System.out.println("A+");
//			} else {
//				System.out.println("A");
//			}
//		}else if (kor >= 80) {
//			if (kor >= 85) {
//				System.out.println("B+");
//			} else {
//				System.out.println("B");
//			}
//		} else if (kor >= 70) {
//			if (kor >= 75) {
//				System.out.println("C+");
//			} else {
//				System.out.println("C");
//			}
//		}else if (kor >= 60) {
//			if (kor >= 65) {
//				System.out.println("D+");
//			} else {
//				System.out.println("D");
//			}
//		}else{
//			System.out.println("F");
//		}


//		위에 버전에 확장, 안에다가 집어넣음
//			if (kor >= 80) {
//			if (kor >= 85) {
//				if (kor >= 90) {
//					if (kor >= 95) {
//						System.out.println("A+");
//					} else
//						System.out.println("A");
//				} else
//					System.out.println("B+");
//			} else {
//				System.out.println("B");
//			}
//		}

	}

}
