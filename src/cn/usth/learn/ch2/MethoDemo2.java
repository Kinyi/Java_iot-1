package cn.usth.learn.ch2;

public class MethoDemo2 {

	/**
	 *����������:������������ͬ������������ͬ��������Ͳ�ͬ.(�뷵��ֵ�����޹�).
	 *
	 */
	public static void main(String[] args) {
		System.out.println(add(5.5,6.8));
		System.out.println(add(5,6));
		System.out.println(add(5.6,6.8,6.7));
	}
	static int add(int a,int b){
		return a+b;
	}
	static double add(double a,double b){
		return a+b;
	}
	static double add(double a,double b,double c){
		return a+b+c;
	}
	

}
