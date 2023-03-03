package com.greedy.section01.conditional;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class C_IfElseIf {
	
	public void testSimpleIfElseStatement() {
	
		/*[if-else-if문 표현식]
		 * if(조건식1)
		 * 		조건식1이 true일 때 실행할 명령문;
		 * }else if(조건식2) {
		 * 		조건식1이 false이고, 조건식2가 true일 때 실행할 명령문;
		 * }else {
		 * 		조건식1과 조건식2가 둘 다 false일 때 실행할 명령문;
		 * }
		 * 
		 * */
		
//		String str1 = "java";
//		String str2 = "java";
//		
//		System.out.println(str1 == str2);
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자열을 입력하세요. : ");
//		String str3 = sc.nextLine();
//		System.out.println(str1 == str3);
//		System.out.println(str1.equals(str3));
//	
		
		System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다.");
		System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
		System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어보았다.");
		
		System.out.println("어느 도끼가 너의 도끼이냐? : ");
		Scanner sc = new Scanner(System.in);
		String answer = sc.nextLine();
		
		if(answer.equals("금도끼")) {
			System.out.println("산신령 : 이런 거짓말쟁이 ㅋ 넌 못줘");
			
		}else if (answer.equals("은도끼")) {
			System.out.println("산신령 : 너도 거짓말쟁이");
			
		}else {
			System.out.println("산신령 : 오 넌 줄게");
		}
		System.out.println("그렇게 산신령은 갔다.");
		
	}
}
