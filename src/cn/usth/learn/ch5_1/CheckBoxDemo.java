package cn.usth.learn.ch5_1;

import java.awt.GridLayout;

import javax.swing.*;

public class CheckBoxDemo {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setLayout(new GridLayout(10,1));
		frame.add(new JLabel("���İ��ã�"));
		JCheckBox chk1=new JCheckBox("����");
		JCheckBox chk2=new JCheckBox("����");
		JCheckBox chk3=new JCheckBox("����");
		frame.add(chk1);
		frame.add(chk2);
		frame.add(chk3);
		frame.add(new JLabel("�������ѧ����"));
		ButtonGroup group=new ButtonGroup();
		JRadioButton btn1=new JRadioButton("ר��");
		group.add(btn1);
		JRadioButton btn2=new JRadioButton("����");
		group.add(btn2);
		JRadioButton btn3=new JRadioButton("�о���");
		group.add(btn3);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		
		
		frame.setSize(400,600);
		frame.setTitle("��ѡ��͵�ѡ��ʾ����");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
