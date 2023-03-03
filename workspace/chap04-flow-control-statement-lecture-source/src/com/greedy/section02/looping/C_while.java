package com.greedy.section02.looping;

import java.util.Scanner;

public class C_while {

	/*[while문 표현식]
	 * 초기식;
	 * while(조건식) {
	 * 		조건식을 만족하는 경우 수행할 구문(반복할 구문);
	 * 		증감식;
	 * }
	 * */

	public void testStatementExample() {
		int i = 1;
		while(i <= 10) {
			System.out.println(i);

			i++;


			//for(int i = 1; i <= 10; i++) {
			//	System.out.println(i);
			//	}
		}
	}

	public void testWhileExample1() {
		/*입력한 문자열의 인덱스를 이용하여 문자 하나씩 출력해보기*/
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String str =sc.nextLine();

		for(int i = 0; i < str.length(); i++) {
			System.out.println(i + " : " + str.charAt(i));
		}

		int index = 0;
		while(index < str.length()) {

			System.out.println(index + " : " + str.charAt(index));

			index++;
		}
	}

	public void testWhileExample2() {

		/* 정수 하나를 입력 받아 1부터 입력받은 정수까지의 합계를 출력
		 * 단,  while문을 이용해서 작성하시오.
		 * */

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하시오 : ");
		int num1 = sc.nextInt();

		int a = 0;
		int sum = 0;
		while( a<= num1) {
			sum += a;    //이거 헷갈리니까 정리하기 ~까지 의 합 !! "+="
			a ++;
		}

		System.out.println("sum : " + sum);
	}




	///*while문을 이용해서 구구단 2단~ 9단 출력하기*///
	public void testWhileExamples3() {

		int dan = 2;

		while(dan <= 9) {

			printGugudan(dan);
			dan++; //  출력보다 아래에 붙이기 위에 붙이면 +1 되서 나옴 이유는 모름; ㅋ
		}
	}
	public void printGugudan(int dan) {
		int su = 1;
		while(su <= 9) {

			System.out.println(dan + " * " + su + " = " + (dan * su));
			su ++;		 
		}
		System.out.println();
	}

	/***쌤이 해준거 구구단****/

	public void testWhileExemple33() {
		int dan = 2;
		while(dan <10) {
			int su = 1;
			while(su < 10) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
				su++;
			}
		}
		System.out.println();
		dan++;
	}
	public void testWhileExemple333() {
		int dan = 2;
		while(dan < 10) {
			int su = 2;
			while(su < 10) {
				su ++;
			}
			dan ++;
		}	
	}
	
}















