package cn.usth.learn.ch2;

import javax.swing.JOptionPane;
class InputDemo3
{
	public static void main(String[] args) 
	{
		String yearString;	
		int year=0;
		while (true)
		{
			try
			{
				yearString=JOptionPane.showInputDialog(
					null,
					"���������",
					"����Ի���ʾ��",
					JOptionPane.QUESTION_MESSAGE
				);
				year=Integer.parseInt(yearString);
			}
			catch (NumberFormatException e)
			{
				JOptionPane.showMessageDialog(
					null,
					"��ݸ�ʽ����,����������",
					"��ʾ",
					JOptionPane.INFORMATION_MESSAGE
					);
				continue;
			}

			break;
		}
		boolean isLeapYear=((year%4==0)&&(year%100!=0))||(year%400==0);
		JOptionPane.showMessageDialog(
			null,
			year+"����������"+isLeapYear,
			"��Ϣ��ʾ��",
			JOptionPane.INFORMATION_MESSAGE
			);
	}
}
