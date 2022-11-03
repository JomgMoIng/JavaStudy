package solpl1101;

import java.util.Scanner;

public class ArrayEx01solpl {
	public static void main(String[] args) {
		System.out.println("배열");
		// int형 data 5개를 저장할 수 있는 배열

		
		
		int[] score = { 93, 75, 95, 76, 70 };
		int sum = 0;
		for (int i = 0; i < score.length; i++) { // score.length = 5
			sum += score[i]; // sum = sum + score[i];
		}
		double avg = (double) sum / score.length; // 형변환
		System.out.println("점수 합계 : " + sum); // 결과 : 409
		System.out.println("점수 평균 : " + avg); // 결과 : 81.8
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i]; 
		}
		
		
		
	}
	
}
