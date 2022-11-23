package org.study.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("JAVA");
		set.add("JAVA"); // 중복은 에러는 나지 않지만 저장할수 없음
		set.add("DATABASE");
		set.add("WEB");
		set.add("SERVELT");
		set.add("JSP");
		set.add("SPRING");
		System.out.println(set);

		int size = set.size();
		System.out.println("총 객체 수 : " + size);

		set.remove("JAVA");

		size = set.size();
		System.out.println("총 객체 수 : " + size);

		System.out.println(set);

		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String ss = iter.next();
			System.out.println(ss);
		}

		set.clear();// set 요소 삭제

		size = set.size();
		System.out.println("총 객체 수 : " + size);

		if (set.isEmpty())
			System.out.println("set은 비어있다.");

	}
}
