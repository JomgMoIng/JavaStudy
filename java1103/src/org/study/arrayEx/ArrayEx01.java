package org.study.arrayEx;

import java.util.Scanner;

public class ArrayEx01 {
	public static void main(String[] args) {
		System.out.println("배열");
		//int배열 arr1을 선언 하고 초기화 하였다.	
		int[] arr1 = new int[5];
					// int형 data 5개를 저장할 수 있는 배열
		
		System.out.println(arr1);
		
		arr1[0]=10;// arr1의 0번지를 10으로 선언
		arr1[1]=20;// arr1의 1번지를 20으로 선언
		arr1[2]=30;// arr1의 2번지를 30으로 선언
		arr1[3]=40;// arr1의 3번지를 40으로 선언
		arr1[4]=50;// arr1의 4번지를 50으로 선언
		
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		
		int arr1size=arr1.length; // 배열의 길이
		System.out.println(arr1size);
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=i*10+10;
			System.out.println(arr1[i]);
		}

		System.out.println("=========");
		//freach 형태로 모든 데이터를 출력할때 사용
		for(int i:arr1) {
			System.out.println(i);
		}
		
		
	}
	
}
