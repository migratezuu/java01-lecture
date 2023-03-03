package com.greedy.section04.bonus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
	
	private Calculator calc;
	
	@BeforeAll
	public static void beforAll() {
		System.out.println("beforeAll 동작함...");  //최초의 한번만 동작함....(하나의 인스턴스 재사용)
	}
	
	@BeforeEach   //매번 새로운 인스턴스 사용
	public void setUp() {
		calc = new Calculator();
		System.out.println("beforeEach 동작함...");
	}
	
	//Application 없이 호출문 만들기..
	
	@Test//J unit 5버전으로 import 하자..
	@DisplayName("sumTwoNumber에 10과 20을 전달하여 잘 더해지는지 확인")
	public void testSumTwoNumber() {   //test는 무조건 void형
		
//		int result = calc.sumTwoNumber(10, 20); //테스트 실행 => ctrl + f11 
//		
//		System.out.println("테스트1");
//		
//		assertEquals(31, result, 1); //앞은 기대하는 값 뒤는 실제 값 맨뒤는 오차범위 ..거의 사용안해 맨뒤는
		
		
//		!test코드 작성 흐름!
		//given
		int num1 = 10;
		int num2 = 20;	
		int expected = 30;
		
		//when
		int result = calc.sumTwoNumber(num1, num2);
		
		
		//then
		assertEquals(expected, result);
	}
	
	
	@Test
	@Disabled // 실행되는 테스트 목록에는 포함되지만 테스트는 안됨
	public void testSumTwoNumber2() {
		int result = calc.sumTwoNumber(30, 50);
		
		System.out.println("테스트2");
	
		assertEquals(80, result);  
//		단정메소드
//		assertTrue
//		asserNotNull
//		assertNull
	}
	
	@AfterEach
	public void close() {
		System.out.println("afterEach 동작함...");
	}
	
	@AfterAll
	public static void afterAll() {  //한번만 실행....
		System.out.println("afterAll 동작함...");
	}
	
}
