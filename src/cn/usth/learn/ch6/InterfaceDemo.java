package cn.usth.learn.ch6;
/*
 * 接口的特点：
 * （1）属性是常量
 * （2）只有抽象方法的声明，没有实现，哪个类实现这个接口，哪个类必须实现所有抽象方法
 * （3）接口所有方法都是公有的
 * 
 */
public class InterfaceDemo {
	public static void main(String[] args) {
		Point point=new Point();
		point.area();
		System.out.println(point.getName());
	}
}
//定义一个接口，包括图形的面积、体积、获取该类的名字
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
//定义一个点类
class Point extends ShapeAdapter{
	int x,y;
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
//定义一个圆类
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


