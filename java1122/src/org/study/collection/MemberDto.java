package org.study.collection;

public class MemberDto {
	private String userId;
	private String userPw;
	private String userName;
	private int userage;
	
	
	public MemberDto(String userId, String userPw, String userName, int userage) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userage = userage;
	}


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
		return userage;
	}


	public void setUserage(int userage) {
		this.userage = userage;
	}
	
	
	
	
}
