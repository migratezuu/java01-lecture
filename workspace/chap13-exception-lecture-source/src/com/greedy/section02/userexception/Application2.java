package com.greedy.section02.userexception;

import com.greedy.section02.userexception.exception.MoneyNegativeException;
import com.greedy.section02.userexception.exception.NegativeException;
import com.greedy.section02.userexception.exception.NotEnoughMoneyException;
import com.greedy.section02.userexception.exception.PriceNegativeException;

public class Application2 {

	public static void main(String[] args) {

		
		/* 다양한 타입의 예외를 multi catch block을 이용해서 처리 */
		ExceptionTest et = new ExceptionTest();
		
		try {
			et.checkEnoughMoney(20000, 30000);
			
		} catch (PriceNegativeException e) {    //가장 하위 타입이 먼저 선언
			System.out.println("PriceNegativeException 발생");
			System.out.println(e.getMessage());
		} catch (MoneyNegativeException e) { 
			System.out.println("MoneyNegativeException 발생");
			System.out.println(e.getMessage());
		} catch(NotEnoughMoneyException e) {
			System.out.println("NotEnoughNegativeException 발생");
			System.out.println(e.getMessage());
		} catch(NegativeException e) {
			System.out.println("NegativeException 발생");
			System.out.println(e.getMessage());   //가장 상위 타입이 아래쪽..
		} finally {
			/* 예외 발생 여부와 상관 없이 실행할 내용 */
			System.out.println("fianlly 블럭 내용 동작함.");
		}
			
		System.out.println("프로그램이 종료되었습니다.");
	}

}
