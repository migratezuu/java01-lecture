package com.greedy.section02.looping;

import java.util.Scanner;

public class A_for {

	public void testSimpleForStatement() {
		
		/* [ for문 표현식]
		 * for(초기식; 조건식; 증감식) {
		 *  	조건을 만족하는 경우 수행할 구문(반복할 구문)
		 * }
		 * */
		
		/* 입력한 문자열의 글자수를 받아 출력*/
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자열을 입력하세요 : ");
//		String str = sc.nextLine();
//		for(int i = 0; i < str.length(); i++) { //초기식은 조건문 선언 //조건식은 조건 기술 //증감식은 초기와 조건에 사용한 식을 증감
//			System.out.println(str.charAt(i));

		for(int i =0; i <10; i += 2 ) {
			System.out.println(i);
		}
	
	}
	
	
	//	System.out.println(i); 반복문 밖에서 출력하면 에러 - 에러안나려면 반복문 위에서 i 따로 선언해야됨
	
	public void testForExample() {
		
		/* 5명의 학생 이름을 입력받아 출력을 해보자.  
		 * 이때, 한 명 이름 입력받은 후 한 명 이름 출력 반복
		 * */
		
		//입 출 입 출 반복 => 반복문으로 바꾸려면 규칙이 있어야함.
		//여기서의 규칙 -> 학생번호가 1씩 중가함.
		
		Scanner sc = new Scanner(System.in); //여기는 반복이 아님.
		
		System.out.print("1번째 학생 이름을 입력하세요. : " );
		String student1 = sc.nextLine();
		System.out.println("1번째 학생 이름은 " + student1 + "입니다.");
		
		System.out.print("2번째 학생 이름을 입력하세요. : " );
		String student2 = sc.nextLine();
		System.out.println("2번째 학생 이름은 " + student2 + "입니다.");
		
		System.out.print("3번째 학생 이름을 입력하세요. : " );
		String student3 = sc.nextLine();
		System.out.println("3번째 학생 이름은 " + student3 + "입니다.");
		
		System.out.print("4번째 학생 이름을 입력하세요. : " );
		String student4 = sc.nextLine();
		System.out.println("4번째 학생 이름은 " + student4 + "입니다.");
		
		System.out.print("5번째 학생 이름을 입력하세요. : " );
		String student5 = sc.nextLine();
		System.out.println("5번째 학생 이름은 " + student5 + "입니다.");
		
		
		
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + "번째 학생의 이름을 입력하세요. :" );
			String student = sc.nextLine();
			System.out.println(i + "번째 학생의 이름은 " + student + "입니다. ");
			
		}
		
	}
	
	
	public void testForExample2() {
		
		/* 1 ~ 10까지의 합계를 구하시오.
		 * */
	/*	
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		int num6 = 6;
		int num7 = 7;
		int num8 = 8;
		int num9 = 9;
		int num10 = 10;
		
		int sum = 0; //지역번수는 반드시 초기화 
					 //+ - 는 0으로 곱하긴느 반드시 1로 초기화 해야함
		
		//반복 할 내용			 
		sum += num1;
		sum += num2;
		sum += num3;
		sum += num4;
		sum += num5;
		sum += num6;
		sum += num7;
		sum += num8;
		sum += num9;
		sum += num10;
		
		System.out.println("sum : " + sum);
		
		*/
		
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i ++) {
			sum += i;
		}
		
		System.out.println("sum : " + sum);
		
	}

	public void testForExample3() {
		
		/*  5~ 10 사이의 난수를 발생시켜서 
		 * 1부터 발생한 난수까지으 합을 출력하세요
		 * */
		
		int random1 = (int)(Math.random()*6 +5);
		System.out.println("1부터 발생한 난수  : " + random1 );
		
		int sum = 0;
		
		for(int i = 1; i <= random1; i++) {
			sum += i;
		}
		System.out.println("1부터 난수까지의 합은 : " + sum);
		
	}
	
	
	public void testForExample4() {
		/* 숫자 두 개를 입력 받아 작은 수에서 큰 수까지의 합계를 구하시오.
		 * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결
		 * (첫 번째 정수가 반드시 작아야 하는 것은 아니다.)
		 * */
		
		
		//두 정수 받기
		//큰 수 작은 수 정의
		//누가 큰지 작은지 판단
		//작은거 부터 큰거까지 합 반복
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요. : ");
		int num1 = sc.nextInt(); 
		
		System.out.print("두번째 수를 입력하세요. : ");
		int num2 = sc.nextInt(); 
		
		int large = 0;
		int small = 0;
		
		if( num1 > num2){
			large = num1;
			small = num2;
			} else {
			large = num2;
			small = num1;
		}
		
		int sum = 0;
		
		for(int i = small; i <= large ; i++) {
			sum += i;
		}
		System.out.println("두 정수사이의 합은 " + sum + "입니다.");
	}
	
	public void printSimpleGugudan() {
		
		/* 키보드로 2~9사이의 숫자를 입력받아
		 * 2~9 사이인 경우 해당 단의 구구단을 출력,
		 * 그렇지 않으면 반드시 2~9사이의 양수 입력해야함*/
		
		
		//문장먼저 출력
		//2~9 아니면 빠꾸
		//1~9 나열
		//입력 받은 숫자랑 나열 수 연산 
		//출력
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요. : ");
		int num1 = sc.nextInt(); 
		
		if (num1 <2 || num1 >9) {
			System.out.println("반드시 2~9사이의 수를 입력");
		} else {
			for( int i = 1; i < 10; i ++ ) {
				System.out.println(num1 + " * " + i + " = "+ num1 * i);
			}
		}
		
	}
	
	//1번째 수와 2번째 수를 입력하고 두 수 중에 1번째 수가 크면 두 수를 더하고
	//2번째 수가 더 크면 두수를 빼어리 (빼는 순서는 1번째 수에서 두번째 수를 밴다.)
	
	//변수는 1번째 수는 num1으로 , 2번째 수는 num2로 정한다.
	
	
	public void dong() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1번째 수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("2번째 수 입력 : ");
		int num2 = sc.nextInt();
		
		if( num1 > num2) {
			System.out.println("결과 : " + (num1 + num2));
		}else {
			System.out.println("결과 : " + (num1 - num2));
		}
		
	}
	
	
	
	
	
	
}


















