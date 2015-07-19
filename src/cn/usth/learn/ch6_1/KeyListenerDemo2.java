package cn.usth.learn.ch6_1;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import cn.usth.learn.ch6_1.ActionListenerDemo1.ActionAdp;

public class KeyListenerDemo2 extends JFrame{
	JButton button;
	public static void main(String[] args) {
		KeyListenerDemo2 frame=new KeyListenerDemo2();
		Font font=new Font("宋体", 0, 30);
		frame.button=new JButton("您按下的是：");
		frame.button.setFont(font);
		frame.add(frame.button);
		frame.addKeyListener(frame.new keyLtn());
		frame.button.setEnabled(false);
		frame.setFocusable(true);
		
		frame.setSize(300, 300);
		frame.setLocation(200, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class keyLtn implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			button.setText("您按下的是： "+e.getKeyCode());
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
