package cn.usth.learn.util;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class FrameUtil {
	// 定义窗口屏幕居中显示函数
	public static void DisplayInCenter(JFrame frame) {
		// 获取屏幕宽高
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		// 获取当前窗体宽高
		Dimension frameSize = frame.getSize();
		// 计算并设置窗口的显示坐标
		frame.setLocation((screenSize.width - frameSize.width) / 2,
				(screenSize.height - frameSize.height) / 2);

	}

}
