package org.study.Collection;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		
		// List<E> 인터페이스 슈퍼클래스
		// 순서가 있다.
		// 길이가 자동 조절
		// 객체를 요소로 가지고 있다.
		// 중복값을 허용
		
		Vector<Integer> v0 = new Vector<Integer>();
		
//		Integer i = new Integer(1000);
//		Integer i = 1000;
		//
		v0.add(new Integer(1000)); //박싱
		v0.add(2000); //자동박싱
		v0.add(3000);
		v0.add(2000);
		v0.add(5000);
		
		System.out.println("백터 v0요소 갯수 : " +v0.size());
		System.out.println(v0);
		//백터 v0의 모든 요소를 콘솔에 출력 for문
		
		for(int i=0;i<v0.size();i++) {
			
			System.out.print(v0.get(i)+" ");
		}
		System.out.println();
		//반복문 > foreach
		for(Integer el:v0) {
			System.out.print(el+" ");
		}
		
		System.out.println();
		System.out.println(v0.size());
		//
		v0.add(1, 1500);
		
		for(int i:v0) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println(v0.size());
		
		
		Vector<Integer> v1 = new Vector<Integer>();

		v1.add(111);
		v1.add(211);
		v1.add(311);
		v1.add(411);
		v1.add(511);

		for(int i:v1) {
			System.out.print(i+" ");
		}
		System.out.println();
		//
		v0.addAll(v1);

		for(int i:v0) {
			System.out.print(i+" ");
		}
		System.out.println();

		System.out.println(v0.size());
		
		//
		System.out.println();
										
		System.out.println(v0.contains(new Integer(1000)));
		System.out.println(v0.contains(2000)); // 자동 언박싱
		System.out.println(v0.contains(10));
		
		if(v0.contains(10)) {
			System.out.println("10포함되지 않음");
		} else {
			System.out.println("10이포함");
		}
		
		System.out.println(v0.elementAt(5));
		System.out.println(v0.indexOf(5000));
		System.out.println(v0.indexOf(5000000));
		System.out.println(v0.isEmpty());

		for(int i:v0) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println(v0.size());
		//
		v0.remove(0); //특정 인덱스 요소를 삭제
		System.out.println(v0.size());
		
		for(int i:v0) {
			System.out.print(i+" ");
		}

		System.out.println();
		
		v0.remove(new Integer(1500)); //특정요소를 삭제
//		v0.remove(1500); 주소값의 요소를 지우는 리무브, 값을 지우는 리무브 두가지가 있어서 값을 지우려면 Integer로 넣는다 
		
		for(int i:v0) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		//
//		v0.clear();	 // 모든요소 삭제
//
//		System.out.println(v0);
		System.out.println(v0.size());

		v0.removeAll(v1); // v1 컬렉션 제거
		
		System.out.println(v0);
		
		Object[] arrObj = v0.toArray();
		
		System.out.println(arrObj);
		
		
		
		
	}
	
}
