package cn.usth.learn.ballgame1;
import java.awt.*;
import java.awt.event.*;
class BallGame extends Frame
{	
	//定义图片显示位置的坐标变量
	double x=50;//int x=50;
	double y=50;//int y=50;
	double degree=3.14/3;
	//加载图片
	Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.jpg");
	//定义主函数
	public static void main(String [] args) 
	{
//		BallGame ball;
//		ball=new BallGame();
//		ball.setFrame();
		new BallGame().setFrame();
	}
	//重载paint函数
	public void paint(Graphics g)//绘制屏幕
	{
		//x=x+5;
		//y=y+5;
		x=x+10*Math.cos(degree);
		y=y+10*Math.sin(degree);
		//在窗口坐标（x,y）的位置绘制图片ball.jpg
		g.drawImage(ball,(int)x,(int)y,null);//g.drawImage(ball,x,y,null);
		//对窗体的上下左右边界进行判断，实现反弹效果
		if (y>getHeight()-40)
		{
			degree=-degree;
		}
		if (x>getWidth()-30)
		{
			degree=3.14-degree;
		}
		if (y<40)
		{
			degree=-degree;
		}
		if (x<0)
		{
			degree=3.14-degree;
		}
	}
	//自定义成员函数setFrame
	void setFrame()
	{
		//设置窗体参数
		setSize(500,300);
		setBackground(Color.black);
		setTitle("我的弹球游戏");
		setLocation(50,50);
		setVisible(true);
		//为窗体添加事件侦听器
		addWindowListener(new WindowAdapter()
			{
				@Override
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			
		});
		new PaintThread().start();//创建并启动线程类对象
	}
	//定义内部类，实现多线程
	class PaintThread extends Thread
	{
		//重载run()方法
		@Override
		public void run()
		{
			while (true)
			{
				repaint();//调用paint()重新绘制窗口
				try
				{
					Thread.sleep(50);//休眠50毫秒
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();//打印出错信息
				}
				
			}
		}
	}
}
