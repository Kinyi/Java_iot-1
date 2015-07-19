package cn.usth.learn.ch3;
/*
 * 1.���������ʿ��Ʒ���public �� ȱʡ����
 * (1)public�����а����඼���Է��������
 * (2)ȱʡ��ֻ��ͬһ�����е�����Է���
 * 2.��Ա�����ַ��ʿ��Ʒ�
 * (1)private:��װ���ԣ�ͬʱ�ṩ���з�������ӿ����߼�
 * (2)ȱʡ�ģ�ͬһ���ڵ�����Է���
 * ��3��protected��ͬһ��������������
 * ��4��public:��������Է���
 */
public class Human {
	//��������
	protected String Name;
	private String Sex;
	private int Age;
	//������Ϊ
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
			System.out.println("̫�����ˣ�");
			Age=20;
		}
	}
	public void eat(){
		System.out.println("���ˣ�");
	}
	public void sayHello(){
		System.out.println("��ã��������࣡");
	}
	public void show(){
		System.out.println("������"+Name);
		System.out.println("�Ա�"+Sex);
		System.out.println("���䣺"+Age);
	}
	public String toString(){
		return "������"+Name+"���Ա�"+Sex+",���䣺"+Age;
	}
}
