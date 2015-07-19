package cn.usth.learn.ch2;
import java.util.* ; 
public class RandomDemo {
  /**随机打印字母A~Z中的十个字符？
   * 循环执行以下过程十次：
   *随机产生一个'A'的编码到'Z'的编码之间的一个整数，然后把它转成字符型输出
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
