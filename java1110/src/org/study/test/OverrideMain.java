package org.study.test;

public class OverrideMain {

public static void main(String[] args) {
	
	ActionQueryInsert ins = new ActionQueryInsert();
	ActionQueryUpdate upd = new ActionQueryUpdate();
	ActionQueryDelete del = new ActionQueryDelete();
	ActionQuerySelect sel = new ActionQuerySelect();
	
	ins.excuteQuery();
	upd.excuteQuery();
	del.excuteQuery();
	sel.excuteQuery();
	

	
}
}
