package cn.usth.learn.ch2;

public class MethodDemo1 {

	/**
	 * 局部变量的生命期:从定义开始到它所在的}结束
	 * 
	 */
	public static void main(String[] args) {
		int a1=10,b1=20,temp;
		System.out.println("a1="+a1+",b1="+b1);
/*		result=add(a1,b1);
		System.out.println(result);
		System.out.println("a1="+a1+",b1="+b1);*/
		//temp=a1;a1=b1;b1=temp;
		swap(a1,b1);//交换能成功吗？为什么？
		System.out.println("a1="+a1+",b1="+b1);
	}
	
	static int add(int a,int b){
		return a+b;
	}
	//交换a1和b1的值
	static void swap(int a,int b){
		int temp;
		temp=a;a=b;b=temp;
	}
	

}
