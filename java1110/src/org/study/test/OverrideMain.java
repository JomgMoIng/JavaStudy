package org.study.test;

import java.util.Scanner;

public class OverrideMain {

public static void main(String[] args) {
	
//	ActionQueryInsert ins = new ActionQueryInsert();
//	ActionQueryUpdate upd = new ActionQueryUpdate();
//	ActionQueryDelete del = new ActionQueryDelete();
//	ActionQuerySelect sel = new ActionQuerySelect();
//	
//	ins.excuteQuery();
//	upd.excuteQuery();
//	del.excuteQuery();
//	sel.excuteQuery();

//	OverrideBasic action = new ActionQueryInsert();
//	action.excuteQuery();
//	
//	action = new ActionQuerySelect();
//	action.excuteQuery();
//	action = new ActionQueryDelete();
//	action.excuteQuery();
//	action = new ActionQueryUpdate();
//	action.excuteQuery();

//	실제 프로젝트 구현 모델
	
	OverrideBasic action =null;
	String query = "";
	
	System.out.println("쿼리문 입력하세요");
			Scanner input = new Scanner(System.in);
	query = input.next();
	
	if(query.equals("insert")) {
			action = new ActionQueryInsert();
			action.excuteQuery();
	} else if(query.equals("delete")) {
		action = new ActionQueryDelete();
		action.excuteQuery();
	} else if(query.equals("Update")) {
		action = new ActionQueryUpdate();
		action.excuteQuery();
	} else if(query.equals("Select")) {
		action = new ActionQuerySelect();
		action.excuteQuery();
	} else {
		System.out.println("SQL 입력오류");
	}
	
	
	
}
}
