package cn.usth.learn.ch5_1;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

public class ovenViewDemo1 extends JFrame{

	public static void main(String[] args) {
		ovenViewDemo1 oven=new ovenViewDemo1();
		oven.setTitle("微波炉图形界面示例");
		oven.setSize(400, 300);
		oven.setVisible(true);
		oven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		oven.setResizable(false);
	}


}
