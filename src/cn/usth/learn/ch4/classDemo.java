package cn.usth.learn.ch4;
/**
 * ��ʾ�������Ĺ�ϵ����ռ�Ͷ���ռ�
 */
public class classDemo {
	static String x;
	String y;
	static void setX(String x){
		classDemo.x+=x;//��̬����ʹ�á�����.�����������е���
	}
	void setY(String y){
		this.y+=y;//�Ǿ�̬����ʹ��"this.������"���е���
	}
	public static void main(String[] args) {
		classDemo c1=new classDemo();
		classDemo c2=new classDemo();
		classDemo c3=new classDemo();
		classDemo.x="����classDemo��ľ�̬����x";
		//classDemo.setX(",��ʹ�á�����.�����������е���");
		c1.y="���Ƕ���c1�ķǾ�̬����";
		//c1.setY(",��ʹ�á�this.�����������е���");
		System.out.println(classDemo.x);
		System.out.println(c1.x);
		System.out.println(c1.y);
	}
}
