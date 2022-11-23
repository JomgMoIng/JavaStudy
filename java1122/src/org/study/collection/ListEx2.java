package org.study.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListEx2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>(); // 1.4까지
		a1.add(10); //자동 박싱
		a1.add(20); //자동 박싱
		a1.add(30); //자동 박싱
		a1.add(40); //자동 박싱
		a1.add(50); //자동 박싱
		System.out.println("ArrayList");
		
		for(int el : a1) {
			System.out.print(el + " ");
		}
		
		
		System.out.println("----------");
		
		
		List<Integer> a2 = new ArrayList<Integer>();	//다형성
		a2.add(10);
		a2.add(20);
		a2.add(30);
		a2.add(40);
		a2.add(50);
		System.out.println("List");
		
		for(int el : a2) {
			System.out.print(el + " ");
		}
		
		//익명 클래스 이용해서 List 구현해보세요
		
		new List<Integer>() {

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<Integer> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean add(Integer e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(Collection<? extends Integer> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(int index, Collection<? extends Integer> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Integer get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Integer set(int index, Integer element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void add(int index, Integer element) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Integer remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListIterator<Integer> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator<Integer> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public List<Integer> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		
		
	}
	
	
	
	
}
