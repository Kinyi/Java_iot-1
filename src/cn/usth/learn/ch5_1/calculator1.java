package cn.usth.learn.ch5_1;

import javax.swing.*;

public class calculator1 extends JFrame{

	public static void main(String[] args) {
		calculator1 cal=new calculator1();
		cal.setFrame();
	}
	void setFrame(){
		setTitle("¼òµ¥¼ÆËãÆ÷");
		setSize(350, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
