package org.study.loopEx;

import java.util.Scanner;

public class Test110202 {

	public static void main(String[] args) {
//스캐너 이용 , 변수2개
//		첫번째숫자, 두번째 숫자를 입력받아서 정수를
//		첫번째 숫자부터 두번째 숫자까지 콘솔에 출력
//		조건 (첫번째숫자<두번째숫자)
		
		Scanner nner = new Scanner(System.in);

		System.out.print("첫번째 숫자 입력");
		int	firstNum = nner.nextInt();
		System.out.print("두번째 숫자 입력");
		int lastNum = nner.nextInt();
		
		if(firstNum<lastNum) {
			for(int i=firstNum ;i<lastNum;i++) {
				if(i==lastNum-1) {
					System.out.print(i);
				break;
			}
			System.out.print(i+",");
		}
} else {
	System.out.println("첫번재 입력숫자는 반드시 두번째 입력숫자보다 작아야 합니다");
}


		
		nner.close();
	}
}
