package org.study.basicPackage;

import java.util.Random;

public class MathEx {
	public static void main(String[] args) {
		System.out.println("Math");
	
		double d = Math.random();
		System.out.println(d);
		
		// 1~ 100까지의 랜덤한 정수 (10번 실행)
//		for(int i =0;i<10;i++) {
//			System.out.println((int)(Math.random()*100)+1);
//		}

		// 1~ 45까지의 랜덤한 정수 (10번 실행)
		for(int i =0;i<10;i++) {
			System.out.println((int)(Math.random()*45)+1);
		}

		
		System.out.println(Math.PI);
		
		Math.min(100,50); // 최솟값 50
		Math.max(100,50); // 최댓값 100
		Math.abs(-100); // 절대값(무조건양수) 100
		Math.ceil(11.2); // 올림 12
		Math.floor(11.2); // 내림 11
		Math.round(11.5); // 반올림 12
		Math.round(11.2); // 반올림 11
//		Math.PI; // 원주율
		
		System.out.println("Random");

		Random r = new Random();
		int rad1 = r.nextInt(); // 정수값 랜덤
		int rad2 = r.nextInt(100); // 0<=   <100
		
		System.out.println(rad1);
		System.out.println(rad2);

	}

}
