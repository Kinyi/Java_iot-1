package cn.usth.learn.ch2;
/**
 * ��ά����������ת��
 *
 */
public class Array2DDemo {
	public static void main(String args[]){
		//���岢��ʼ��һ����ά����
		int[][] rect={
				{1,1,1,1},
				{2,2,2,2},
				{3,3,3,3},
				{4,4,4,4}
		};
		//��ӡ����
		System.out.println("��תǰ:");
		for(int i=0;i<rect.length;i++){//rect.length�������������
			for(int j=0;j<rect[i].length;j++){//rect[i].length�������������
				System.out.print(rect[i][j]+" ");
				if(j/(rect.length-1)==1)System.out.println();
			}
		}
		//��ת����
		for(int i=0;i<rect.length;i++){
			for(int j=i+1;j<rect[i].length;j++){
				int temp=rect[i][j];
				rect[i][j]=rect[j][i];
				rect[j][i]=temp;
			}
		}
		//��ӡ����
		System.out.println("��ת��:");
		for(int i=0;i<rect.length;i++){
			for(int j=0;j<rect[i].length;j++){
				System.out.print(rect[i][j]+" ");
				if(j/(rect.length-1)==1)System.out.println();
			}
		}
	}
}
