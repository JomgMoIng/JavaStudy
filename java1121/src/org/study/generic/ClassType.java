package org.study.generic; //패키지

import java.util.Date; //import
//자동으로 import는 java.lang

//접근지정자 class 클래스명 {} > 사용자 정의 타입
public class ClassType {

	//필드, property, 속성
	public int nm1;
	public String name;
	public Object obj;
	public Date day;
	private String id;
	
	//생성자(construct)
//	public ClassType() {
//		}
	
	//매서드
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
		
		
		
		
	}
}
