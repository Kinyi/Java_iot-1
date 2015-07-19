package cn.usth.learn.ch6_1;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import cn.usth.learn.ch6_1.ActionListenerDemo1.ActionAdp;

public class KeyListenerDemo4 extends JFrame {
	JButton button;
	KeyListenerDemo4(){
		addKeyListener(
			new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					button.setText("您按下的是："+e.getKeyCode());
				}
			}
		);
	}
	public static void main(String[] args) {
		KeyListenerDemo4 frame = new KeyListenerDemo4();
		Font font = new Font("宋体", 0, 30);
		frame.button = new JButton("您按下的是：");
		frame.button.setFont(font);
		frame.add(frame.button);
		
		frame.button.setEnabled(false);
		frame.setFocusable(true);

		frame.setSize(300, 300);
		frame.setLocation(200, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
