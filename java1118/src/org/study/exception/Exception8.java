package org.study.exception;

public class Exception8 {

	public static void main(String[] args) {
		
		try {
			System.out.println(1);
			//예와ㅣ를 고의로 발생
			throw new Exception();
//			System.out.println(2);
			} catch(Exception e) {
				e.printStackTrace();
				System.out.println(3);
			}
		System.out.println(4);
		System.out.println("프로그램 정상 종료");
	}
}
