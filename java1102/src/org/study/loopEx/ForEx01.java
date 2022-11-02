package org.study.loopEx;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		System.out.println("for문");

		// 같은 방식이지만 이프와 엘스를 이용해 순서를 바꿈
		for (int i = 0; i < 10; i++) {
			if (i == 9) {
				System.out.println(i);
			break;
			} else {
				System.out.print(i + ",");
			}//break
		}

		for(int i=9; i>=0; i--){
			if(i>0) {
			System.out.print(i+",");
			}else{
			System.out.print(i);
			}
				
		}
	}
}
