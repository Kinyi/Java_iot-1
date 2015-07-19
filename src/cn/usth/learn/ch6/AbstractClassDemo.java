package cn.usth.learn.ch6;

public class AbstractClassDemo {
/*
 * ��������ص㣺
 * ��1�������಻��ʵ����
 * ��2���ǳ�������̳г�����󣬱���ʵ�ָ���ĳ��󷽷�
 * ��3���������п��Զ�����󷽷���Ҳ���Զ���ǳ��󷽷�
 */
	public static void main(String[] args) {
		//���� һ��Brick���ʵ��
		
		Brick brick=new IBrick();
		brick.show();
		brick.rotate();
		
		brick=new ZBrick();
		brick.show();
		brick.rotate();
	}
}
abstract class Brick{
	//����һ�����󷽷�
	public abstract void rotate();
	//����һ���ǳ��󷽷�
	public void show(){
		System.out.println(this.toString());
	}
}
//����һ���ǳ��������IBrick
class IBrick extends Brick{
	@Override
	public void rotate() {
		System.out.println("��תIBrick");
	}
}
//����һ���ǳ��������ZBrick
class ZBrick extends Brick{
	@Override
	public void rotate() {
		System.out.println("��תZBrick");
	}
}









