package cn.usth.learn.ch2;

import javax.swing.JOptionPane;
/**
	�ж�ĳ���Ƿ�������
	һ���������ܱ�4���������ܱ�100���������ܱ�400����
	�������ʽ��((year%4==0)&&(year%100!=0))||(year%400==0)
*/
class InputDemo2 
{
	public static void main(String[] args) 
	{
		String yearString=JOptionPane.showInputDialog(//��������Ի���
			null,//������
			"���������",//��ʾ��Ϣ
			"�����ʾ��",//���ڱ���
			JOptionPane.QUESTION_MESSAGE//��ʾ��ͼ������
			);
			
		int year=Integer.parseInt(yearString);
		boolean isLeapYear=((year%4==0)&&(year%100!=0))||(year%400==0);
		JOptionPane.showMessageDialog(//������Ϣ�Ի���
			null,
			year+"��������"+isLeapYear,
			"��Ϣ��ʾ��",
			JOptionPane.INFORMATION_MESSAGE);
	}
}
