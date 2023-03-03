package com.greedy.section03.api.math;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* java.lang.Math //import 없이 사용 가능하다.
		 * Math클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해놓은 클래스이다.
		 * */
		
		/* 절대값 */
		System.out.println("-7의 절대값 :" +  Math.abs(-7));
		System.out.println("-1.25의 절대값 : " + Math.abs(-1.25));
		
		/* 최대값 최소값 */
		System.out.println("10과 20 중에 더 작은 것은 : " + Math.min(10, 20));
		System.out.println("10과 20 중에 더 큰 것은 : " + Math.max(10, 20));
		
		/* 원주율 */
		System.out.println("원주율 : " + Math.PI);  //PI대문자 => 상수값
		
		/* 난수 발생*/
		System.out.println("난수 : " + Math.random());
		
	}
}
