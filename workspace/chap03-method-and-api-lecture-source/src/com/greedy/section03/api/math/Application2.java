package com.greedy.section03.api.math;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 원하는 범위의 난수 발생
		 * (int)(Math.random() * 구하려는 난수의 갯수) + 난수의 최소값*/
		
		/* 0 ~ 9까지의 난수 발생 */
		int random1 = (int) (Math.random() * 10); //인트 항변화로 뒷자리 잘라버리기 //안자르면 0~0.9999
		System.out.println("0부터 9까지의 난수 발생 : " + random1);
		
		/* 1 ~ 10까지의 난수 발생 */
		int random2 = (int) (Math.random() *10 )+ 1;
		System.out.println("1부터~ 10까지의 난수 발생 : " + random2);
		
		/* 10 ~ 15까지의 난수 발생*/
		int random3 = ((int)(Math.random()*6)+10);  //+1값을 구해야 소수점 버리고 5까지 나옴
		System.out.println("10부터 15까지의 난수 발생 : " + random3);
		
		/* -128~ 127까지의 난수 발생*/
		int random4 = (int)((Math.random()*256)-128);
		System.out.println("-128~127까지의 난수 발생 : " + random4);
		

	}

}
