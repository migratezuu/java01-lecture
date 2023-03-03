package com.greedy.section05.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application3 {

	public static void main(String[] args) {
		
		
		/* 올 해 크리스마스는 무슨 요일일까요? */
		
		/* 2023년 12월 25일 월요일 형태로 출력 */
		
		
		Calendar gregorianCalendar = new GregorianCalendar();
		
		int year = 2023;
		int month = 11;
		int dayOfMonth = 25;
		
		Calendar ChristmasDay = new GregorianCalendar(year, month, dayOfMonth);
		
		int Year = ChristmasDay.get(1); 
		int Month =ChristmasDay.get(2);
		int DayOfMonth =ChristmasDay.get(5);
		
		String day = "";
		switch(ChristmasDay.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY :
			day = "일요일";
			break;
		case Calendar.MONDAY: 
			day = "월요일";
			break;
		case Calendar.TUESDAY:
			day ="화요일";
			break;
		case Calendar.WEDNESDAY:
			day= "수요일";
			break;
		case Calendar.THURSDAY:
			day = "목요일";
			break;
		case Calendar.FRIDAY:
			day = "금요일";
			break;
		case Calendar.SATURDAY:
			day = "토요일";
			break;

		}
		System.out.println("요일 : " + day);
		
		
	}

}
