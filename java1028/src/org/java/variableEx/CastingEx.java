package org.java.variableEx;

public class CastingEx {
public static void main(String[] args) {
	
	System.out.println("형변화");
	
	int i=10;
	double d=1.1;
	
	double d2=i+d; //int + double = double
	
	double d3=20+1.5;
	
	byte b1=10;
	byte b2=20;
	int i3=b1+b2; //byte + byte = int
	
	short s1=10;
	int i4=25;
	int i5=i4+s1; // short + byte = int
	
	System.out.println(i5);
	
	System.out.println("강제 형변화"); // 강제로 변환시켜서 손실이 생길수 있음
	
	int j=(int)1.1; //data의 손실
	int j2=10+(int)1.1; // 강제로 int 형으로 변환하여 0.1 손실
	
	System.out.println(j);
	System.out.println(j2);
	
	byte b4=100;
	byte b5=50;
	byte b6=(byte)(b4+b5);
	
	System.out.println(b6);
	
	

}
}
