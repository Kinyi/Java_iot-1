package cn.usth.learn.ch6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ActionEventDemo2 extends JFrame {

	JButton button = new JButton("��ťһ");
	JButton button1 = new JButton("��ťһ");

	public static void main(String[] args) {
		ActionEventDemo2 frame = new ActionEventDemo2();
		frame.setFrame();
	}

	// �������ô��ں���
	void setFrame() {
		// �򴰿������һ����ť
		JPanel container = (JPanel) this.getContentPane();
		container.setLayout(new FlowLayout());
		// �ڴ�������Ӱ�ť
		container.add(button);
		container.add(button1);
		// Ϊbutton��ť���һ��������
		button.addActionListener(new AcitonAdp());
		button1.addActionListener(new AcitonAdp());
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	class AcitonAdp implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Container container = getContentPane();
			// if (e.getActionCommand() == "��ťһ") {
			if (e.getSource() == button) {
				if (container.getBackground() == Color.blue) {
					container.setBackground(Color.cyan);
				} else {
					container.setBackground(Color.blue);
				}
			} else {
				if (container.getBackground() == Color.red) {
					container.setBackground(Color.green);
				} else {
					container.setBackground(Color.red);
				}

			}
		}

	}
}
