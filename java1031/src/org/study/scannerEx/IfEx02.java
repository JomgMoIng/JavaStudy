package org.study.scannerEx;

public class IfEx02 {

	public static void main(String[] args) {
		int a = 30;
		if(a%2==0){	// true
			System.out.println(a+"는 2의 배수");		// 실행
			if(a%3==0){	// true
				System.out.println(a+"는 3의 배수");	// 실행
			}
			if(a%4==0){	// false
				System.out.println(a+"는 4의 배수");
			}
		}
		

		
		
		
	}


}
