package com.greedy.section03.api.scanner;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Scanner의 nextLine()과 next() */
		Scanner sc = new Scanner(System.in);
		System.out.print("인사말을 입력해주세요 : ");
		String greeting1 = sc.nextLine();  //쓴거 전체를 반환
		System.out.println(greeting1);
	
		System.out.print("인사말을 입력해주세요 : ");
		String greeting2 = sc.next(); // 띄어쓰기 전 단어만 보여줌 ( 토큰단위로 분류함)
		System.out.println(greeting2);
		System.out.println(sc.next());
		
	}

}
