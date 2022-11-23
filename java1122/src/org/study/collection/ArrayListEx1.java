package org.study.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {

	public static void main(String[] args) {
		System.out.println("ArrayList");
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		

		for(int i=0;i<5;i++) {
			
			list1.add(new Integer(i*10+10));
		}
	
		System.out.println(list1);
		
		for(Integer i : list1) {
			System.out.print(i+"\t");
		}
		System.out.println(list1.size());
		list1.add(2, 1000);
		
		System.out.println(list1.add(1000));
		
		System.out.println(list1.get(0));
		

		Iterator<Integer> iter = list1.iterator();
		while(iter.hasNext()) {
			Integer s = iter.next();
			System.out.print(s+" ");
		}
		
		
		
	}
}
