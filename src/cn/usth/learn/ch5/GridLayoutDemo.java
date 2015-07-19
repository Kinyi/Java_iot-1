package cn.usth.learn.ch5;

import javax.swing.*;
import java.awt.*;
/*
 * 表格布局演示
 */
public class GridLayoutDemo {
	public static void main(String[] args){
		//创建一个窗口（顶级容器）
		JFrame frame=new JFrame();
		//1.获取frame窗口的默认容器
		Container container=frame.getContentPane();
		//2.设置容器的默认布局
		container.setLayout(new GridLayout(20,10));
		//3.向容器内添加组件
		for(int i=0;i<200;i++){
			container.add(new JButton());
		}
		frame.setTitle("表格布局示例子");
		frame.setSize(200, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
