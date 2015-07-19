package cn.usth.learn.ch6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ActionEventDemo2 extends JFrame {

	JButton button = new JButton("按钮一");
	JButton button1 = new JButton("按钮一");

	public static void main(String[] args) {
		ActionEventDemo2 frame = new ActionEventDemo2();
		frame.setFrame();
	}

	// 定义设置窗口函数
	void setFrame() {
		// 向窗口中添加一个按钮
		JPanel container = (JPanel) this.getContentPane();
		container.setLayout(new FlowLayout());
		// 在窗口中添加按钮
		container.add(button);
		container.add(button1);
		// 为button按钮添加一个监听器
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
			// if (e.getActionCommand() == "按钮一") {
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
