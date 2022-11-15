package org.study.packageEx;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.Random;
import java.util.StringTokenizer;

public class BasicClass {

	public static void main(String[] args) {
		
	
//	java.lang 패키지(자바기본클래스) import 없이 사용
	
	Object o = null; 	// 자바의 최상위 클래스
	System s = null; 	// 표준입출력(키보드,모니터) JVM종료
	Class c = null; 	// JDBC 드라이버 찾기(클래스를 메모리로드)
	String str = null;	// 문자열저장(수정X)
	StringBuffer b = null; // 문자열저장(수정가능)
	Math m = null; 		// Math
	Integer i = null;	// Wrapper 클래스(8가지)
	
//	java.util 패키지(유용한 패키지) , 컬렉션 클래스들이 대부분
	
	String[] ab = {"manso", "1111"}; // 배열
	Arrays.asList(ab);			// 배열을 조작(비교,정렬,찾기)
	Calendar c1=null; 			// 운영체제의 시간
	Date d=null;				// 날짜와 시간
	Objects o1=null;			// 객체를 비교, null 여부
	StringTokenizer s2=null;	// 특정 문자열 기준으로 문자열 추출
	Random r=null;				// 난수 추출 (0<= X < 1)

	
	}
}
