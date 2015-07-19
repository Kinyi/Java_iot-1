package cn.usth.learn.ch6_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ActionListenerDemo1 extends JFrame{
	//ActionAdp acitonadp=new ActionAdp();
	public static void main(String[] args) {
		ActionListenerDemo1 frame=new ActionListenerDemo1();
		frame.setSize(300, 300);
		frame.setLocation(200, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button=new JButton("°´Å¥Ò»");
		button.addActionListener(frame.new ActionAdp());
		frame.setLayout(new FlowLayout());
		frame.add(button);
	}

	
	class ActionAdp implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JPanel panel=(JPanel) getContentPane();
			if(panel.getBackground()==Color.cyan){
				panel.setBackground(Color.blue);
			}else{
				panel.setBackground(Color.cyan);
			}
		}

		
	}

}