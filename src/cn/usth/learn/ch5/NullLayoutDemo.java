package cn.usth.learn.ch5;

import javax.swing.*;

import java.awt.*;
public class NullLayoutDemo {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		JPanel container=(JPanel) frame.getContentPane();
		container.setLayout(null);
		JButton btn1=new JButton("°´Å¥1");
		btn1.setSize(100,30);
		btn1.setLocation(20, 20);
		container.add(btn1);
		JButton btn2=new JButton("°´Å¥2");
		btn2.setSize(100,30);
		btn2.setLocation(20, 80);
		container.add(btn2);
		
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
