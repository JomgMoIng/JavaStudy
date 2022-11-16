package org.study.basicPackage;

import java.util.Date;
import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {
		

		System.out.println("Random");
		
		Random rd = new Random();
		
		//5번실행 > 정수값을 랜덤
		
		for(int i =0;i<5;i++) System.out.print(rd.nextInt()+"\t");
		
		System.out.println();
		//5번실행 > 랜덤1~45
		
		for(int i =0;i<5;i++) {
			System.out.print(rd.nextInt(45)+1+"\t");
		}
		
		System.out.println();
		
		//5번 실행 > 랜덤 소수점 두자리(printf)
		for(int i = 0;i<5;i++) {
			System.out.printf("%.2f\n",rd.nextDouble());
		}
		
		//1. 배열 생성
		int lotto[] = new int [45];
		
		for(int i =0;i<45;i++) {
			lotto[i]=i+1; //1~45
			System.out.println(lotto[i]+" ");
		}
		
		int temp = 0;
		for(int i=0;i<1000;i++) {
			int idx = (int)(Math.random()*45);
			int idx2 = new Random().nextInt(45); //Random으로 하는것
			temp = lotto[idx];
			lotto[idx] = lotto[0];
			lotto[0] = temp;
				
			
		}
		
		
		String result = "";
		for(int i =0;i<6;i++) {
			result += lotto[i]+" ";
		}
		
		System.out.println(result);
		
		
		
	}
}
