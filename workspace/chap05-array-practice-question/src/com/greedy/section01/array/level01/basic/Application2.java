package com.greedy.section01.array.level01.basic;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
		/* ���̰� 5�� String �迭�� �����ϰ� 
		 * "����", "�ٳ���", "������", "Ű��", "���" �� �ʱ�ȭ�� �ϰ�
		 * ��ĳ�ʷ� 0���� 4������ ������ �Է� �޾�
		 * �ش� ������ �ε����� �ִ� ������ ����ϼ���
		 * 
		 * ��, �迭�� �ε��� ������ ����� ��� "�غ�� ������ �����ϴ�." �� ����ϼ���
		 * 
		 * -- �Է� ���� --
		 * 0���� 4������ ������ �Է��ϼ��� : 2
		 * 
		 * -- ��� ���� --
		 * ������
		 * 
		 * -- �Է� ���� --
		 * 0���� 4������ ������ �Է��ϼ��� : 5
		 * 
		 * -- ��� ���� --
		 * �غ�� ������ �����ϴ�.
		 * */
		
		
		String[] arr = new String[5];
		
		arr[0] = "����"; 
		arr[1] = "�ٳ���";
		arr[2] = "������";
		arr[3] = "Ű��";
		arr[4] = "���";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0���� 4������ ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println(arr[0]);
		}else if (num == 1) {
			System.out.println(arr[1]);
		}else if (num == 2) {
			System.out.println(arr[2]);
		}else if(num == 3) {
			System.out.println(arr[3]);
		}else if(num == 4) {
			System.out.println(arr[4]);
		}else {
			System.out.println("�غ�� ������ �����ϴ�.");
		}
		System.out.println();
	}

}
