package org.study.Collection;

import java.util.Iterator;

import org.study.Collection.MemberDTO;

import java.util.Vector;

public class VectorEx3 {

	public static void main(String[] args) {

		Vector<String> v0 = new Vector<String>();

		v0.add(new String("user1"));
		v0.add(new String("user2"));
		v0.add(new String("user3"));
		v0.add(new String("user4"));
		v0.add(new String("user5"));


		Iterator<String> iter = v0.iterator();
		while(iter.hasNext()) {
			String el = iter.next();
			System.out.print(el + " ");
		}

		System.out.println();
		
		Vector<MemberDTO> users = new Vector<MemberDTO>();
		
		users.add(new MemberDTO("m1", "1111", "포", 10));
		users.add(new MemberDTO("m2", "2222", "켓", 20));
		users.add(new MemberDTO("m3", "3333", "몬", 30));
		users.add(new MemberDTO("m4", "4444", "스칼렛", 40));
		users.add(new MemberDTO("m5", "5555", "바이올렛", 50));
		
		//for문
		for(int i = 0; i <users.size(); i++) {
			System.out.print("아이디 : "+users.get(i).getUserId()+" ");
			System.out.print("비밀번호 : "+users.get(i).getUserPw()+" ");
			System.out.print("이름 : "+users.get(i).getUserName()+" ");
			System.out.println("나이 : "+users.get(i).getUserage()+" ");
		}
		
		System.out.println();
		
		//for문 toString 오버라이드 이용
		for(int i = 0; i<users.size();i++) {
			System.out.println(users.get(i));
		}
		
		
		
		System.out.println();
		
		//for each문
		for(MemberDTO i : users) {
			System.out.println(i);
		}
		
		System.out.println();
		//Iterator문
		
		Iterator<MemberDTO> iter2 = users.iterator();
		
		while(iter2.hasNext()) {
			MemberDTO md = iter2.next();
			System.out.println(md);
		}
		
		
	}
	
}
