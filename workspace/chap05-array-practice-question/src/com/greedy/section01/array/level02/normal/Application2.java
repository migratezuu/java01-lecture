package com.greedy.section01.array.level02.normal;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {

		/* �ֹε�Ϲ�ȣ�� ��ĳ�ʷ� �Է� �ް� ���� �迭�� ������ ��,
		 * ���� �ڸ� ���ĺ��� *�� ������ ����ϼ���
		 * 
		 * -- �Է� ���� --
		 * �ֹε�Ϲ�ȣ�� �Է��ϼ��� : 990101-1234567
		 * 
		 * -- ��� ���� --
		 * 990101-1******
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ�� �Է��ϼ���. : ");
		String str = sc.nextLine();

		String[] arr = new String[14];
		for(int i = 9; i <= arr.length; i ++) {
			str = "*";
			System.out.print(str);
		}
		
		System.out.println();

	}
}
