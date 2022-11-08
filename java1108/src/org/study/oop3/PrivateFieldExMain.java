package org.study.oop3;

public class PrivateFieldExMain {


public static void main(String[] args) {
	
	PrivateFieldEx ins1 = new PrivateFieldEx();

	ins1.addr = "서울시 노원구 상계동";

	// setter로 private userid를 초기화
	ins1.setUserId("m111");
	
	// getter로 초기화한 값을 불러온다 (String 으로 해서 String으로 변환 후 출력)
	String userId = ins1.getUserId();
	System.out.println(ins1.getUserId());

	ins1.setUserPw("1111");
	System.out.println(ins1.getUserPw());

	ins1.setUserAge(20);
	
	int userAge = ins1.getUserAge();
	System.out.println(userAge);


}

	
	
	
	
	
	
}
