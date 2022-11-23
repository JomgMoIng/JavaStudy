package thread;


class TreadSub2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Runnable interface run()");
	}
	
}



public class ThreadEx3 {

	public static void main(String[] args) {

		//1. Runnable 스레드 구현 방법
		Runnable r1 = new TreadSub2();

		Thread t1 = new Thread(r1);	//TreadSub2에 매개변수로 추가
	
		t1.start();
		
		//2. Thread(익명클래스)
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runable interafce 익명클래스 이용");
			}
		});
		t2.start();
		
		//3. 람다식 > 
		new Thread(()->{
			System.out.println("람다식으로 스레드 구현");
		});
		
	}
}
