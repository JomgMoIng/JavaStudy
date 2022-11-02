package org.study.operatorEx2;

import java.util.Scanner;

public class Operator12 {
	public static void main(String[] args) {

		System.out.println("반복문");
		
		int i = 10;
		//i++, 선처리 후증가
		System.out.println(i++);
		System.out.println(i);
		i++;
		System.out.println(i);

		//++i, 선증가 후처리
		System.out.println(++i);
		System.out.println(i);
		++i;
		System.out.println(i);

		int num = 10;
		//i--, 선처리 후감소
		System.out.println(num--);
		System.out.println(num);
		num--;
		System.out.println(num);

		//--i, 선감소 후처리
		System.out.println(--num);
		System.out.println(num);
		--num;
		System.out.println(num);

		for(int d=0;d<10;d++){
			System.out.println(d);
		}
		
	}
}
