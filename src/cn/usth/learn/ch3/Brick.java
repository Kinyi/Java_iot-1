package cn.usth.learn.ch3;

import java.awt.Color;

public class Brick {
	/* �������� */
	Color color;
	int x, y;
	int[][] BrickArray = new int[4][4];

	/* ������Ϊ */
	Brick() {
		color = Color.LIGHT_GRAY;
		x = 0;
		y = 3;
		BrickArray[0][1] = 1;
		BrickArray[1][1] = 1;
		BrickArray[2][1] = 1;
		BrickArray[2][2] = 1;
	}

	// ��ʱ����ת:(x,y)--->(N-y-1,x),N�Ǿ���ά��,����N=4
	public void rotate() {
		int[][] temp = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				temp[4 - j - 1][i] = BrickArray[i][j];
			}
		}
		BrickArray=temp;
	}

	// ����
	public void moveLeft() {
		y--;
	}

	public void moveRight() {
		y++;
	}

	public void moveDown() {
		x++;
	}

	public void show() {
		System.out.println("��ɫ��" + color);
		System.out.println("���꣺(" + x + "," + y + ")");
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++) {
				System.out.print(BrickArray[i][j] + " ");
				if (j / 3 == 1) {
					System.out.println();
				}
			}
	}
}
