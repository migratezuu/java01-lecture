package com.greedy.section05.logical;

public class Application3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*AND 연산과 OR연산의 특징
		 * 논리식 && 논리식 : 앞의 결과가  false이면 뒤를 실행 안함  (false를 앞에 쓰기)
		 * 논리식 || 논리식 : 앞의 결과가 true이면 뒤를 실행 안함   (true를 앞에 쓰기)
		 **/
		
		int num1 = 10;
		int result1 = (false && ++num1 > 0)? num1: num1;
		//                       (앞이  false라서 ++num1은 실행이 안됨
		
		
		System.out.println("&& 실행 확인 : " + result1);
		
		
		int num2 = 10;
		int result2 = (true || ++num2 > 0)? num2 : num2;
		
		System.out.println("|| 실행 확인 : " + result2);
			
		
		
		
		
		
	}

}
