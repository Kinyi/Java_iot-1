package cn.usth.learn.ch6;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class KeyListenerDemo4 extends JFrame{
	JButton button=new JButton("�����µ��ǣ�");
	public static void main(String[] args) {
		KeyListenerDemo4 frame=new KeyListenerDemo4();
		frame.setFrame();
	}
	void setFrame(){
		this.setSize(500, 300);
		this.setLocation(50, 50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.add(button,BorderLayout.NORTH);
		Font font=new Font("����",Font.BOLD,50);
		button.setFont(font);
		this.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e) {
				button.setText("�����µ��ǣ�"+e.getKeyChar());
			}
		});
		this.setFocusable(true);
	}
}








