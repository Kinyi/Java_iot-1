package cn.usth.learn.ch3;

public class Man extends Human{
	
	Man(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	/*	public void sayHello(){
		super.sayHello();
		System.out.println("��ã��������ˣ�");
	}*/
	public void sayHello(String str){
		super.sayHello();
		
		System.out.println(str);
		System.out.println("��ã��������ˣ�");
	}
}
