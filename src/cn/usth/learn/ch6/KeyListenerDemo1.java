package cn.usth.learn.ch6;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class KeyListenerDemo1 extends JFrame 
	implements KeyListener
{
	JButton button=new JButton("�����µ��ǣ�");
	public static void main(String[] args) {
		KeyListenerDemo1 frame=new KeyListenerDemo1();
		frame.setFrame();
	}
	void setFrame(){
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 200);
		//��Ӱ�ťy
		this.add(button,BorderLayout.NORTH);
		//����һ���������
		Font font=new Font("����",0,50);
		button.setFont(font);
		//ע�������
		this.addKeyListener(this);
		this.setFocusable(true);
	}
	//������keylistener����δʵ�ֵķ���
	@Override
	public void keyPressed(KeyEvent e) {
		//button.setText("�����µ��ǣ�"+e.getKeyChar());
		button.setText("�����µ��ǣ�"+e.getKeyCode());
		
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






