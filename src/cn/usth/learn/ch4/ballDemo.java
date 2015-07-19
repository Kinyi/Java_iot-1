package cn.usth.learn.ch4;

import javax.swing.JFrame;

public class ballDemo extends JFrame{
	
	public static void main(String[] args) {
		ballDemo ball=new ballDemo();
		//ball.setFrame();
	}
	ballDemo(){
		setFrame();
	}
	void setFrame(){
		this.setTitle("子类继承父类的关系示例");
		this.setSize(600, 400);
		//this.setVisible(true);
		this.show();
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
