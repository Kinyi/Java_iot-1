package cn.usth.learn.ch5;
/**
	 * ΢��¯ʾ��
	 */
import javax.swing.*;

import java.awt.*;
public class OvenLayoutDemo {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		JPanel container=(JPanel) frame.getContentPane();
		//�����������Ĳ���
		container.setLayout(new GridLayout(1,2));
		container.add(new JButton("���������İ�ť"));
		JPanel JP_Right=new JPanel(new BorderLayout());
		container.add(JP_Right);
		JP_Right.add(new JTextField("�������ı���"),BorderLayout.NORTH);
		JPanel JP_Right_Down=new JPanel(new GridLayout(4,3));
		for(int i=1;i<10;i++){
			JP_Right_Down.add(new JButton(i+""));
		}
		JP_Right_Down.add(new JButton("0"));
		JP_Right_Down.add(new JButton("��ʼ"));
		JP_Right_Down.add(new JButton("ֹͣ"));
		JP_Right.add(JP_Right_Down);
		//���ô����������
		frame.setTitle("΢��¯��ʾ��");
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
