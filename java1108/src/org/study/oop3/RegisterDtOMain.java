package org.study.oop3;

public class RegisterDtOMain {
public static void main(String[] args) {
	
	RegisterDtO rdt = new RegisterDtO();

	
	rdt.setUser_no(123);
	System.out.println(rdt.getUser_no());

	rdt.setUserName("핫식스");
	System.out.println(rdt.getUserName());
	
	rdt.setUserPhone("01010101010");
	System.out.println(rdt.getUserPhone());
	
	rdt.setAddress("집");
	System.out.println(rdt.GetAddress());
	
	rdt.setInDate("몰라");
	System.out.println(rdt.getIndate());
	
	rdt.setGrade("1");
	System.out.println(rdt.getGrade());
	
	rdt.setCity("ㅇㅈ");
	System.out.println(rdt.getCity());
	
	
}
}
