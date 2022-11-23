package thread;

import java.awt.Toolkit;

class ThreadSub2 extends Thread{
	
	int num=0;
	
	@Override
	public void run() {
	
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		for(int i=0;i<10;i++) {
			System.out.println("ThreadSub2 : num > "+num++);
			toolkit.beep();//비프음
			
			try {
				Thread.sleep(1000);	// 쓰레드 구현시 예외처리를 해야함, 1초지연				
			} catch(InterruptedException e){
				e.printStackTrace();
			}
			

		}
		
		super.run();
	}
}



public class ThreadEx2 {

	public static void main(String[] args) {

		ThreadSub2 t1 = new ThreadSub2();
		t1.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("main Thread : "+i);
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
		System.out.println("main 스레드 종료");
		
		
		
		

		
		
	}
}
