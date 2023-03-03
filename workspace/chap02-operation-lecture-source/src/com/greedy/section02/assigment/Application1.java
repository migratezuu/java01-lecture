package com.greedy.section02.assigment;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*syso + 컨트롤 + 스페이스
		 * 컨트롤 + i 줄맞춤
		 * 컨트롤 + a 전체선택*/
		
		int num = 12;
		
		System.out.println("num : "  + num);
		
		//3증가
		num = num +3;   //대입연산자 오른쪽은 값, 왼쪽은 공간
		System.out.println("num:" + num);
		
		num += 3;		 //num = num + 3과 같은 의미임
		System.out.println("num: " + num);
		
		num -= 5;
		System.out.println("num:" + num);
		
		num *= 2;
		System.out.println("num :" + num);
		
		num /= 2;
		System.out.println("num: " + num);
		
		
		/*주의 산술 복합 대입 연산자의 작성 순서에 유의해야함
		 * 산술 대입 연산자 -= 를 =-로 사용하는 경우
		 * num =- 5; (음수 -5를 대입한거임)
		 * */
		
		num =- 5;
		System.out.println("num :" + num);
		 
		
		
	}

}
