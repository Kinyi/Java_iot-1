package cn.usth.learn.ch6;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class KeyListenerDemo1 extends JFrame 
	implements KeyListener
{
	JButton button=new JButton("您按下的是：");
	public static void main(String[] args) {
		KeyListenerDemo1 frame=new KeyListenerDemo1();
		frame.setFrame();
	}
	void setFrame(){
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 200);
		//添加按钮y
		this.add(button,BorderLayout.NORTH);
		//创建一个字体对象
		Font font=new Font("宋体",0,50);
		button.setFont(font);
		//注册监听器
		this.addKeyListener(this);
		this.setFocusable(true);
	}
	//以下是keylistener所有未实现的方法
	@Override
	public void keyPressed(KeyEvent e) {
		//button.setText("您按下的是："+e.getKeyChar());
		button.setText("您按下的是："+e.getKeyCode());
		
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






