package org.study.loopEx;

import java.util.Scanner;

public class whileEx04 {

	public static void main(String[] args) {
		System.out.println("while");

		System.out.println("스캐너로 입력받아서 구구단 만들어보기(while)");

		Scanner input = new Scanner(System.in);

		System.out.println("첫단을 입력하세요");
		int i = input.nextInt();
		System.out.println("끝단을 입력하세요");
		int j = input.nextInt();

		if (i > 0 && i < 10) {
			if (i < j) {

				
				while (i <= j) {
					System.out.println(i + "단입니다");

					int k = 1;
					while (k <= 9) {
						System.out.println(i + "*" + k + "=" + (i * k));
						k++;
					}
					i++;

				}
			} else {
				System.out.println("j값이 i보다 작거나 같습니다");
			}
		} else {
			System.out.println("i 값이 0보다 작거나 10보다 큽니다");
		}
	}
}
