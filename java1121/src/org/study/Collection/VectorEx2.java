package org.study.Collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {

		// 객체형, 컬렉션 반복문 
		Vector<String> v0 = new Vector<String>();
		
		v0.add(new String ("User1"));
		v0.add(new String ("User2"));
		v0.add(new String ("User3"));
		v0.add(new String ("User4"));
		v0.add(new String ("User5"));
		
		
		// for문 > 모든 벡터요소 출력

		for(int i=0;i<v0.size();i++) {
			System.out.print(v0.get(i)+" ");
		}
				
		System.out.println();
		
		// for each문

		for(String i : v0) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		// Iterator문
		
		Iterator<String> iter = v0.iterator();
		
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.print(str+" ");
		}
		
		
		
	}
	
}
