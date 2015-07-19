package cn.usth.learn.ch6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ActionEventDemo extends JFrame 
								implements ActionListener{
	
	JButton button=new JButton("按钮一");
	public static void main(String[] args) {
		ActionEventDemo frame=new ActionEventDemo();
		frame.setFrame();
	}
	//定义设置窗口函数
	void setFrame(){
		//向窗口中添加一个按钮
		JPanel container=(JPanel) this.getContentPane();
		container.setLayout(new FlowLayout());
		//在窗口中添加按钮
		container.add(button);
		//为button按钮添加一个监听器
		button.addActionListener(this);
		this.setSize(300, 300);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.getContentPane().getBackground()==Color.blue){
			this.getContentPane().setBackground(Color.cyan);
		}else{
			this.getContentPane().setBackground(Color.blue);
		}
	}
}







