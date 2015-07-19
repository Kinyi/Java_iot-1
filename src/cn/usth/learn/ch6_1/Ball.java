package cn.usth.learn.ch6_1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Ball extends JPanel implements ActionListener{
	double x=50,y=50;//小球坐标
	int radius=15;//小球半径
	double degree=3.14/3;//出发角度
	double dx=10;//小球前进步长
	int delay=40;//画面重绘延时
	Timer timer=new Timer(delay,this);
	Ball(){
		timer.start();
		this.setBackground(Color.cyan);
	}
	@Override
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.red);
		g.fillOval((int)x, (int)y, radius*2, radius*2);
		x=x+dx*Math.cos(degree);
		y=y+dx*Math.sin(degree);
		if (y>this.getHeight()-30)
		{
			degree=-degree;
		}
		if (x>this.getWidth()-40)
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
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		this.repaint();
	}
	
}
