package org.study.loopEx;

import java.util.Scanner;

public class whileEx01 {

	public static void main(String[] args) {
		System.out.println("while");
		
		int i=0; // 1.초기화
		
		while(i<10) { //2.조건식
//			System.out.println(i);
			
			if(i>=9) {
			System.out.println(i);
			}else {
				
			System.out.print(i+",");
			}
			++i; //3. 증감식
		}
		
	}
}
