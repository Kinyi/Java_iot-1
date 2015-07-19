package cn.usth.learn.ballgame2;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Ball extends JPanel implements ActionListener{
	//定义属性
	Image image;
	int x,y;
	double degree;
	//添加一个定时器类的对象
	Timer timer=new Timer(40,this);
	//定义行为
	Ball(){
		x=50;y=50;
		degree=3.14/3;
		loadImage("images/ball.jpg");
		timer.start();
	}
	Ball(double degree){
		this();
		this.degree=degree;
	}
	
	public void loadImage(String FilePath){
		image=Toolkit.getDefaultToolkit().getImage(FilePath);
	}
	public void move(){
		x=(int) (x+10*Math.cos(degree));
		y=(int) (y+10*Math.sin(degree));
	}
	public void show(){
		System.out.println("坐标：("+x+","+y+")");
		System.out.println("出发角度："+degree);
	}
	//重载JPanel的paint方法
	public void paint(Graphics g){
		super.paint(g);
		g.drawImage(image,x,y,null);
	}
	//定时器每40毫秒调用执行actionPerformed方法一次
	@Override
	public void actionPerformed(ActionEvent e) {
		if (y>this.getHeight()-30)
		{
			degree=-degree;
		}
		if (x>getWidth()-30)
		{
			degree=3.14-degree;
		}
		if (y<0)
		{
			degree=-degree;
		}
		if (x<0)
		{
			degree=3.14-degree;
		}
		move();
		repaint();
	}
}
