package org.study.arrayEx;

public class ArrayeEx09 {
	public static void main(String[] args) {
		System.out.println("다차원배열");

		//5행 5열 다차원 배열 int[][] arrInt2 생성
		//정수 10부터 10씩 더해서 250까지 초기화시키고
		//위의 예제와 같이 콘솔에 출력해보세요
		
		int[][] arrInt2 = new int[5][5];
		
		int num2 = 0;
		
		for(int i =0; i<arrInt2.length;i++) {
			for(int j=0;j<arrInt2[i].length;j++) {
				
				arrInt2[i][j] = num2*10+10;
				
				System.out.print(arrInt2[i][j]+"\t");
				num2++;			
			}
			System.out.println();
		}
			
		
		
		
	}
}
