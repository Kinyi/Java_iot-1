package cn.usth.learn.ch6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ActionEventDemo extends JFrame 
								implements ActionListener{
	
	JButton button=new JButton("��ťһ");
	public static void main(String[] args) {
		ActionEventDemo frame=new ActionEventDemo();
		frame.setFrame();
	}
	//�������ô��ں���
	void setFrame(){
		//�򴰿������һ����ť
		JPanel container=(JPanel) this.getContentPane();
		container.setLayout(new FlowLayout());
		//�ڴ�������Ӱ�ť
		container.add(button);
		//Ϊbutton��ť���һ��������
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







