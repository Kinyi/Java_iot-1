package cn.usth.learn.ch5;
/*
 * 类与对象的关系：
 * 1、类中定义的静态属性和方法存放在类空间
 * 2、类中定义的非静态属性和方法存放在对象空间
 * 3、类空间只有一份，所有对象共享一个类空间
 * 4、对象空间可以有多份，每次new运算创建一个对象空间
 * 5、主函数main是静态的
 * 6、静态属性和方法使用"类名.属性名",或"类名.方法名"的方式调用
 * 7、非静态属性和方法使用"对象名.属性名",或"对象名.方法名"的方式调用
 * 
 */
public class staticDemo {
	static String x;
	static int num;
	String y;
	
	static void setX(String x){
		staticDemo.x=x;
	}
	void setY(String y){
		this.y=y;
	}
	void show(){
		staticDemo.num++;
	}
	
	public static void main(String[] args) {
		staticDemo.x="我是静态变量，我在类空间";
		System.out.println("x="+x);
		staticDemo demo=new staticDemo();
		demo.y="我是非静态变量，我在demo对象空间";
		demo.show();
		demo.show();
		demo.show();
		System.out.println("num="+staticDemo.num);
	}

}
