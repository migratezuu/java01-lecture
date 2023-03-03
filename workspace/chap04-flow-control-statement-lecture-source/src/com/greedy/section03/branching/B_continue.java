package com.greedy.section03.branching;

public class B_continue { //실행하는 횟수를 줄이는 장점이 있다...~ => 속도가 빨라짐

	public void testSimpleContinueStatement() {
		
		/* continue문은 반복문 내에서 사용한다.
		 * 해당 반복문의 회차를 중간에 멈추고 다시 증감식으로 넘어가게 한다.
		 * 일반적으로 if(조건식) { continue; } 처럼 사용된다.
		 * */
		
		/*1부터 100사이의 값 출력
		 * 단, 4의 배수이면서, 5의 배수인 값만 출력*/
		
		for(int i = 1; i <= 100; i ++) {
			
			if(!(i%4 == 0 && i % 5 == 0)) { //! 4와 5의 배수가 아닌 경우
				continue;  //=> 강제로 증감식으로 올라감 => 20이 되는 순간 출력문으로 넘어감
			}
			System.out.println(i);
		}
	}
	
	
	
	
	
	
}
