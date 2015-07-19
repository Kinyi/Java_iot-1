package cn.usth.learn.ch4;
/**
 * 演示类与对象的关系：类空间和对象空间
 */
public class classDemo {
	static String x;
	String y;
	static void setX(String x){
		classDemo.x+=x;//静态变量使用“类名.变量名”进行调用
	}
	void setY(String y){
		this.y+=y;//非静态变量使用"this.变量名"进行调用
	}
	public static void main(String[] args) {
		classDemo c1=new classDemo();
		classDemo c2=new classDemo();
		classDemo c3=new classDemo();
		classDemo.x="我是classDemo类的静态变量x";
		//classDemo.setX(",我使用“类名.变量名”进行调用");
		c1.y="我是对象c1的非静态变量";
		//c1.setY(",我使用“this.变量名”进行调用");
		System.out.println(classDemo.x);
		System.out.println(c1.x);
		System.out.println(c1.y);
	}
}
