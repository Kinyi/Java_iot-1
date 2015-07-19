package cn.usth.learn.ch5_1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

public class ovenViewDemo3 extends JFrame{

	public static void main(String[] args) {
		ovenViewDemo3 oven=new ovenViewDemo3();
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
		container.add(new JButton("这里是第一列"));
		JPanel JP_Right=new JPanel(new BorderLayout());
		JP_Right.add(new JTextField(),BorderLayout.NORTH);
		container.add(JP_Right);
	}

}
