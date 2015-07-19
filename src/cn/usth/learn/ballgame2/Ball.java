package cn.usth.learn.ballgame2;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Ball extends JPanel implements ActionListener{
	//��������
	Image image;
	int x,y;
	double degree;
	//���һ����ʱ����Ķ���
	Timer timer=new Timer(40,this);
	//������Ϊ
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
		System.out.println("���꣺("+x+","+y+")");
		System.out.println("�����Ƕȣ�"+degree);
	}
	//����JPanel��paint����
	public void paint(Graphics g){
		super.paint(g);
		g.drawImage(image,x,y,null);
	}
	//��ʱ��ÿ40�������ִ��actionPerformed����һ��
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
