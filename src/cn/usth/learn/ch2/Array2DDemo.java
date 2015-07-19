package cn.usth.learn.ch2;
/**
 * 二维数组求矩阵的转置
 *
 */
public class Array2DDemo {
	public static void main(String args[]){
		//定义并初始化一个二维数组
		int[][] rect={
				{1,1,1,1},
				{2,2,2,2},
				{3,3,3,3},
				{4,4,4,4}
		};
		//打印矩阵
		System.out.println("翻转前:");
		for(int i=0;i<rect.length;i++){//rect.length就是数组的行数
			for(int j=0;j<rect[i].length;j++){//rect[i].length就是数组的列数
				System.out.print(rect[i][j]+" ");
				if(j/(rect.length-1)==1)System.out.println();
			}
		}
		//翻转矩阵
		for(int i=0;i<rect.length;i++){
			for(int j=i+1;j<rect[i].length;j++){
				int temp=rect[i][j];
				rect[i][j]=rect[j][i];
				rect[j][i]=temp;
			}
		}
		//打印矩阵
		System.out.println("翻转后:");
		for(int i=0;i<rect.length;i++){
			for(int j=0;j<rect[i].length;j++){
				System.out.print(rect[i][j]+" ");
				if(j/(rect.length-1)==1)System.out.println();
			}
		}
	}
}
