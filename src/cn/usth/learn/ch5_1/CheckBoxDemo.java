package cn.usth.learn.ch5_1;

import java.awt.GridLayout;

import javax.swing.*;

public class CheckBoxDemo {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setLayout(new GridLayout(10,1));
		frame.add(new JLabel("您的爱好："));
		JCheckBox chk1=new JCheckBox("体育");
		JCheckBox chk2=new JCheckBox("美术");
		JCheckBox chk3=new JCheckBox("音乐");
		frame.add(chk1);
		frame.add(chk2);
		frame.add(chk3);
		frame.add(new JLabel("您的最高学历："));
		ButtonGroup group=new ButtonGroup();
		JRadioButton btn1=new JRadioButton("专科");
		group.add(btn1);
		JRadioButton btn2=new JRadioButton("本科");
		group.add(btn2);
		JRadioButton btn3=new JRadioButton("研究生");
		group.add(btn3);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		
		
		frame.setSize(400,600);
		frame.setTitle("复选框和单选框示例：");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
