package cn.usth.learn.ch2;

import javax.swing.JOptionPane;
/**
	判断某年是否是闰年
	一个年号如果能被4整除但不能被100整除，或能被400整除
	布尔表达式：((year%4==0)&&(year%100!=0))||(year%400==0)
*/
class InputDemo2 
{
	public static void main(String[] args) 
	{
		String yearString=JOptionPane.showInputDialog(//创建输入对话框
			null,//父窗口
			"请输入年份",//提示信息
			"输入框示例",//窗口标题
			JOptionPane.QUESTION_MESSAGE//显示的图标类型
			);
			
		int year=Integer.parseInt(yearString);
		boolean isLeapYear=((year%4==0)&&(year%100!=0))||(year%400==0);
		JOptionPane.showMessageDialog(//创建消息对话框
			null,
			year+"是闰年吗？"+isLeapYear,
			"消息提示框",
			JOptionPane.INFORMATION_MESSAGE);
	}
}
