package org.study.Collection;

public class GStactMain {

	public static void main(String[] args) {

		GStact<Integer> gStack1 = new GStact<Integer>();

		int size = gStack1.oStack.length; // 배열의 전체 길이
		// push매서드 10번 실행
		for (int i = 0; i < size; i++) {

			// 10~100
			int i2 = i * 10 + 10;
			gStack1.push(i2);
			System.out.println(gStack1.oStack[i] + " ");
		}

		System.out.println("==============");

		// pop 매서드를 이용해서 모든 oStack의 배열 요소를 콘솔에 출력
		for (int i = 0; i < size; i++) {
			
			System.out.println(gStack1.pop());

		}

	}

}
