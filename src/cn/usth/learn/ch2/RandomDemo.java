package cn.usth.learn.ch2;
import java.util.* ; 
public class RandomDemo {
  /**�����ӡ��ĸA~Z�е�ʮ���ַ���
   * ѭ��ִ�����¹���ʮ�Σ�
   *�������һ��'A'�ı��뵽'Z'�ı���֮���һ��������Ȼ�����ת���ַ������
   */
	public static void main(String[] args){
		double Random;
		int number;
//		System.out.println(Random+"-----"+number);
		for(int i=0;i<10;i++){
			Random=65+26*Math.random();
			number=(int)Random;
			System.out.println((char)number+"----"+number);
		}
  }
}
