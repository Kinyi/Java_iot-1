package cn.usth.learn.ballgame2;

import java.awt.Color;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
	Ball ball=new Ball();
	public static void main(String[] args){
		MainFrame frame=new MainFrame();
		frame.setFrame();
	}
	void setFrame(){
		this.setBackground(Color.BLACK);
		this.setSize(600,400);
		this.setLocation(50,50);
		this.setVisible(true);
		this.setTitle("–°«Ú”Œœ∑");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(ball);
		ball.setBackground(Color.black);
	}
}
