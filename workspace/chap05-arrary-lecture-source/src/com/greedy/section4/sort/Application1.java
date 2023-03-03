package com.greedy.section4.sort;

import java.util.Iterator;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 변수의 두 값 변경하기 */
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		int temp; //임시 저장 공간
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		int[] arr = {2, 1, 3};
		int temp2 = arr[0];
		arr[0] = arr[1];
		arr[1] = temp2;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
