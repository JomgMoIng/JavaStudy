package org.study.conditionEx3;

import java.util.Scanner;

public class switchEx2 {

	public static void main(String[] args) {
		System.out.println("switch");

		Scanner input = new Scanner(System.in);
		System.out.println("알파벳 입력 : ");

		String alpha=input.next();
		
		switch(alpha) { 
		case "a":
		case "A":
			System.out.println("A");
			break;
		case "b":
		case "B":
			System.out.println("B");
			break;
		case "c":
		case "C":
			System.out.println("C");
			break;
		default:
			System.out.println("a,A,b,B,c,C 이외의 알파벳입니다.");
		}

		
		
		
	}
}
