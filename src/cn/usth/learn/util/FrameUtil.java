package cn.usth.learn.util;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class FrameUtil {
	// ���崰����Ļ������ʾ����
	public static void DisplayInCenter(JFrame frame) {
		// ��ȡ��Ļ���
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		// ��ȡ��ǰ������
		Dimension frameSize = frame.getSize();
		// ���㲢���ô��ڵ���ʾ����
		frame.setLocation((screenSize.width - frameSize.width) / 2,
				(screenSize.height - frameSize.height) / 2);

	}

}
