package cn.usth.learn.ch5_1;

import java.awt.*;

import javax.swing.*;

public class calculator3 extends JFrame{
	JButton[] btnArray=new JButton[20];
	public static void main(String[] args) {
		calculator3 cal=new calculator3();
		cal.setFrame();
		cal.setComponent();
	}
	void setFrame(){
		setTitle("�򵥼�����");
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
		JTextField JT_diplay=new JTextField();
		for(int i=0;i<=9;i++){
			btnArray[i]=new JButton(i+"");
		}
		btnArray[10]=new JButton("+/-");
		btnArray[11]=new JButton(".");
		btnArray[12]=new JButton("+");
		btnArray[13]=new JButton("-");
		btnArray[14]=new JButton("*");
		btnArray[15]=new JButton("/");
		btnArray[16]=new JButton("�˸�");
		btnArray[17]=new JButton("���");
		btnArray[18]=new JButton("=");
	}
}
