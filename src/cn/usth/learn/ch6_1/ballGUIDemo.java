package cn.usth.learn.ch6_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class ballGUIDemo extends JFrame {
	//定义属性
	JScrollBar scroll=new JScrollBar();
	JButton btn_suspend=new JButton("暂停");
	JButton btn_continue=new JButton("继续");
	public static void main(String[] args){
		//创建主窗口对象
		ballGUIDemo frame=new ballGUIDemo();
		frame.setFrame();
		//Container container=frame.getContentPane();
		JPanel container=(JPanel) frame.getContentPane();
		//设置布局
		container.setLayout(new BorderLayout());
		frame.scroll.setOrientation(JScrollBar.HORIZONTAL);
		container.add(frame.scroll,BorderLayout.NORTH);
		JPanel JP_South=new JPanel();
		JP_South.add(frame.btn_suspend);
		JP_South.add(frame.btn_continue);
		container.add(JP_South,BorderLayout.SOUTH);
		JPanel JP_Center=new JPanel();
		JP_Center.setBackground(Color.BLUE);
		container.add(JP_Center,BorderLayout.CENTER);
	}

	void setFrame() {
		setTitle("小球界面");
		setSize(600, 400);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
