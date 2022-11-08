package solpl1101;

import java.util.Scanner;

public class ArrayEx03ch {
	public static void main(String[] args) {
		System.out.println("배열");
		// 로또 중복있게 만들어보기
		// 로또 0번지~44번지 > 1~45배열
		// 배열선언

		int[] lotto = new int[45];
		System.out.println(lotto.length);

		// 2.초기화 1~45
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
//			System.out.println(lotto[i]);
		}

//		System.out.println(Math.random()); //랜덤함수 0~0.999...사이 하나뽑는것
//		System.out.println(Math.random()*10); //랜덤함수에 10을곱해 0~1.999... 사이하나뽑는것
//		System.out.println((int)(Math.random()*46)); //위와 같음

		System.out.println("=========");

		for(int j=0;j<6;j++) {
		int temp;

		for (int i = 0; i < 1000; i++) {
//			System.out.println((int)(Math.random()*46));
			int idx = (int) (Math.random() * 45);

			temp = lotto[idx]; // random > temp
			lotto[idx] = lotto[0]; // 0번지 > random
			lotto[0] = temp;
		}
	
				System.out.print(lotto[0]+" ");

		}

		
		
	}
}
