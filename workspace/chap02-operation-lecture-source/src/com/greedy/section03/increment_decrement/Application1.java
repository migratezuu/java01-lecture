package com.greedy.section03.increment_decrement;

public class Application1 {
	
	public static void main(String[] args) {
		/* 증감연산자 
		 	피연산자의 앞 or 뒤에 사용이 가능
		 	++ : 1 증가
		 	-- : 1 감소
		 	*/
		
		int num = 20;
		System.out.println("num : " + num);
		
		num ++;
		System.out.println("num : " + num);
		
		++num;
		System.out.println("num : " + num);
		
		num--;
		System.out.println("num : " + num);
		
		--num;
		System.out.println("num : " + num);
		
		/*다른 연산자와 함께 사용하면 의미가 달라짐
		 *++var : 피연산자의 값을 먼저 1 증가 후 다른 연산 진행
		 *var++ : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 증거
		 *--var : 피연산자의 값을 먼저 1감소시킨 후 다른 연산을 진행
		 *var-- : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값읗 1감소
		 */
		
		int firstNum = 20;
		
		int result1 = firstNum++ *3; /*(20*3 먼저하고 증가)*/
		
		System.out.println("result1 : " + result1);
		System.out.println("firstNum :" + firstNum);
		
		int secondNum = 20;
		
		int result2 = ++secondNum * 3; /*(먼저 증가하고 21 * 3)*/
		
		System.out.println("result2 : " + result2);
		System.out.println("secondNum : " + secondNum);
		
		int num1 = 10;
		int addNum = num1++;
		
		System.out.println("addNum : " + addNum);
		
	}
}
