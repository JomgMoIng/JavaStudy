package org.study.packageEx;

class ObSub{
	private String name;
	private int age;
	
	public ObSub() {
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
public class ObjectEx {

	public static void main(String[] args) {
		ObSub o1 = new ObSub();
		ObSub o2 = new ObSub();
		
		System.out.println(o1.getClass());				//기본 클래스의 전체
		System.out.println(o1.getClass().getName());	//기본 클래스의 이름
		System.out.println(o1.getClass().isArray());	//기본 클래스의 배열이냐?  is...(뭐가 맞는지 물어보는것) 결과값 boolean(true/false)
		System.out.println(o1.hashCode());	// 일종의 저장주소
		System.out.println(o2.hashCode());	// 일종의 저장주소
		System.out.println(o1.toString());	// 객체 o1의 정보를 문자열로
		System.out.println(o2.toString());	// 객체 o2의 정보를 문자열로
		
		System.out.println(o1.getName());
		
		//객체를 비교
		System.out.println(o1.equals(o2));
		
		System.out.println(o1==o2);

	
		
	
	
	
	
	
	}
	
	
	
}
