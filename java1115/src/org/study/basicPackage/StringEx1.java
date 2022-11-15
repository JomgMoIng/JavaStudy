package org.study.basicPackage;

public class StringEx1 {

	public static void main(String[] args) {

		System.out.println("String");
		
		//방법1
		String str1 = "java2022";
		//방법2
		String str2 = new String("java2022");
		
		//방법3
		char[] ch = { 'j','a','v','a','2','0','2','2',}; //char 문자를 이용
		String str3 = new String(ch);
		
		String str01 = "java2022"; //스트링리터럴(문자열리터럴)
		String str02 = "java2022"; //JVM리터럴테이블(공유)
		
		System.out.println(str01 == str02);	//객체비교
		System.out.println(str01.equals(str02));	//값
		
		String str03 = new String("java2022"); // 스트링 객체
		String str04 = new String("java2022"); // 힙
		
		System.out.println(str03 == str04);	//객체비교
		System.out.println(str03.equals(str04));	//값

		
		
		
		
		
	}
}
