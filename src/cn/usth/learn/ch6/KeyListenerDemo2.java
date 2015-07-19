package cn.usth.learn.ch6;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class KeyListenerDemo2 extends JFrame{
	JButton button=new JButton("您按下的是：");
	public static void main(String[] args) {
		KeyListenerDemo2 frame=new KeyListenerDemo2();
		frame.setFrame();
	}
	void setFrame(){
		this.setSize(500, 300);
		this.setLocation(50, 50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.add(button,BorderLayout.NORTH);
		Font font=new Font("宋体",Font.BOLD,50);
		button.setFont(font);
		this.addKeyListener(new KeyLsn());
		this.setFocusable(true);
	}
	//定义一个监听类
	class KeyLsn implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			button.setText("您按下的是："+e.getKeyChar());
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		
	}
	
}








