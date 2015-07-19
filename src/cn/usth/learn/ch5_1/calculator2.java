package cn.usth.learn.ch5_1;

import java.awt.*;

import javax.swing.*;

public class calculator2 extends JFrame{
	JButton[] btnArray=new JButton[20];
	public static void main(String[] args) {
		calculator2 cal=new calculator2();
		cal.setFrame();
		cal.setComponent();
	}
	void setFrame(){
		setTitle("¼òµ¥¼ÆËãÆ÷");
		setSize(350, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	void setComponent(){
		Container container=getContentPane();
		container.setLayout(new BorderLayout());
		JPanel JP_North=new JPanel();
		JP_North.setLayout(new GridLayout(2, 1));
		JPanel JP_North_down =new JPanel();
		JP_North_down.setLayout(new GridLayout(1,3));
		JPanel JP_South=new JPanel();
		JP_South.setLayout(new GridLayout(4, 4));

		
		
	}
}
