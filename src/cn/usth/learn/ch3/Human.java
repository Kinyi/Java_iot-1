package cn.usth.learn.ch3;
/*
 * 1.类的两类访问控制符：public 和 缺省访问
 * (1)public：所有包的类都可以访问这个类
 * (2)缺省：只有同一个包中的类可以访问
 * 2.成员的四种访问控制符
 * (1)private:封装属性，同时提供公有方法，添加控制逻辑
 * (2)缺省的：同一包内的类可以访问
 * （3）protected：同一包或其所有子类
 * （4）public:所有类可以访问
 */
public class Human {
	//定义属性
	protected String Name;
	private String Sex;
	private int Age;
	//定义行为
	public Human(int age){
		Age=age;
	}
	Human(int age,String name){
		this(age);
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		if(age>20){
			Age=age;
		}else{
			System.out.println("太年轻了！");
			Age=20;
		}
	}
	public void eat(){
		System.out.println("吃了！");
	}
	public void sayHello(){
		System.out.println("你好，我是人类！");
	}
	public void show(){
		System.out.println("姓名："+Name);
		System.out.println("性别："+Sex);
		System.out.println("年龄："+Age);
	}
	public String toString(){
		return "姓名："+Name+"，性别："+Sex+",年龄："+Age;
	}
}
