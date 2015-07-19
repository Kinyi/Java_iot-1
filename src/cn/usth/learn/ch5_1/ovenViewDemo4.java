package cn.usth.learn.ch5_1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

public class ovenViewDemo4 extends JFrame{

	public static void main(String[] args) {
		ovenViewDemo4 oven=new ovenViewDemo4();
		oven.setTitle("微波炉图形界面示例");
		oven.setSize(400, 300);
		oven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//oven.setResizable(false);
		oven.setComponent();
		oven.setVisible(true);
	}
	void setComponent(){
		Container container=getContentPane();
		container.setLayout(new GridLayout(1, 2));
		container.add(new JButton("这里是第一列"));
		JPanel JP_Right=new JPanel(new BorderLayout());
		JP_Right.setBorder(BorderFactory.createEtchedBorder());
		JPanel JP_Right_Down=new JPanel(new GridLayout(4,3));
		JP_Right_Down.setBorder(BorderFactory.createEtchedBorder());
		for(int i=1;i<=9;i++){
			JP_Right_Down.add(new JButton(i+""));
		}
		JP_Right_Down.add(new JButton("0"));
		JP_Right_Down.add(new JButton("开始"));
		JP_Right_Down.add(new JButton("暂停"));

		JP_Right.add(new JTextField(),BorderLayout.NORTH);
		JP_Right.add(JP_Right_Down,BorderLayout.CENTER);
		
		
		container.add(JP_Right);
	}

}
