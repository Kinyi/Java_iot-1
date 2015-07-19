package cn.usth.learn.ch6_1;

/*
 * ��������ص㣺
 * ��1�������಻�ܱ�ʵ����
 * ��2�����԰����ǳ��󷽷���Ҳ���԰������󷽷�
 * ��3����������Ƿǳ����࣬���������ʵ�ֳ��󷽷�
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
	//�ǳ��󷽷�
	void show() {
		System.out.println("��ʾ������Ϣ:" + this.toString());
	}
	//���󷽷�
	abstract void rotate();
}

class IBrick extends Brick {

	@Override
	//ʵ�ֳ��󷽷�
	void rotate() {
		System.out.println("��תIBrick");
	}

}

class ZBrick extends Brick {

	@Override
	//ʵ�ֳ��󷽷�
	void rotate() {
		System.out.println("��תZBrick");

	}

}