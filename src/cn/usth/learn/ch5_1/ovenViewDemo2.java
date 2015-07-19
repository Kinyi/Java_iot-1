package cn.usth.learn.ch5_1;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

public class ovenViewDemo2 extends JFrame{

	public static void main(String[] args) {
		ovenViewDemo2 oven=new ovenViewDemo2();
		oven.setTitle("微波炉图形界面示例");
		oven.setSize(400, 300);
		oven.setVisible(true);
		oven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		oven.setResizable(false);
		oven.setComponent();
	}
	void setComponent(){
		Container container=getContentPane();
		container.setLayout(new GridLayout(1, 2));
		container.add(new JButton("第一个按钮"));
		container.add(new JButton("第二个按钮"));
		
	}

}
