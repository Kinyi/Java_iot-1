package cn.usth.learn.ch6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class ballGUIDemo extends JFrame{
	//��������
	JScrollBar scroll=new JScrollBar();
	JButton btn_suspend=new JButton("��ͣ");
	JButton btn_continue=new JButton("����");
	Ball ball=new Ball();
	public static void main(String[] args){
		//���������ڶ���
		ballGUIDemo frame=new ballGUIDemo();
		frame.setFrame();
		//Container container=frame.getContentPane();
		JPanel container=(JPanel) frame.getContentPane();
		//���ò���
		container.setLayout(new BorderLayout());
		frame.scroll.setOrientation(JScrollBar.HORIZONTAL);
		container.add(frame.scroll,BorderLayout.NORTH);
		JPanel JP_South=new JPanel();
		JP_South.add(frame.btn_suspend);
		JP_South.add(frame.btn_continue);
		container.add(JP_South,BorderLayout.SOUTH);
		//JPanel JP_Center=new JPanel();
		frame.ball.setBackground(Color.cyan);
		container.add(frame.ball,BorderLayout.CENTER);
		
	}
	void setFrame() {
		setTitle("С�����");
		setSize(600, 400);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setListener();
	}
	void setListener(){
		scroll.addAdjustmentListener(new AdjustAdp());
		btn_suspend.addActionListener(new ActionAdp());
		btn_continue.addActionListener(new ActionAdp());
	}
	//����ActionListener������
	class ActionAdp implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand()=="��ͣ"){
				ball.timer.stop();
			}else{
				ball.timer.start();
			}
		}
	}
	//����AdjustmentListener������
	class AdjustAdp implements AdjustmentListener{
		@Override
		public void adjustmentValueChanged(AdjustmentEvent e) {
			ball.timer.setDelay(e.getValue());
		}
	}
}












