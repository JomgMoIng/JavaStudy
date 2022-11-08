package org.study.oop3;

public class PrivateFieldEx {

	private String userId;
	private String userPw;
	private int userAge;
	public String addr;
	
	//setters, getters
	
	//setter > private 필드를 외부에 초기화 메서드
	//공식 (setUserId로 프라이빗 userId를 초기화 할수있다)
	public void setUserId(String userId) {

		//필드  = 매개변수(외부접근)
		this.userId=userId;
	}	//필드에 userId //매개변수 aa
	
	//getter > private 필드를 외부에 호출 매서드
	//공식 (setter로 초기화한 private을 반환)
	public String getUserId() {
		return this.userId;
	}
	
	// userPw, userAge > setter, getter 매서드를 생성
	public void setUserPw(String userpw) {
		this.userPw=userpw;
	}
	
	public String getUserPw() {
		return this.userPw;
	}
	
	public void setUserAge(int userAge) {
		this.userAge=userAge;
	}
	
	public int getUserAge() {
		return this.userAge;
	}
	
	
	
	
	
	
}
