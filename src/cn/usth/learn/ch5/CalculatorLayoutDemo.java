package cn.usth.learn.ch5;
/**
	 * ΢��¯ʾ��
	 */
import javax.swing.*;

import java.awt.*;
public class CalculatorLayoutDemo {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		JPanel container=(JPanel) frame.getContentPane();
		//�����������Ĳ���
		container.setLayout(new BorderLayout());
		JPanel JP_Down=new JPanel(new GridLayout(4,4));
		for(int i=1;i<10;i++){
			JP_Down.add(new JButton(i+""));
		}
		JP_Down.add(new JButton("0"));
		JP_Down.add(new JButton("+/-"));
		JP_Down.add(new JButton("."));
		JP_Down.add(new JButton("+"));
		JP_Down.add(new JButton("-"));
		JP_Down.add(new JButton("*"));
		JP_Down.add(new JButton("/"));
		container.add(JP_Down);
		JPanel JP_Up=new JPanel(new GridLayout(2,1));
		JP_Up.add(new JTextField("����һ���ı���"));
		container.add(JP_Up,BorderLayout.NORTH);
		JPanel JP_Up_Down=new JPanel(new GridLayout(1,3));
		JP_Up_Down.add(new JButton("�˸�"));
		JP_Up_Down.add(new JButton("���"));
		JP_Up_Down.add(new JButton("="));
		JP_Up.add(JP_Up_Down);
		
		//���ô����������
		frame.setTitle("΢��¯��ʾ��");
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
