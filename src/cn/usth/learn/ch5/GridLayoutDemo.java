package cn.usth.learn.ch5;

import javax.swing.*;
import java.awt.*;
/*
 * ��񲼾���ʾ
 */
public class GridLayoutDemo {
	public static void main(String[] args){
		//����һ�����ڣ�����������
		JFrame frame=new JFrame();
		//1.��ȡframe���ڵ�Ĭ������
		Container container=frame.getContentPane();
		//2.����������Ĭ�ϲ���
		container.setLayout(new GridLayout(20,10));
		//3.��������������
		for(int i=0;i<200;i++){
			container.add(new JButton());
		}
		frame.setTitle("��񲼾�ʾ����");
		frame.setSize(200, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
