package cn.usth.learn.ch5;
/**
	 * 微波炉示例
	 */
import javax.swing.*;

import java.awt.*;
public class OvenLayoutDemo {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		JPanel container=(JPanel) frame.getContentPane();
		//设置内容面板的布局
		container.setLayout(new GridLayout(1,2));
		container.add(new JButton("这里是左侧的按钮"));
		JPanel JP_Right=new JPanel(new BorderLayout());
		container.add(JP_Right);
		JP_Right.add(new JTextField("这里是文本框"),BorderLayout.NORTH);
		JPanel JP_Right_Down=new JPanel(new GridLayout(4,3));
		for(int i=1;i<10;i++){
			JP_Right_Down.add(new JButton(i+""));
		}
		JP_Right_Down.add(new JButton("0"));
		JP_Right_Down.add(new JButton("开始"));
		JP_Right_Down.add(new JButton("停止"));
		JP_Right.add(JP_Right_Down);
		//设置窗口外观属性
		frame.setTitle("微波炉子示例");
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
