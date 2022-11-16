package org.study.basicPackage;

import java.util.Scanner;

public class Totoken {

	//String 타입의 변수 userId, userPw, userName
	//Scanner클래스를 이용해 초기화 시키고
	// concat(); 문자열 합치는 매서드를 이용해
	
public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	
	System.out.print("아이디 입력 : ");
	String userId = scn.next();
	String userId2 = "userId=".concat(userId);
	System.out.println(userId2);
	
	System.out.print("비밀번호 입력 : ");
	String userPw =scn.next();
	String userPw2 = "userPw=".concat(userPw);
	System.out.println(userPw2);
	
	System.out.print("이름 입력 : ");
	String userN = scn.next();
	String userN2 = "userN=".concat(userN);
	System.out.println(userN2);
	
	String to = userId2+("&").concat(userPw2)+("&").concat(userN2);
	System.out.println(to);
	

	scn.close();

}
	
	
}
