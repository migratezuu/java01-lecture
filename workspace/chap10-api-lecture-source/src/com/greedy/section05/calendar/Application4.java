package com.greedy.section05.calendar;

public class Application4 {

	public static void main(String[] args) {
	
		
		/* 0년 1월 1일부터 오늘까지 몇 일이나 지났을까요? */
		/* 단, 중간에 윤년을 고려해야 함  (738907일)*/
	
	java.util.Date today = new java.util.Date();
	System.out.println(today);

	System.out.println(today.getTime());
	}

}
