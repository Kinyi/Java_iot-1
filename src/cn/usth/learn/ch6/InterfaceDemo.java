package cn.usth.learn.ch6;
/*
 * �ӿڵ��ص㣺
 * ��1�������ǳ���
 * ��2��ֻ�г��󷽷���������û��ʵ�֣��ĸ���ʵ������ӿڣ��ĸ������ʵ�����г��󷽷�
 * ��3���ӿ����з������ǹ��е�
 * 
 */
public class InterfaceDemo {
	public static void main(String[] args) {
		Point point=new Point();
		point.area();
		System.out.println(point.getName());
	}
}
//����һ���ӿڣ�����ͼ�ε�������������ȡ���������
interface Shape{
	public final double PI=3.14;
	public double area();
	public double volume();
	public String getName();
}
interface aaa extends Shape{
	
}
class ShapeAdapter implements Shape,aaa{

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
//����һ������
class Point extends ShapeAdapter{
	int x,y;
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
//����һ��Բ��
class Circle implements Shape{
	Point point=new Point();
	int radius=5;
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Shape.PI*radius*radius;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Circle";
	}
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}


