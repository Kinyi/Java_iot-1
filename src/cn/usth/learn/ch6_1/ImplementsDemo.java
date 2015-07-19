package cn.usth.learn.ch6_1;

/*
 * �ӿڵ��ص㣺
 * ��1���ӿ���һ����ȫ����ġ��������
 * ��2���ӿ��ж������û��ʵ�ֵķ���
 * ��3��һ����ʵ����ĳ���ӿڣ���Ҫʵ���������з���
 * ��4��һ�������ʵ�ֶ���ӿ�
 * ��5���ӿڿ��Լ̳������ӿ�
 */

interface Shape{
	public double area();;
	public double volume();
	public String getName();
	
}
//����һ�������࣬���ڼ򻯽ӿڵ�ʹ��
class ShapeAdapter implements Shape{
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
//����һ�����࣬�̳�ShapeAdapter(������)
class Point extends ShapeAdapter{
	@Override
	public String getName() {
		return "Point";
	}
}
//����һ��Բ�࣬ʵ��Shape�ӿ�
class Circle implements Shape{
	int x,y;
	int radius=0;
	Circle(int radius){
		this.radius=radius;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
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
public class ImplementsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circle circle=new Circle(5);
		System.out.println("circle������ǣ�"+circle.area());
		Point point=new Point();
		System.out.println("point������ǣ�"+point.area());
		
	}

}
