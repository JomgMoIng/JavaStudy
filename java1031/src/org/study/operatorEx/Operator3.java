package org.study.operatorEx;

public class Operator3 {
public static void main(String[] args) {
	System.out.println("비교연산자 문자(객체)");
	
//	String atr1=new String("java");
//	atr1="java";
	String str1=new String("java"); // 위아래가 다른주소
	String str2=new String("java"); //
	String str3="java"; //공통공간에 들어가 "java"로 찾으면 객체로 같음
	
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	System.out.println(str1==str2); // 주소가 다름
	System.out.println(str1.equals("java"));//"java"라는 표시되는거를 묻는거라 셋다 맞음
	System.out.println("java".equals(str2));
	System.out.println(str3.equals("java"));

}
}
