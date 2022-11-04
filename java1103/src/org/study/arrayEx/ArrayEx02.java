package org.study.arrayEx;

import java.util.Scanner;

public class ArrayEx02 {
	public static void main(String[] args) {
		System.out.println("배열");

		int[] arr1 = new int[5];
		System.out.println(arr1);

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		int[] arr2 = new int[] { 1, 2, 3, 4, 5 };
		

		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("=============");

		int[] arr3= {1,2,3,4,5};
		for(int i:arr3) {
			System.out.println(i);
		}
		
		char[] arrCh = {'a','b','c','d','e'};
		for(int i=0;i<arrCh.length;i++) {
		
			System.out.println(arrCh[i]);
		}
		
		String[] strArr = {"JAVA", "JSP", "THYEMLEAF","JAVASCRIPT","HTML"};
		for(String str:strArr) {
			System.out.println(str);
		}
		
	}
}
