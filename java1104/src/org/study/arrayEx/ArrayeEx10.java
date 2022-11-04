package org.study.arrayEx;

public class ArrayeEx10 {
	public static void main(String[] args) {
		System.out.println("다차원배열");

		//5행 3열
		int[][] score = {
					{100, 66, 77},
					{88, 66, 88 },
					{80, 46, 97},
					{70, 88, 80},
					{100, 90, 88}
					};
		
		int kor = 0;
		int math = 0;
		int eng = 0;

		
		System.out.println("중간고사 성적표");
		System.out.println("번호\t 국어 \t 수학 \t 영어\t 총점\t 평균");
		System.out.println("====================");
		for(int i=0; i<score.length;i++) {
			
			int sum = 0;
			double avg=0.0;
			System.out.print(i+"\t");
			for(int j=0; j<score[i].length;j++) {
				sum+=score[i][j];
				System.out.print(score[i][j]+"\t");
			}
			avg=(double)sum/score[i].length;
			System.out.print(sum+"\t");
			System.out.println(avg);
			kor += score[i][0];
			math += score[i][1];
			eng += score[i][2];
		} 
		System.out.println("====================");
		System.out.println("과목별\t" + kor + " "+math+" "+eng);
		
		
		
		
//		클래스룸		
//		int kor = 0;
//		int math = 0;
//		int eng = 0;
//		int sum = 0;
//		double avg = 0.0;
//		int scoreLength = score.length; // 배열의 행길이
//		System.out.println("배열 행 수 : " + scoreLength);
//		System.out.println("중간고사 성적표");
//		System.out.println("번호 국어 수학 영어 총점 평균");
//		System.out.println("==========================");
//		
//		for(int i =0; i<scoreLength;i++) {
//			System.out.print(" "+ (i + 0)+ " ");
//		
//		kor += score[i][0];	//score 배열의 0번지 합계(국어)
//		math += score[i][1];//score 배열의 1번지 합계(영어)
//		eng += score[i][2];	//score 배열의 2번지 합계(수학)
//		
//		for(int j = 0; j <score[i].length;j++) {
//			System.out.print(score[i][j] + " ");
//			sum += score[i][j]; //총점
//		}
//		avg = (double) sum / scoreLength;
//		System.out.println(sum + " "+ avg);
//				}
//			
//		System.out.println("==========================");
//		System.out.println("과목별" + kor + " "+math+" "+eng);
//

		
		
	}
}
