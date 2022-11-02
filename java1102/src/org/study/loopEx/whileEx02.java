package org.study.loopEx;

import java.util.Scanner;

public class whileEx02 {

	public static void main(String[] args) {
		System.out.println("while");

		int i = 0;

		// 0부터 9까지만 출력 > if, break 이용
		while (true) {
			System.out.println(i);
			i++;
			if (i > 9) {
				break;
			}
		}

	}
}
