package cn.usth.learn.ch5;

import java.awt.*;

import javax.swing.*;
/*
 * 边框布局演示
 */
public class BorderLayoutDemo {

	public static void main(String[] args) {
		//创建一个JFrame窗口（顶级容器）
		JFrame frame=new JFrame();
		//1.获取frame窗口的默认容器
		Container container=frame.getContentPane();
		//2.设置容器的默认布局
		container.setLayout(new BorderLayout());//\\
		//3.向容器内添加组件
		container.add(new JButton("北面的按钮"),BorderLayout.NORTH);//ctrl+alt+下
		container.add(new JButton("南面的按钮"),BorderLayout.SOUTH);//ctrl+alt+下
		container.add(new JButton("西面的按钮"),BorderLayout.WEST);//ctrl+alt+下
		container.add(new JButton("东面的按钮"),BorderLayout.EAST);//ctrl+alt+下
		container.add(new JButton("中间的按钮"),BorderLayout.CENTER);//ctrl+alt+下
		//以下设置窗口外观属性
		frame.setTitle("边框布局演示");
		frame.setSize(600, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
