package com.greedy.section02.demensional_array.level02.normal;

import java.util.Random;
import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {

		/* ���ο� ���� ���̸� ���������� �Է� �޾�
		 * �Է¹��� ���� ���� ���̸� �̿��Ͽ� ������ �迭�� �Ҵ��ϰ�
		 * �� �ε������� �������� ���ĺ� �빮�� �־ ���
		 * 
		 * ��, ���� �� Ȥ�� ���� ���� �ݵ�� 1~10 ������ ������ �Է��ؾ� �ϰ�
		 * �׷��� ���� ��쿡�� "�ݵ�� 1~10������ ������ �Է��ؾ� �մϴ�. �ٽ� �Է��ϼ���." ��� ��
		 * ���� �� �Ǵ� ���� ���� �ٽ� �Է¹��� �� �ֵ��� �Ѵ�.
		 * 
		 * -- �Է� ���� --
		 * ���� ���� ���� �Է��ϼ��� : 5
		 * ���� ���� ���� �Է��ϼ��� : 4
		 * 
		 * -- ��� ���� --
		 * F H Z G 
		 * W F O T 
		 * O R X V 
		 * W H J X 
		 * W S S J 
		 * */

		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� ���� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.println("���� ���� ���� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		
		if(!((num1 >0 && num1 <10)&&(num2 >0 && num2 <10))) {
			System.out.println("�ݵ�� 1~ 10������ ������ �Է��ؾ� �մϴ�. �ٽ� �Է��ϼ���.");
	
		}else {

			int value = 1; 
			
			int[][] iarr = new int[num1][num2];

			for(int i = 0; i < iarr.length; i++) {
				for(int j = 0; j <iarr[i].length; j++) {
					iarr[i][j] = value ++;
					System.out.print(iarr[i][j] + "  ");
				}System.out.println();
			}
		}
		
		




	}

}
