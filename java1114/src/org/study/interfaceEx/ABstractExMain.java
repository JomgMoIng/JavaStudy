package org.study.interfaceEx;

abstract class Ab1{
	int num1;
	abstract void abM1();
}

abstract class Ab2 extends Ab1{
	int num2;
	abstract void abM2();
}

//class Abc extends Ab1{}
class Abc extends Ab2{

	@Override
	void abM1() {
		System.out.println("ab1M");
	}

	@Override
	void abM2() {
		System.out.println("ab2M");
	}
	
}


public class ABstractExMain {

	public static void main(String[] args) {
		
		Abc abc = new Abc();
		Ab1 a = new Abc();
		Ab2 b = new Abc();
		
		
		
	}
}
