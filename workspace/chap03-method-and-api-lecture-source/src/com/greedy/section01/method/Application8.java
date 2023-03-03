package com.greedy.section01.method;

public class Application8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* static 메소드 호출 */
		/* static 메소드를 호출하는 법 
		 * 클래스명.메소드명();
		 * */
		
		System.out.println("10과 20의 합 : " + Application8.sumTwoNumbers(10, 20));
		
		System.out.println("20과 30의 합 : " + sumTwoNumbers(20, 30)); //클래스명 생략 가능
	}
	
	public static int sumTwoNumbers(int first, int second) {
		
		return first + second;
	}
}
