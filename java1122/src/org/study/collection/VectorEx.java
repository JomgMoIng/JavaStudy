package org.study.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		Vector<Integer> v0 = new Vector<Integer>();
		
//		Integer s1 = new Integer(10);
//		Integer s2 = new Integer(20);
//		Integer s3 = new Integer(30);
//		Integer s4 = new Integer(40);
//		Integer s5 = new Integer(50);
//		v0.add(i1);
		
		//위에것을 간추려 직접 추가
		v0.add(new Integer(10));
		v0.add(new Integer(20));
		v0.add(new Integer(30));
		v0.add(new Integer(40));
		v0.add(new Integer(50));

		for(Integer i : v0) {
			System.out.println(i);
		}
		
		System.out.println("=============");
		
		Vector<MemberDto> users = new Vector<MemberDto>();
		
		MemberDto user1 = new MemberDto("m1", "1111", "s111", 11);
		MemberDto user2 = new MemberDto("m2", "1112", "s112", 12);
		MemberDto user3 = new MemberDto("m3", "1113", "s113", 13);
		MemberDto user4 = new MemberDto("m4", "1114", "s114", 14);
		MemberDto user5 = new MemberDto("m5", "1115", "s115", 15);

		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
		System.out.println(users.get(0));
		System.out.print("아이디 : "+users.get(0).getUserId()+" ");
		System.out.print("비밀번호 : "+users.get(0).getUserPw()+" ");
		System.out.print("이름 : "+users.get(0).getUserName()+" ");
		System.out.print("나이 : "+users.get(0).getUserage()+" ");

		
		System.out.println("foreach문");
		
		//foreach
		
		for(MemberDto user : users) {
			System.out.print("아이디 : "+user.getUserId()+" ");
			System.out.print("비밀번호 : "+user.getUserPw()+" ");
			System.out.print("이름 : "+user.getUserName()+" ");
			System.out.println("나이 : "+user.getUserage()+" ");
		}

		
		System.out.println("Iterator");
		
		Iterator<MemberDto> iter = users.iterator();
		//Iterator
		while(iter.hasNext()) {
			MemberDto user=iter.next();
			System.out.print("아이디 : "+user.getUserId()+" ");
			System.out.print("비밀번호 : "+user.getUserPw()+" ");
			System.out.print("이름 : "+user.getUserName()+" ");
			System.out.println("나이 : "+user.getUserage()+" ");
		}
		

		ArrayList<Integer> d = new ArrayList<Integer>();
		
		

		
		
		
	}
}
