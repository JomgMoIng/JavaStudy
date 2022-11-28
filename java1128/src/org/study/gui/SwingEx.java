package org.study.gui;

import java.awt.Color;

import javax.swing.JFrame;

public class SwingEx extends JFrame {

	public SwingEx() {
		setTitle("SwingEx Title");
		setSize(300, 300);
		setVisible(true);
		setBackground(Color.BLUE);
	}
	
	
	
	public static void main(String[] args) {
		
		new SwingEx();
		
	}
	
	
}
