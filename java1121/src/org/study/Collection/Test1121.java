package org.study.Collection;

public class Test1121 {

	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		try {

			arr[5]=10;	
			System.out.println("예외발생X");
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("예외발생O");
		}finally {
			System.out.println("기본실행");
		}
		
		
		
		
		
		System.out.println("정상실행");
	}

}
