package org.project.controller;

import java.util.Scanner;

import org.project.commend.MemberCommend;
import org.project.commend.MemberDeleteDo;
import org.project.commend.MemberInsertDo;
import org.project.commend.MemberSelectAgeDo;
import org.project.commend.MemberSelectDo;
import org.project.commend.MemberUpdateDo;

public class MemberController {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		MemberCommend commend = null;
		String query = null;

		while (true) {
			System.out.println("SQL문 입력(insert,update,select,delete, sa)");
			query = input.next();

			if (query.equals("insert")) {
				commend = new MemberInsertDo();
				commend.excuteQueryCommend();
			} else if (query.equals("update")) {
				commend = new MemberUpdateDo();
				commend.excuteQueryCommend();
			} else if (query.equals("select")) {
				commend = new MemberSelectDo();
				commend.excuteQueryCommend();
			} else if (query.equals("delete")) {
				commend = new MemberDeleteDo();
				commend.excuteQueryCommend();
			} else if (query.equals("sa")) {
				commend = new MemberSelectAgeDo();
				commend.excuteQueryCommend();
			} else if (query.equals("exit")) {
				System.out.println("醫낅즺");
				break;
			} else {
				System.out.println("�엯�젰�삤瑜�");
			}

		}

	}
}
