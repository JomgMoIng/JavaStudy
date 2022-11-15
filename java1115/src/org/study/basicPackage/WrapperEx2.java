package org.study.basicPackage;

public class WrapperEx2 {

public static void main(String[] args) {
	
	System.out.println("Wrapper 클래스");

	System.out.println("기본타입 >> Wrapper(박싱)");

	Byte b2 = new Byte((byte)10);
	Short s2 = new Short((short)10);
	Integer i2 = new Integer(10);
	Long l2 = new Long((long)10);
	Float f2 = new Float((float)10);
	Double d2 = new Double((double)10);
	Character ch2 = new Character('a');
	Boolean bool2 = new Boolean(false);
	
	System.out.println("Wrapper(박싱) >> 기본타입");
	
	
	Byte b3 = b2.byteValue();
	Short s3 = s2.shortValue();
	Integer i3 = i2.intValue();
	Long l3 = l2.longValue();
	Float f3 = f2.floatValue();
	Double d3 = d2.doubleValue();
	Character ch3 = ch2.charValue();
	Boolean bool3 = bool2.booleanValue();

	
	
	
	
	
	
}	
	
	
}
