package cn.usth.learn.ch2;

import java.util.Scanner;

public class BubbleSortDemo {
/**
 * ð������
 */
	public static void main(String[] args){
		//�Ӽ�������10�����ֲ���������
		Scanner scanner=new Scanner(System.in);
		int num[]=new int[10];
		String PreSorted="";
		//�Ӽ���ѭ������10�����������������δ�ŵ�num[0]��num[9]
		for(int i=0;i<num.length;i++){
			System.out.print("�������"+(i+1)+"����:");
			num[i]=scanner.nextInt();
		}
		//�������е�10���������ӳ��ַ���������֮���ÿո�ָ�
		for(int number:num){//��ǿ��forѭ��,�Ǵ�ͳforѭ���ļ�д
			PreSorted=PreSorted+number+" ";
		}
		//����ַ���
		System.out.println("�������˳��Ϊ��"+PreSorted);
		int temp=0;
		//ÿ��ѭ�������У���i��Ԫ���������i+1,i+1,...,num.lenth-1��Ԫ�رȽ�
		//�����i��Ԫ�ش�������Ƚϵ�Ԫ�أ�����߽���λ�á�
		for(int i=0;i<num.length-1;i++){
			for(int j=i+1;j<num.length;j++){
				swap(num,i,j);
			}
			String s1="";
			for(int number:num){
				s1=s1+number+" ";
			}
			System.out.println("��"+i+"�������:"+s1);
		}
	}
	static void swap(int num[],int a,int b){//�����������������
		int temp=0;
		if(num[a]>num[b]){
			temp=num[a];
			num[a]=num[b];
			num[b]=temp;
		}
	}
}