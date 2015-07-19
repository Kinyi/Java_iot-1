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
		//定义一个JButton（按钮）
		JButton button=new JButton("我是JButton按钮",icon);
		container.add(button);
		//定义一个JLabel（标签）
		JLabel label=new JLabel("我是JLabel标签",icon,SwingConstants.CENTER);
		container.add(label);
		//定义一个单行文本框
		JTextField txt_name=new JTextField("在这里输入学生姓名---在这里输入学生姓名---在这里输入学生姓名---");
		container.add(txt_name);
		//定义一个多行文本框
		JTextArea txt_about=new JTextArea(5,10);
		txt_about.setBorder(BorderFactory.createEtchedBorder());
		txt_about.setLineWrap(true);
		container.add(txt_about);
		
		//设置窗口显示属性
		frame.setSize(600,600);
		frame.setTitle("swing组件示例");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameUtil.DisplayInCenter(frame);
		frame.setVisible(true);
	}

}
