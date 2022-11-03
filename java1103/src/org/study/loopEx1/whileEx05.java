package org.study.loopEx1;

import java.util.Scanner;

public class whileEx05 {
public static void main(String[] args) {
	System.out.println("while(ture)");
	//숫자 0이 입력되면 while문을 종료
	
	Scanner input = new Scanner(System.in);
	
	while(true) {
		System.out.println("숫자 입력 : ");
	int num1=input.nextInt();
	
	System.out.println("입력값 : " + num1);
		
	if(num1==0) break; //조건이 true면 반복문 종료
		
		input.close();
	}
	
	
	
	
	
}
}
