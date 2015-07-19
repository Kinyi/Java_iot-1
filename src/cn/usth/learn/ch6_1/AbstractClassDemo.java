package cn.usth.learn.ch6_1;

/*
 * 抽象类的特点：
 * （1）抽象类不能被实例化
 * （2）可以包括非抽象方法，也可以包括抽象方法
 * （3）如果子类是非抽象类，则子类必须实现抽象方法
 */
public class AbstractClassDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brick brick = new ZBrick();
		brick.show();
		brick.rotate();
	}

}

abstract class Brick {
	//非抽象方法
	void show() {
		System.out.println("显示方块信息:" + this.toString());
	}
	//抽象方法
	abstract void rotate();
}

class IBrick extends Brick {

	@Override
	//实现抽象方法
	void rotate() {
		System.out.println("旋转IBrick");
	}

}

class ZBrick extends Brick {

	@Override
	//实现抽象方法
	void rotate() {
		System.out.println("旋转ZBrick");

	}

}