package org.study.thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test1124 {

	public static void main(String[] args) {

		Stack<Integer> st1 = new Stack();

		st1.push(new Integer(10)); // 박싱
		st1.push(30); // 자동박싱
		st1.push(21);
		st1.push(38);
		st1.push(80); // .push 마지막에 추가

		System.out.println(st1);

		System.out.println(st1.peek()); // .peek 마지막에 해당되는 요소 반환

		System.out.println(st1.pop()); // .pop 마지막에 해당되는 요소 반환 및 제거
		System.out.println(st1);

		Queue<Integer> qu = new LinkedList();

		for (int i = 0; i < 5; i++) {
			qu.add(i * 10 + 10);

		}
		System.out.println(qu);
		System.out.println(qu.peek());

		int i = 2;
		int j = 2;

		while (i < 10) {
			System.out.println(i + "단입니다");

			while (j < 10) {

				System.out.println(i + "*" + j + "=" + (i * j));

				j++;

			}
			j = 2;

			i++;

		}

	}
}
