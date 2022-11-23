package thread;


interface Inter1{
	void interm1();
}

interface Inter2{
	void interm2();
}



public class RamdaEx1 {

	public static void main(String[] args) {
		// 익명클래스로 인터페이스 구현하라
		
		//익명으로구현
		Inter1 i1 = new Inter1() {
			
			@Override
			public void interm1() {
				System.out.println("추상매서드");
			}
		};
		
		i1.interm1();
		//한번더
		Inter2 i3 = new Inter2() {

			@Override
			public void interm2() {
				System.out.println("Inter2");
			}
			
		};
		i3.interm2();
		
		//람다식
		
		Inter2 i4 = ()->{
			System.out.println("Inter2");
		};
		i4.interm2();
		
		
			
		//한번더
		Inter1 i2=()->{
			System.out.println("추상메서드2");
		};
		i2.interm1();
	
		
		
		
	}

	
	
}
