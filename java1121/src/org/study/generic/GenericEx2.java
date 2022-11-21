package org.study.generic;

class Gen1 {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}

class Gen2 {
	private String num;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
}

class Gen3<T> {
	private T num;
	public T getNum() {
		return num;
	}
	public void setNum(T num) {
		this.num = num;
	}
}



public class GenericEx2 {

	public static void main(String[] args) {

		//일반클래스 생성
		Gen1 g1 = new Gen1();
		g1.setNum(10);
		System.out.println(g1.getNum());
		
		//일반클래스 생성
		Gen2 g2 = new Gen2();
		g2.setNum("dd");
		System.out.println(g2.getNum());
		
		
		//제네릭타입 클래스
		Gen3<Integer> g3 = new Gen3<Integer>();
		
		Integer i = 10;
		
		g3.setNum(i);	//박싱
		g3.setNum(20);	//자동박싱
		System.out.println(g3.getNum());
		
		Gen3<String> g4 = new Gen3<String>();
		
		g4.setNum("root");
		System.out.println(g4.getNum());
		
		//기본타입 X > Wrapper클래스 적용(박싱, 언박싱)
		Gen3<Float> g5 = new Gen3<Float>();
		Gen3<Long> g6 = new Gen3<Long>();
		Gen3<Byte> g7 = new Gen3<Byte>();
		Gen3<Short> g8 = new Gen3<Short>();
		Gen3<Double> g9 = new Gen3<Double>();
		Gen3<Character> g10 = new Gen3<Character>();
		Gen3<Boolean> g11 = new Gen3<Boolean>();
		
		// 타입 비교
		if (g3.getNum() instanceof Integer) {
			System.out.println("Integer");
		}
		
		if(g4.getNum()instanceof String) {
			System.out.println("String");
		}
		
		
	}

	

}
