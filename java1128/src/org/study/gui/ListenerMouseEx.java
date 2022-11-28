package org.study.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyMouseListener implements MouseListener{
	
	public void mouseEntered(MouseEvent e) {	//e > 실제 이벤트 적용대상
		//마우스가 버튼에 올라올때 호출
	JButton btn = (JButton)e.getSource();
	//마우스가 올라간 버튼의 주소를 알아낸다.
	btn.setBackground(Color.RED);
}
	
	public void mouseExited(MouseEvent e) {
		//마우스가 버튼에서 내려갈때 호출
		JButton btn = (JButton)e.getSource();
		//마우스가 올라간 버튼의 주소를 알아낸다
		btn.setBackground(Color.YELLOW);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//눌렀다 땠을때
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.PINK);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		  //누르고있을때
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.BLACK);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// 누르고 있다가 떘을떄
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.GREEN);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	
}

public class ListenerMouseEx extends JFrame{

	public ListenerMouseEx() {
		
		setTitle("버튼에 Mouse 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 버튼 컴포넌트를 생성하고 MouseListener를 단다
		JButton btn = new JButton("Mouse Event 테스트 버튼");
		
		btn.setBackground(Color.YELLOW);
		
		MyMouseListener Listener = new MyMouseListener();
		btn.addMouseListener(Listener);	//버튼(btn) 마우스 리스너를 단다
		
		this.add(btn);
		this.setSize(300, 150);
		this.setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		new ListenerMouseEx();
	}
}
