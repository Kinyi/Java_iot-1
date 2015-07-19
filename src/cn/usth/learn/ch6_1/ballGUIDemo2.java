package cn.usth.learn.ch6_1;

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
import javax.swing.Timer;

public class ballGUIDemo2 extends JFrame implements ActionListener,
		AdjustmentListener {
	// ��������
	JScrollBar scroll = new JScrollBar();
	JButton btn_suspend = new JButton("��ͣ");
	JButton btn_continue = new JButton("����");
	Ball JP_Ball = new Ball();

	public static void main(String[] args) {
		// ���������ڶ���
		ballGUIDemo2 frame = new ballGUIDemo2();
		frame.setFrame();
		frame.setListerner();
	}

	void setFrame() {
		JPanel container = (JPanel) getContentPane();
		// ���ò���
		container.setLayout(new BorderLayout());
		scroll.setOrientation(JScrollBar.HORIZONTAL);
		container.add(scroll, BorderLayout.NORTH);
		JPanel JP_South = new JPanel();
		JP_South.add(btn_suspend);
		JP_South.add(btn_continue);
		container.add(JP_South, BorderLayout.SOUTH);
		JP_Ball.setBackground(Color.cyan);
		container.add(JP_Ball, BorderLayout.CENTER);
		setTitle("С�����");
		setSize(600, 400);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	void setListerner() {
		scroll.addAdjustmentListener(this);
		btn_suspend.addActionListener(this);
		btn_continue.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "��ͣ") {
			JP_Ball.timer.stop();
		} else {
			JP_Ball.timer.start();
		}
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		JP_Ball.delay = e.getValue();
		JP_Ball.timer.setDelay(JP_Ball.delay);

	}

}
