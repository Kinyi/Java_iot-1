package cn.usth.learn.ballgame1;
import java.awt.*;
import java.awt.event.*;
class BallGame extends Frame
{	
	//����ͼƬ��ʾλ�õ��������
	double x=50;//int x=50;
	double y=50;//int y=50;
	double degree=3.14/3;
	//����ͼƬ
	Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.jpg");
	//����������
	public static void main(String [] args) 
	{
//		BallGame ball;
//		ball=new BallGame();
//		ball.setFrame();
		new BallGame().setFrame();
	}
	//����paint����
	public void paint(Graphics g)//������Ļ
	{
		//x=x+5;
		//y=y+5;
		x=x+10*Math.cos(degree);
		y=y+10*Math.sin(degree);
		//�ڴ������꣨x,y����λ�û���ͼƬball.jpg
		g.drawImage(ball,(int)x,(int)y,null);//g.drawImage(ball,x,y,null);
		//�Դ�����������ұ߽�����жϣ�ʵ�ַ���Ч��
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
	//�Զ����Ա����setFrame
	void setFrame()
	{
		//���ô������
		setSize(500,300);
		setBackground(Color.black);
		setTitle("�ҵĵ�����Ϸ");
		setLocation(50,50);
		setVisible(true);
		//Ϊ��������¼�������
		addWindowListener(new WindowAdapter()
			{
				@Override
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			
		});
		new PaintThread().start();//�����������߳������
	}
	//�����ڲ��࣬ʵ�ֶ��߳�
	class PaintThread extends Thread
	{
		//����run()����
		@Override
		public void run()
		{
			while (true)
			{
				repaint();//����paint()���»��ƴ���
				try
				{
					Thread.sleep(50);//����50����
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();//��ӡ������Ϣ
				}
				
			}
		}
	}
}
