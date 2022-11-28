package org.study.gui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Need {

	public static void main(String[] args) {
		try {
		InputStreamReader reader = null;

		System.out.println("이름이 무엇입니까?");
		reader = new InputStreamReader(System.in);

		BufferedReader in = new BufferedReader(reader);
		String name = in.readLine();

		System.out.println("안녕^^ " + name + " 점수를 입력하세요");

		String[] stu = { "국어", "영어", "수학" };
		int[] ju = new int[3];

		double sum = 0.0;

		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i] + ":");
			String JuIn = in.readLine();
			ju[i] = Integer.parseInt(JuIn);
			sum += ju[i]; // 국어+영어+수학
		}
		System.out.println("국어 : " + ju[0] + ", 영어 : " + ju[1] + ", 수학 : " + ju[2]);
		System.out.println("평균 : " + sum / ju.length);

	} catch (IOException e) {
		e.printStackTrace();
	} 

		
	}
}
