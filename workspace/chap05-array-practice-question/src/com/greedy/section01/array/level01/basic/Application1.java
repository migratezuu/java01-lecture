package com.greedy.section01.array.level01.basic;

public class Application1 {

	public static void main(String[] args) {
		
		/* ���̰� 10�� ������ �迭�� ���� �� �Ҵ��� ��
		 * �� �ε����� ���ʴ�� 1���� 10���� ���� �ְ� ����ϼ���
		 * */
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] =i+1;
			System.out.print(arr[i]);
		}
		System.out.println();
	}

}
