package cn.usth.learn.ch5_1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class JComboBoxDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel container=(JPanel)frame.getContentPane();
		container.setLayout(new GridLayout(20,1));
		container.add(new JLabel("��ϲ���ĸ�����:"));
		String[] city={"����","�Ϻ�","������"};
		JComboBox combo=new JComboBox(city);
		container.add(combo);
		
		frame.setSize(400, 600);
		frame.setTitle("��ѡ��͵�ѡ��ʾ����");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
