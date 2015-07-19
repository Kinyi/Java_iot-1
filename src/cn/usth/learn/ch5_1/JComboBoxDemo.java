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
		container.add(new JLabel("您喜欢哪个城市:"));
		String[] city={"北京","上海","哈尔滨"};
		JComboBox combo=new JComboBox(city);
		container.add(combo);
		
		frame.setSize(400, 600);
		frame.setTitle("复选框和单选框示例：");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
