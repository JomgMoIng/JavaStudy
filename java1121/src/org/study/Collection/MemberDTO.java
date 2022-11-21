package org.study.Collection;

import java.lang.reflect.Constructor;

public class MemberDTO {

	private String userId;
	private String userPw;
	private String userName;
	private int age;

//	생성자 4개 Alt+Shift+S > constructor

	public MemberDTO(String userId, String userPw, String userName, int userage) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.age = userage;
	}

//	getter, setter

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserage() {
		return age;
	}

	public void setUserage(int userage) {
		this.age = userage;
	}

	@Override
	public String toString() {
		String user = "아이디 : " + userId + ", 비밀번호 : " + userPw + ", 이름 : " + userName + ", 나이 : " + age;
		return user;
	}

}
