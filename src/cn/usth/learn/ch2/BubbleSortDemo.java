package cn.usth.learn.ch2;

import java.util.Scanner;

public class BubbleSortDemo {
/**
 * 冒泡排序
 */
	public static void main(String[] args){
		//从键盘输入10个数字并存入数组
		Scanner scanner=new Scanner(System.in);
		int num[]=new int[10];
		String PreSorted="";
		//从键盘循环读入10个整数，将它们依次存放到num[0]到num[9]
		for(int i=0;i<num.length;i++){
			System.out.print("请输入第"+(i+1)+"个数:");
			num[i]=scanner.nextInt();
		}
		//将数组中的10个数字连接成字符串，数字之间用空格分隔
		for(int number:num){//增强型for循环,是传统for循环的简写
			PreSorted=PreSorted+number+" ";
		}
		//输出字符串
		System.out.println("您输入的顺序为："+PreSorted);
		int temp=0;
		//每次循环过程中，第i个元素依次与第i+1,i+1,...,num.lenth-1个元素比较
		//如果第i个元素大于与其比较的元素，则二者交换位置。
		for(int i=0;i<num.length-1;i++){
			for(int j=i+1;j<num.length;j++){
				swap(num,i,j);
			}
			String s1="";
			for(int number:num){
				s1=s1+number+" ";
			}
			System.out.println("第"+i+"次排序后:"+s1);
		}
	}
	static void swap(int num[],int a,int b){//给方法传递数组参数
		int temp=0;
		if(num[a]>num[b]){
			temp=num[a];
			num[a]=num[b];
			num[b]=temp;
		}
	}
}