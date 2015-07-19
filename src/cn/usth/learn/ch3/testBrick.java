package cn.usth.learn.ch3;

public class testBrick {

	public static void main(String[] args) {
		Brick brick=new Brick();
		System.out.println("旋转前：");
		brick.show();
		brick.rotate();
		System.out.println("旋转后：");
		brick.show();
	}

}
