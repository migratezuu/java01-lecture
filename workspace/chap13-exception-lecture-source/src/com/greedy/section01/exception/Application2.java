package com.greedy.section01.exception;

public class Application2 {

	public static void main(String[] args) {
		
		/*try - catch 이용한 방법 */
		ExceptionTest et = new ExceptionTest();
		
		try {
//			et.chechEnoughMoney(10000, 50000);
			et.chechEnoughMoney(50000, 10000);
			 //성공하면 발생할 것을 여기에
			System.out.println("상품 구입 가능합니다.");
		
		} catch (Exception e) {
//			e.printStackTrace(); //에러 형태를 출력하는 문구
			System.out.println("===== 상품 구입 불가 ======");
		}
		System.out.println("프로그램을 종료합니다."); 
	}

}
