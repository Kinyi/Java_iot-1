package cn.usth.learn.ch5_1;
import java.awt.*;

import javax.swing.*;

import cn.usth.learn.util.FrameUtil;
public class JComponentDemo {
	public static void main(String[] args) {
		ImageIcon icon=new ImageIcon("images/Apple1.jpg");
		System.out.println(icon.toString());
		//ImageIcon icon=new ImageIcon("images/Apple.gif");
		JFrame frame=new JFrame();
		JPanel container=(JPanel)frame.getContentPane();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		//����һ��JButton����ť��
		JButton button=new JButton("����JButton��ť",icon);
		container.add(button);
		//����һ��JLabel����ǩ��
		JLabel label=new JLabel("����JLabel��ǩ",icon,SwingConstants.CENTER);
		container.add(label);
		//����һ�������ı���
		JTextField txt_name=new JTextField("����������ѧ������---����������ѧ������---����������ѧ������---");
		container.add(txt_name);
		//����һ�������ı���
		JTextArea txt_about=new JTextArea(5,10);
		txt_about.setBorder(BorderFactory.createEtchedBorder());
		txt_about.setLineWrap(true);
		container.add(txt_about);
		
		//���ô�����ʾ����
		frame.setSize(600,600);
		frame.setTitle("swing���ʾ��");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameUtil.DisplayInCenter(frame);
		frame.setVisible(true);
	}

}
