package org.study.scannerEx;

public class IfElseEx02 {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 9;
		int max;
		if (a > b && a > c) {  
			max = a;  // 위의 조건식이 true일때 실행
		} else {  // 위의 조건식이 false일때 실행
			if (b > c) {
				max = b; // 위의 조건식 true일때 실행
			} else {
				max = c; // 위의 조건식 false일때 실행
			}
		}
		System.out.println("max = " + max);
	}
	

}
