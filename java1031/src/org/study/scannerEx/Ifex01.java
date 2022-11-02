package org.study.scannerEx;

public class Ifex01 {

	public static void main(String[] args) {
		if(true){
			System.out.println("실행 1"); // 실행
		}
		if(false){ // false
			System.out.println("실행 2");
			System.out.println("실행 3");
		}
		if(3!=3) // false
			System.out.println("실행 4");
			System.out.println("실행 5"); // 실행

	}

}
