package cn.usth.learn.ch5;
/*
 * �������Ĺ�ϵ��
 * 1�����ж���ľ�̬���Ժͷ����������ռ�
 * 2�����ж���ķǾ�̬���Ժͷ�������ڶ���ռ�
 * 3����ռ�ֻ��һ�ݣ����ж�����һ����ռ�
 * 4������ռ�����ж�ݣ�ÿ��new���㴴��һ������ռ�
 * 5��������main�Ǿ�̬��
 * 6����̬���Ժͷ���ʹ��"����.������",��"����.������"�ķ�ʽ����
 * 7���Ǿ�̬���Ժͷ���ʹ��"������.������",��"������.������"�ķ�ʽ����
 * 
 */
public class staticDemo {
	static String x;
	static int num;
	String y;
	
	static void setX(String x){
		staticDemo.x=x;
	}
	void setY(String y){
		this.y=y;
	}
	void show(){
		staticDemo.num++;
	}
	
	public static void main(String[] args) {
		staticDemo.x="���Ǿ�̬������������ռ�";
		System.out.println("x="+x);
		staticDemo demo=new staticDemo();
		demo.y="���ǷǾ�̬����������demo����ռ�";
		demo.show();
		demo.show();
		demo.show();
		System.out.println("num="+staticDemo.num);
	}

}
