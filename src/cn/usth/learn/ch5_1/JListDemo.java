package cn.usth.learn.ch5_1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class JListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel container=(JPanel)frame.getContentPane();
		container.add(new JLabel("��ϲ���ĸ�����:"),BorderLayout.NORTH);
		String[] city={"����","�Ϻ�","������"};
		JList list=new JList(city);
		container.add(list);
		
		
		frame.setSize(400, 600);
		frame.setTitle("��ѡ��͵�ѡ��ʾ����");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
