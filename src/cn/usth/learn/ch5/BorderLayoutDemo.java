package cn.usth.learn.ch5;

import java.awt.*;

import javax.swing.*;
/*
 * �߿򲼾���ʾ
 */
public class BorderLayoutDemo {

	public static void main(String[] args) {
		//����һ��JFrame���ڣ�����������
		JFrame frame=new JFrame();
		//1.��ȡframe���ڵ�Ĭ������
		Container container=frame.getContentPane();
		//2.����������Ĭ�ϲ���
		container.setLayout(new BorderLayout());//\\
		//3.��������������
		container.add(new JButton("����İ�ť"),BorderLayout.NORTH);//ctrl+alt+��
		container.add(new JButton("����İ�ť"),BorderLayout.SOUTH);//ctrl+alt+��
		container.add(new JButton("����İ�ť"),BorderLayout.WEST);//ctrl+alt+��
		container.add(new JButton("����İ�ť"),BorderLayout.EAST);//ctrl+alt+��
		container.add(new JButton("�м�İ�ť"),BorderLayout.CENTER);//ctrl+alt+��
		//�������ô����������
		frame.setTitle("�߿򲼾���ʾ");
		frame.setSize(600, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
