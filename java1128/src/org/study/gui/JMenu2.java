package org.study.gui;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class JMenu2 extends JFrame implements ActionListener {

	JPanel jPanel; // 패널
	JMenuBar jMenuBar; // 메뉴바
	JMenu jMenu1, jMenu2; // 메뉴 1,2
	JMenuItem jMenuItem1, jMenuItem2, jMenuItem3, exit; // 메뉴 아이템

	public JMenu2() {
		super("JMenu2 예제");
		jMenuBar = new JMenuBar();
		this.setJMenuBar(jMenuBar); // 1. 메뉴바 추가

		jMenu1 = new JMenu("파일"); // 메뉴1
		jMenu2 = new JMenu("도움말"); // 메뉴2

		jMenuItem1 = new JMenuItem("메뉴1(e)"); // 메뉴1 아이템
		jMenuItem2 = new JMenuItem("새창(e)"); // 메뉴1 아이템
		jMenuItem3 = new JMenuItem("메뉴3(e)"); // 메뉴1 아이템
		exit = new JMenuItem("닫기(e)"); // 메뉴2 아이템

		// 2. 메뉴의 메뉴 아이템을 추가
		jMenu1.add(jMenuItem1);
		jMenu1.add(jMenuItem2);
		jMenu1.add(jMenuItem3);
		jMenu2.add(exit);

		// 3. 메뉴바에 메뉴1, 메뉴2 추가
		jMenuBar.add(jMenu1);
		jMenuBar.add(jMenu2);

		setSize(400, 300);
		this.setVisible(true);

		// 이벤트 구현
		jMenuItem1.addActionListener(this);
		jMenuItem2.addActionListener(this);
		exit.addActionListener(this);

	}

	// e > 이벤트 실제 target
	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트 target 구별
		if (e.getSource() == exit) {
			System.out.println("종료합니다");
			System.exit(0);
		} else if (e.getSource() == jMenuItem1) {
			System.out.println("메뉴1(e) 선택");
		} else if (e.getSource() == jMenuItem3) {
			System.out.println("메뉴3(e) 선택");
		} else if (e.getSource() == jMenuItem2) {
			System.out.println("새창(e) 선택");
			newWindow(); // 메서드(새창띄우기)

		}

	}

	// Dialog 생성 메서드
	private void newWindow() {
		// 컨테이너 JFrame,JPanel
		// JFrame > 윈도우
		// JPanel > 그룹핑된
		JPanel jPanel = new JPanel();
		Dialog dialog = new Dialog(this, "새창열기");
		Button btn = new Button("CLOSE");

		dialog.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 100));
		btn.setSize(100, 100);
		jPanel.add(btn);
		dialog.add(jPanel);

		dialog.setSize(300, 200);
		dialog.setVisible(true);

		// btn 클릭하면 dialog 가 보이지 않게 이벤트 구현

		// 1 추상클래스
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("dialog 지우기 > 추상클래스");
				dialog.setVisible(false);
			}
		});

		// 2 람다식
		btn.addActionListener((ActionEvent e) -> {
			System.out.println("dialog 지우기 > 람다식");
			dialog.setVisible(false);
		});

	}

	public static void main(String[] args) {
		new JMenu2();

	}

}
