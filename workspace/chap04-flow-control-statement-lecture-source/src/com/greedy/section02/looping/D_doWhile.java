package com.greedy.section02.looping;

import java.util.Scanner;

public class D_doWhile {

	public void testSimpleDoWhileStatement() {
		/*[do-while문 표현식]
		 * 초기식;
		 * do {
		 * 		1회차에는 무조건 실행하고, 이후에는 조건식을 확인하여 조건을 만족하는 경우 실행할 구문;
		 * 		증감식;
		 * 	} while(조건식); //조건식이 트루이면 do로 올라가고 false면 나감
		 * 
		 * */
		do {
			System.out.println("최초 한 번 동작함...");
		}while(false);
		
		System.out.println("반복문 종료 확인...");
	}
	
	
	
	
	
	/* 키보드로 문자열을 입력받아 반복적으로 출력*
	 * 단, exit가 입력되면 반복문을 종료*/
	
	public void testDoWhileExemple1() {
		
		Scanner sc = new Scanner(System.in);
		String str = ""; //밖에서 선언해야 안에도 사용 가능..(exit에서도 사용되려면 위(밖)에서 써야함
		
		do {
			System.out.print("문자열을 입력하세요. : ");
			str = sc.nextLine();
			System.out.println(str);
		}while(!str.equals("exit")); //exit가 아니면!! (!)
		System.out.println("프로그램을 종료합니다.");
	}
}


















