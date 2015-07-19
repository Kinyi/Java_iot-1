package cn.usth.learn.ch6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Ball extends JPanel implements ActionListener{
	//定义属性
	int radius=15;//半径
	double x=50,y=50;//坐标
	double dx=10;//步长
	int delay=40;//速度
	double degree=3.14/3;//出发角度
	//添加定时器
	Timer timer=new Timer(delay,this);
	Ball(){
		timer.start();
	}
	@Override
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.RED);
		x=x+dx*Math.cos(degree);
		y=y+dx*Math.sin(degree);
		if (y>this.getHeight()-30)
		{
			degree=-degree;
		}
		if (x>this.getWidth()-30)
		{
			degree=3.14-degree;
		}
		if (y<10)
		{
			degree=-degree;
		}
		if (x<0)
		{
			degree=3.14-degree;
		}
		g.fillOval((int)x, (int)y, radius*2, radius*2);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
}
