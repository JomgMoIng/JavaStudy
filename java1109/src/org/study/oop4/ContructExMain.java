package org.study.oop4;

public class ContructExMain {

	public static void main(String[] args) {
		
	ContructEx c1 = new ContructEx();
	c1.setUserId("m0");
	c1.setUserPw("00");
	c1.setAge(11);
	
	System.out.println(c1.toString());
	c1.info();
	
	System.out.println(c1.getUserId());
	System.out.println(c1.getUserPw());
	System.out.println(c1.getAge());
	
	ContructEx c2 =	new ContructEx("m1");
	c2.info();
	ContructEx c3 = new ContructEx("m2","11");
	c3.info();
	ContructEx c4 = new ContructEx("m11","33",33);	
	c4.info();
	
		
		
		
		
		
		
		
	}


	
	
	
}
