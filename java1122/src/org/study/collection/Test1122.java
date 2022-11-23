package org.study.collection;

import java.util.Vector;

class A {
	int n;
	String s1;

	int m1() {
		return 0;
	}
}

//제네릭타입 타입을 정하지않고 명시만 해둠
class G1<T> {
	T t1;

	T m1(T t2) {

		return t2;
	}
}

public class Test1122 {
	public static void main(String[] args) {

		G1<String> g1 = new G1<String>();

		g1.t1 = "String";
		String m1 = g1.m1("d");

		G1<Integer> g2 = new G1<Integer>();
//	g2.t1 = new Integer(10);// 박싱
		g2.t1 = 10; // 자동 박싱

		Integer i1 = g2.m1(new Integer(10)); // 박싱
		int i2 = g2.m1(new Integer(10)).intValue(); // 언박싱
		int i3 = g2.m1(10); // 자동 언박싱

		// 기본형
		int i = 10;

		// 객체형 = new
		String str = new String("문자열");
//	String str2="문자열";

		Integer i4 = new Integer(10);
//	Integer i5 = 10;

		MemberDto user1 = new MemberDto("m1", "1111", "s111", 11);
		MemberDto user2 = new MemberDto("m2", "1112", "s112", 12);
		MemberDto user3 = new MemberDto("m3", "1113", "s113", 13);
		MemberDto user4 = new MemberDto("m4", "1114", "s114", 14);
		MemberDto user5 = new MemberDto("m5", "1115", "s115", 15);

		// 객체 user1
		System.out.print("user1 ");
		System.out.print("아이디 : " + user1.getUserId());
		System.out.print("비밀번호 : " + user1.getUserPw());
		System.out.print("이름 : " + user1.getUserName());
		System.out.print("나이 : " + user1.getUserage());

		System.out.println();
		// 객체 user2
		System.out.print("user2 ");
		System.out.print("아이디 : " + user2.getUserId());
		System.out.print("비밀번호 : " + user2.getUserPw());
		System.out.print("이름 : " + user2.getUserName());
		System.out.print("나이 : " + user2.getUserage());

		System.out.println();
		// 객체 user3
		System.out.print("user3 ");
		System.out.print("아이디 : " + user3.getUserId());
		System.out.print("비밀번호 : " + user3.getUserPw());
		System.out.print("이름 : " + user3.getUserName());
		System.out.print("나이 : " + user3.getUserage());
		System.out.println();
		// 객체 user4
		System.out.print("user4 ");
		System.out.print("아이디 : " + user4.getUserId());
		System.out.print("비밀번호 : " + user4.getUserPw());
		System.out.print("이름 : " + user4.getUserName());
		System.out.print("나이 : " + user4.getUserage());
		System.out.println();
		// 객체 user5
		System.out.print("user5 ");
		System.out.print("아이디 : " + user5.getUserId());
		System.out.print("비밀번호 : " + user5.getUserPw());
		System.out.print("이름 : " + user5.getUserName());
		System.out.print("나이 : " + user5.getUserage());

	}

}
