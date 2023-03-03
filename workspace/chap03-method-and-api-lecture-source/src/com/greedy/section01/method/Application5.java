package com.greedy.section01.method;

public class Application5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 메소드 리턴 테스트
		 * 모든 메소드 내부에는 return; 존재 (없으면 생략된거임)
		 * void  메소드의 경우  return;을 명시적으로 작성하지않아도 컴파일러가 자동으로 추가를 해줌
		 * 메소드 : 현재 진행중인 메소드를 중단하고 호출 구문으로 복귀해라~ 
		 * */
		
		Application5 app5 = new Application5();
		app5.testMethod();

	}
	public void testMethod() {
		System.out.println("testMethod() 동작 확인...");
		
//		return;(void 구문 생략가능~)
		
		return;
		
//		System.out.println("hello world"); //리턴밑에는 쓸 수 없다.. 종료되기 때문
	}
	
}
