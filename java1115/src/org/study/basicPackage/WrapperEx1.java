package org.study.basicPackage;

public class WrapperEx1 {

public static void main(String[] args) {
	
	System.out.println("Wrapper 클래스");
	System.out.println("기본타입 >> Wrapper(박싱)");
	
	//박싱
	int i = 10;
	Integer it1 = new Integer(i);
	
	Byte b2 = new Byte((byte)10);
	Short s2 = new Short((short)10);
	Integer i2 = new Integer(10);
	Long l2 = new Long((long)10);
	Float f2 = new Float((float)10);
	Double d2 = new Double((double)10);
	Character c2 = new Character('a');
	Boolean bool2 = new Boolean(false);
	
	System.out.println(b2);
	System.out.println(s2);
	System.out.println(i2);
	System.out.println(l2);
	System.out.println(f2);
	System.out.println(d2);
	System.out.println(c2);
	System.out.println(bool2);
	
	
	
	
	
	
	
	
	
}	
	
	
}
