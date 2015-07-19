package cn.usth.learn.ch5_1;
import java.awt.*;

import javax.swing.*;

import cn.usth.learn.util.FrameUtil;
public class nullLayoutdemo{
	
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		Container container=frame.getContentPane();
		container.setLayout(null);
		JPanel panel=new JPanel();
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createEtchedBorder());
		panel.setSize(560, 330);
		panel.setLocation(20, 20);
		container.add(panel);
		for(int i=0;i<5;i++){
			JButton button=new JButton(i+"");
			button.setSize(100,30);
			button.setLocation(20, (i+1)*40+i);
			panel.add(button);
		}
		
		//设置窗口
		frame.setSize(600,400);
		FrameUtil.DisplayInCenter(frame);
		frame.setTitle("空布局示例");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
