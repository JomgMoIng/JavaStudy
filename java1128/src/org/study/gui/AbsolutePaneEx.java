package org.study.gui;


import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AbsolutePaneEx extends JFrame{

	public AbsolutePaneEx() {

		this.setTitle("AbsolutePaneEx");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(null);

		JButton btn1 = new JButton("BTN1");
		JButton btn2 = new JButton("BTN2");
		JButton btn3 = new JButton("BTN3");
		JButton btn4 = new JButton("BTN4");
		
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);


		//버튼 사이즈
		btn1.setSize(150, 50);
		btn2.setSize(150, 50);
		btn3.setSize(150, 50);
		btn4.setSize(150, 50);
		
		//버튼 위치
		btn1.setBackground(Color.CYAN);
//		btn1.setLocation(200,30);
		btn2.setBackground(Color.GRAY);
//		btn2.setLocation(130,180);
		btn3.setBackground(Color.RED);
//		btn3.setLocation(10,33);
		//btn1,btn2,btn3 > 프레임의 정중앙에 배치하도록 설정하시오
		btn1.setLocation(0, 0);
		btn2.setLocation(450, 0);
		btn3.setLocation(0, 550);
		
		btn4.setBackground(Color.GREEN);
		btn4.setLocation(450, 550);
		
		
		//버튼위치, 버튼사이즈 같이잡기
//		btn1.setBounds(40, 50, 120, 280);
//		btn2.setBounds(20, 30, 10, 30);
//		btn3.setBounds(40, 50, 120, 280);

		
		// Object, JFrame 
		this.add(panel);
		this.setSize(600, 600);
		this.setVisible(true);
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		new AbsolutePaneEx();

		
	}
}
