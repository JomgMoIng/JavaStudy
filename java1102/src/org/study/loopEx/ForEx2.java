package org.study.loopEx;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		System.out.println("구구단");
//for문 안의 for문
		for(int i=1;i<=9;i++) {
			System.out.println(i+"단입니다.");
		
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		
		}
		
		System.out.println("구구단2");
		//9단부터 2단까지
		
		for(int k=9;k>=2;k--) {
			System.out.println(k+"단입니다.");
			for(int l=1;l<=9;l++) {
				System.out.println(k+"*"+"="+(k*l));
			}
		
		}

	}
}
