package com.greedy.section02.demensional_array.level01.basic;

public class Application1 {

	public static void main(String[] args) {
		
		/* ���� ���̰� 3, ���� ���̰� 4�� ������ 2���� �迭�� ���� �� �Ҵ��ϰ�,
		 * �� �ε����� ���ʴ�� 1���� 12������ ������ ������ ��
		 * �� ���� ����ϴ� �ڵ带 �ۼ��Ͻÿ�. 
		 * 
		 * -- ��� ���� --
		 * 1  2  3  4
		 * 5  6  7  8
		 * 9 10 11 12
		 * 
		 * ��, ��¹��� �ٸ����� �Ű澲�� ���� Ǯ�����
		 * */
		
		int value = 1; 
		
		int[][] iarr = new int[3][4];
		
		for(int i = 0; i < iarr.length; i++) {
			for(int j = 0; j <iarr[i].length; j++) {
				iarr[i][j] = value ++;
				System.out.print(iarr[i][j] + "  ");
			}System.out.println();
		}
		
		
		
		
	}

}
