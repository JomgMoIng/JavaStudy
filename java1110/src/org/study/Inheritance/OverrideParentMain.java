package org.study.Inheritance;

public class OverrideParentMain {

	public static void main(String[] args) {
		
		OverrideSub1 sub1 = new OverrideSub1();
		OverrideSub2 sub2 = new OverrideSub2();
		OverrideSub3 sub3 = new OverrideSub3();

		sub1.excuteQuery(11);
		sub2.excuteQuery(22);
		sub3.excuteQuery(33);
		
		
	}
	
	
}
