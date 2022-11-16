package org.study.basicPackage;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		
		Random r = new Random();
		//정수
		System.out.println(r.nextInt());	//음수, 양수, 0
		System.out.println(r.nextInt(100));	// 0~99 정수
		System.out.println(r.nextLong());	// Long 타입
		
		//실수
		System.out.println(r.nextFloat());	//0<=실수<1
		System.out.println(r.nextDouble());	//0<=실수<1
		
	}
}
