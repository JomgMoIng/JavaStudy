package org.study.loopEx;

import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {
		System.out.println("for문");
		// 스캐너 이용해서, 시작단, 끝단을 콘솔로 나오게 하시오 > ex) 25 > 2단 5단
		// 단 시작단은 끝단보다 작다

		Scanner sc = new Scanner(System.in);
		System.out.println("시작하는 단의 숫자를 입력하시오");
		int i = sc.nextInt();
		System.out.println("끝나는 단의 숫자를 입력하시오");
		int j = sc.nextInt();

		if (i < j) {
			for (int s = i; s < j+1; s++) { //s<= j 또는 s <j+1
				System.out.println(s + "단입니다");
				for (int e = 1; e <= 9; e++) {
					System.out.println(s + "*" + e + "=" + (s * e));
				}

			}
		} else if (j < i) {
			for (int s = j; s <= i; s++) {
				System.out.println(s + "단입니다");
				for (int e = 1; e <= 9; e++) {
					System.out.println(s + "*" + e + "=" + (s * e));
				}

			}

		}

		else {
			System.out.println("입력값이 오류입니다");
		}

		sc.close();
	}
}
