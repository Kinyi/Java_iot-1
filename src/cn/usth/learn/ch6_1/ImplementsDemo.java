package cn.usth.learn.ch6_1;

/*
 * 接口的特点：
 * （1）接口是一个完全抽象的、特殊的类
 * （2）接口中定义的是没有实现的方法
 * （3）一个类实现了某个接口，就要实现它的所有方法
 * （4）一个类可以实现多个接口
 * （5）接口可以继承其它接口
 */

interface Shape{
	public double area();;
	public double volume();
	public String getName();
	
}
//定义一个剪裁类，用于简化接口的使用
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
//定义一个点类，继承ShapeAdapter(剪裁类)
class Point extends ShapeAdapter{
	@Override
	public String getName() {
		return "Point";
	}
}
//定义一个圆类，实现Shape接口
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
		System.out.println("circle的面积是："+circle.area());
		Point point=new Point();
		System.out.println("point的面积是："+point.area());
		
	}

}
