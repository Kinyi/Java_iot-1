package cn.usth.learn.ch6;

public class AbstractClassDemo {
/*
 * 抽象类的特点：
 * （1）抽象类不能实例化
 * （2）非抽象子类继承抽象类后，必须实现父类的抽象方法
 * （3）抽象类中可以定义抽象方法，也可以定义非抽象方法
 */
	public static void main(String[] args) {
		//创建 一个Brick类的实例
		
		Brick brick=new IBrick();
		brick.show();
		brick.rotate();
		
		brick=new ZBrick();
		brick.show();
		brick.rotate();
	}
}
abstract class Brick{
	//声明一个抽象方法
	public abstract void rotate();
	//定义一个非抽象方法
	public void show(){
		System.out.println(this.toString());
	}
}
//定义一个非抽象的子类IBrick
class IBrick extends Brick{
	@Override
	public void rotate() {
		System.out.println("旋转IBrick");
	}
}
//定义一个非抽象的子类ZBrick
class ZBrick extends Brick{
	@Override
	public void rotate() {
		System.out.println("旋转ZBrick");
	}
}









