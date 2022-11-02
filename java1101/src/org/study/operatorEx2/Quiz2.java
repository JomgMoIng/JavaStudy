package org.study.operatorEx2;



import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {

//		Quiz_Condition
//		학점 계산
//
//		정수로 입력
//		국어점수:  kor
//		수학점수:  math
//		영어점수:  eng
//		총점: sum=kor+math+eng
//		평균: avg=sum/3 (소수는 무시->모든 변수는 int)
//
//		if~else if~else 이용해서
//		평균>=90 "A"
//		평균>=80 "B"
//		평균>=70 "C"
//		평균>=60 "D"
//		평균<60 "F"
//
//		콘솔에 출력
//		1. 총점: 
//		2. 평균:
//		3. 학점: 
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("국어점수를 입력하시오");
		int kor=in.nextInt();
		
		
		System.out.print("수학점수를 입력하시오");
		int math=in.nextInt();

		System.out.print("영어점수를 입력하시오");
		int eng=in.nextInt();

		int sum=kor+math+eng;
		double avg=(double)sum/3;
		
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		
		
//		밑에와 같음 하나하나 표현값을 주는것보다 변수하나를 지정하고 그걸이용해 하는것도 방법
//		if(avg>=90) {
//			System.out.println("학점 : A");
//		}else if(avg>=80) {
//			System.out.println("학점 : B");
//		}else if(avg>=70) {
//			System.out.println("학점 : C");
//		}else if(avg>=60) {
//			System.out.println("학점 : D");
//		}else {
//			System.out.println("학점 : F");
//		}

		String jumsu= "";

		if(avg>=90) {
			jumsu = "A";
		}else if(avg>=80) {
			jumsu = "B";
		}else if(avg>=70) {
			jumsu = "C";
		}else if(avg>=60) {
			jumsu = "D"; 
		}else {
			jumsu = "F";
		}
		System.out.println("학점 : " + jumsu);


		
	}
}
