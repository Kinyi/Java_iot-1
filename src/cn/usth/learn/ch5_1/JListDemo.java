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
		container.add(new JLabel("您喜欢哪个城市:"),BorderLayout.NORTH);
		String[] city={"北京","上海","哈尔滨"};
		JList list=new JList(city);
		container.add(list);
		
		
		frame.setSize(400, 600);
		frame.setTitle("复选框和单选框示例：");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
