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
					"请输入年份",
					"输入对话框示例",
					JOptionPane.QUESTION_MESSAGE
				);
				year=Integer.parseInt(yearString);
			}
			catch (NumberFormatException e)
			{
				JOptionPane.showMessageDialog(
					null,
					"年份格式错误,请重新输入",
					"提示",
					JOptionPane.INFORMATION_MESSAGE
					);
				continue;
			}

			break;
		}
		boolean isLeapYear=((year%4==0)&&(year%100!=0))||(year%400==0);
		JOptionPane.showMessageDialog(
			null,
			year+"年是闰年吗？"+isLeapYear,
			"消息框示例",
			JOptionPane.INFORMATION_MESSAGE
			);
	}
}
