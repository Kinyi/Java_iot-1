package cn.usth.learn.ch2;

import java.util.Scanner;
/**
 * ��ʾ������ν����û����������
*/
class InputDemo1
{
	public static void main(String[] args) 
	{
		//����Scanner����,���մӿ���̨���������
		Scanner input=new Scanner(System.in);
		System.out.println("������������֣�");
		//����String����
		String name=input.next();
		System.out.println("���������ѧ�ţ�");
		//����int����
		int stuNo=input.nextInt();
		//������
		System.out.println("��������Ϊ��"+name +",ѧ��Ϊ"+stuNo);
	}
}