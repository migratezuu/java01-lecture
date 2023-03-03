package com.greedy.section05.overloading;

public class OverloadingTest {

	
	public void test() {}   //test 잎부분은 아무리 달라져도 생성 안돼~
	
//	public void test() {}   똑같은 이름의 메소드를 만들 수 없다.
	
//	private void test() {} 

	
//	public int test() {return 0;} 리턴타입이 달라도 똑같은 줄 암
	
	public void test(int num) {}
	
//	public void test(int num2) {} //매개변수가 같아서 안돼~
	
	public void test(int num1, int num2) {}
	
	public void test(int num, String name) {} 
	
	public void test(String name, int num) {} //위에꺼랑 이름 같아도 순서 달라서 다른 메소드
	
}
