package cn.usth.learn.ch4;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class ballDisplayInCenter extends JFrame {

	public static void main(String[] args) {
		ballDisplayInCenter ball = new ballDisplayInCenter();
		// ball.setFrame();
		ball.displayInCenter(ball);
	}

	ballDisplayInCenter() {
		setFrame();
	}

	void setFrame() {
		this.setTitle("子类继承父类的关系示例");
		this.setSize(600, 400);
		this.setVisible(true);
		//this.show();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void displayInCenter(JFrame frame) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = frame.getSize();
		frame.setLocation((screenSize.width - frameSize.width) / 2,
				(screenSize.height - frameSize.height) / 2);
	}

}
