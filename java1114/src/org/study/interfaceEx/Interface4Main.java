package org.study.interfaceEx;


interface A{
	void a1();
}

interface A2 {
	void a2();
}

interface B extends A, A2{ // 인터페이스끼리 상속시 extends 사용, 다중상속 가능
	void b1();
}

class AB implements B{

@Override
public void a1() {
	// TODO Auto-generated method stub
	
}

@Override
	public void a2() {
		// TODO Auto-generated method stub
		
	}

@Override
	public void b1() {
		// TODO Auto-generated method stub
		
	}


}

public class Interface4Main {

	public static void main(String[] args) {
		
		AB ab = new AB();
		
		
		
	}
}
