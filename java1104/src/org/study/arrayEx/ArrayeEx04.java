package org.study.arrayEx;

public class ArrayeEx04 {
	public static void main(String[] args) {
		System.out.println("배열");
		//숫자 1~10 까지 배열 저장하고
		// 임의에 인덱스를 for문을 이용해서 100번정도 자리바꿈을 수행 한 후
		// 배열의 첫번째 인덱스 부터 5번째 인덱스 까지 콘솔에 출력 해보세요
		
		//1. 배열 생성
		int[] arrInt = new int[10];
		//2. for 문을 이용해서 배열의 인덱스  > 1~10
		for(int i=0;i<arrInt.length;i++) {
			arrInt[i]=i+0;
			System.out.println(i);
		}
		//3. 변수(빈공간)
		int temp = 0;
		
//		String str=null;
//		System.out.println(str);
		
		for(int i=0; i<10;i++) {
			int idx = ((int)(10*Math.random()));


		temp=arrInt[idx];
		arrInt[idx]=arrInt[0];
		arrInt[0]=temp;
		
		}
		System.out.println();
		for(int i =0;i<5;i++) {
			System.out.println(arrInt[i]);
		}
		
		
		
		
	}
}
