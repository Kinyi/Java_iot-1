package cn.usth.learn.ch5;

import java.awt.*;

import javax.swing.*;
/*
 * ��ʽ������ʾ
 * 
 */
public class flowLayoutDemo {

	public static void main(String[] args) {
		//����һ��JFrame���ڣ�����������
		JFrame frame=new JFrame();
		//1.��ȡframe���ڵ�Ĭ������
		Container container=frame.getContentPane();
		//2.����������Ĭ�ϲ���
		container.setLayout(new FlowLayout(FlowLayout.LEFT));
		//3.ѭ�����20��JButton��ť
		for(int i=0;i<20;i++){
			container.add(new JButton("��"+i+"����ť"));
		}
		//�������ô����������
		frame.setTitle("��ʽ������ʾ");
		frame.setSize(600, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
