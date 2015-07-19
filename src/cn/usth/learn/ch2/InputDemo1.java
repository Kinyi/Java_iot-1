package cn.usth.learn.ch2;

import java.util.Scanner;
/**
 * 演示程序如何接受用户输入的数据
*/
class InputDemo1
{
	public static void main(String[] args) 
	{
		//创建Scanner对象,接收从控制台输入的数据
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你的名字：");
		//接收String类型
		String name=input.next();
		System.out.println("请输入你的学号：");
		//接收int类型
		int stuNo=input.nextInt();
		//输出结果
		System.out.println("您的名字为："+name +",学号为"+stuNo);
	}
}