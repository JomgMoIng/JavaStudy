package org.study.basicPackage;

import java.util.StringTokenizer;

public class StirngTokennizeeEx1 {

	public static void main(String[] args) {
		
		String ur1 = "userId=m111&userPw=1111&userName=s1111";
		StringTokenizer token = new StringTokenizer(ur1,"&");
		System.out.println("토큰의 갯수");
		//토큰이 있으면
	
		while(token.hasMoreTokens()) {
			String ntoken = token.nextToken();	//다음 토큰
			System.out.println(ntoken);
		}
		System.out.println("======================================");
		
		String phone = "010-1234-5678";
		StringTokenizer token2 = new StringTokenizer(phone, "-");
		
		System.out.println("토큰의 갯수 : "+ token2.countTokens());
		while(token2.hasMoreTokens()) {
			String ntoken = token2.nextToken();
			System.out.println(ntoken);
		}
		
		
	}
}
