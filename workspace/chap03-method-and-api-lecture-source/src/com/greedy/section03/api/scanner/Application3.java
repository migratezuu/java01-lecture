package com.greedy.section03.api.scanner;

import java.util.Scanner;

public class Application3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 스캐너 사용 시 주의 사항 */
		/* 1. next(0로 문자열 입력 받은 후 정수, 실수, 논리값 입력 받을 때
		 * 2. 정수, 실수, 논리값 입력 후 next() 혹은 nextLine()으로 문자열 입력 받을 때
		 * 3. 
		 * 
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요. : ");
		String str1 = sc.next();  //next쓰면 띄어쓰기 이후가 인트로 넘어가서 에러~
		System.out.println("str1 : " + str1);
		
		System.out.print("숫자를 입력해주세요. : ");
		int num1 = sc.nextInt();
		System.out.println("num1 : " + num1);
		sc.nextLine(); // 이걸 써야 다음 공백이 답으로 넘어가지 않음!
		
		System.out.print("공백이 있는 문자열을 하나 입력해주세요. : ");
		String str2 = sc.nextLine();
		System.out.println("str2 : " + str2);
		
		
	}

}
