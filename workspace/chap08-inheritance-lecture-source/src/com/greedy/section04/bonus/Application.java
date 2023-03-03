package com.greedy.section04.bonus;

public class Application {

	//테스트 주도 개발...=> 코드의 신뢰성이 생김, 에러를 조금 더 빨리 찾을 수 있음...
	
	public static void main(String[] args) {
	
		Calculator calc = new Calculator();
		int result = calc.sumTwoNumber(10, 20);
		if(result == 30) {
			System.out.println("테스트 성공");
		}else {
			System.out.println("테스트 실패");
		}
		
		int result2 = calc.sumTwoNumber(20, 30);
		if( result2 == 50) {
			System.out.println("테스트 성공");
		}else {
			System.out.println("테스트 실패");
		}
	}

}
