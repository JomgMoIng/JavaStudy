package org.study.conditionEx;

import java.util.Scanner;

public class IfEx4 {

	public static void main(String[] args) {
		System.out.println("조건이 두개 일때");
		// 90 이상 A, 95이상이면 A+

		Scanner input = new Scanner(System.in);
		int kor = input.nextInt();

		// 90if문 안에 95if문을 넣고 나머지를 else주어서 A와 A+을 나눴다

		if (kor >= 90) {
			if (kor >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
		}


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
