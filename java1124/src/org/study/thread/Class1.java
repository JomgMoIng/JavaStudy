package org.study.thread;

class Thread3 extends Thread{
	
	String str = "java database";

	@Override
	public void run() {
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
			try {
				Thread1.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
				super.run();
	}
}


public class Class1 {

	public Class1() {	// 자기자신을 호출 할 수있다
		
		System.out.println("기본생성자");
	}
	
	public static void main(String[] args) {
		
		new Class1();
		
		
		Thread3 t3 = new Thread3();
		t3.start();
		
//		String str = "12345";
//		
//		for(int i=0;i<str.length();i++) {
//			System.out.println(str.charAt(i));	
//		}
		
	}
	

}
