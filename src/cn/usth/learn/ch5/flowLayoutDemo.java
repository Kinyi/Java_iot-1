package cn.usth.learn.ch5;

import java.awt.*;

import javax.swing.*;
/*
 * 流式布局演示
 * 
 */
public class flowLayoutDemo {

	public static void main(String[] args) {
		//创建一个JFrame窗口（顶级容器）
		JFrame frame=new JFrame();
		//1.获取frame窗口的默认容器
		Container container=frame.getContentPane();
		//2.设置容器的默认布局
		container.setLayout(new FlowLayout(FlowLayout.LEFT));
		//3.循环添加20个JButton按钮
		for(int i=0;i<20;i++){
			container.add(new JButton("第"+i+"个按钮"));
		}
		//以下设置窗口外观属性
		frame.setTitle("流式布局演示");
		frame.setSize(600, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
