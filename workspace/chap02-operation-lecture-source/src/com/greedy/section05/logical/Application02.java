package com.greedy.section05.logical;

public class Application02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 논리 연산자의 우선순위와 활용
		 * && : 11순위
		 * || : 12순위    */
		
		int x = 3;
		int y = 10;
		
		System.out.println(y >= 5 || x < 0 && x > 2); // t  f  t  에서 && 먼저 작용 후 || <순서 주의>
		System.out.println(y >= 5 ||  ( x < 0 && x > 2));  // => 그래서 그냥 괄호 써
		
		/* 1. 1부터 100사이의 값인지 확인
		 * 1 <= 뱐수 <= 100  이건 안돼(파이썬은 돼 ㅋ 자바는 안돼)
		 * 변수 >= 1 && 변수 <= 100
		 * */
		
		int num1 = 55;
		System.out.println("1부터 100 사이인지 확인 : "  + (num1 >= 1 && num1 <= 100));

		int num2 = 166;
		System.out.println("1부터 100 사이인지 확인 : " + (num2 >= 1 && num2 <= 100));
		
		
		
		/* 2. 영어 대문자인지 확인 
		 * 문자 >= 'A' && 문자 >= 'Z'
		 * */
		
		char ch1 = 'G';
		System.out.println("영어 대문자인지 아닌지 확인 : " + (ch1 >= 'A' &&  ch1 <= 'Z' ));

		char ch2 = 'g';
		System.out.println("영어 대문자인지 아닌지 확인 : " + (ch2 >= 'A' && ch2 <= 'Z'));
		
		
		
		/* 3. 대,소 상관없이 영문자 'y'인지 확인 
		 * 문자 == 'y' || 문자 == 'Y' (~이거나  = || / && 아님)
		 * */
		
		char ch3 = 'Y';
		System.out.println("영문자 y인지 확인 : " + (ch3 == 'y' || ch3 =='Y'));
		
		
		/* 4. 영문자인지 확인 */
		
		char ch4 = 'a';
		/*아스키코드 : A: 65, Z:90, a:97, z: 122*/   //중간에 숫자때문제 65~122는 아님 끊어서 작성
	
		System.out.println("영문자인지 확인 : " + ((ch4 >= 'A' && ch4 <= 'Z' ) || (ch4 >= 'a' && ch4 <= 'z' )));

		
		
	
		
		
		
		
		
		
		
		
//a는 정수 20이고 b는 문자 H이다. a가 22와 60사이인지 판단하고 b가 대문자인지 소문자인지 판단하여라
		
        //-----답안예시 ---
		//a는 22~60사이가 아니다.
		//b는 대문자이다.
		
		int a = 20;
		char b = 'H';
		//System.out.println("22~ 60 사이인지 확인 : " + (num10 >= 22 && num10 <= 60) + " 영어 소문자인지 아닌지 확인 :" + (ch10 >= 'a' && ch10 <= 'z'));
		
		String result1 = (a >= 22 && a <= 60)? "22~60사이다" : "22~60사이가 아니다.";
		
		System.out.println("a는 " + result1);
		String result2 =  (b >= 'a' && b <= 'z')? "소문자다." : "대문자다";
		
		System.out.println("b는 " + result2);
		
		
		
		
		
		
		
	}

}
