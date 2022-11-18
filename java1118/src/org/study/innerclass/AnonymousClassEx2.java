package org.study.innerclass;

interface I1{
	abstract void i1();
}

interface I2 extends I1{
	abstract void i2();
}

interface I3 extends I2{
	abstract void i3();
}

public class AnonymousClassEx2 {

	public static void main(String[] args) {


		I3 i = new I3() {
			
			@Override
			public void i1() {
System.out.println("i1 오버라이딩");				
			}
			
			@Override
			public void i2() {
				System.out.println("i2 오버라이딩");
			}
			
			@Override
			public void i3() {
				System.out.println("i3 오버라이딩");
			}
		};

		i.i1();
		i.i2();
		i.i3();
		

	}
}
