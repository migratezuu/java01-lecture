package com.greedy.section01.method;

public class Calculator {

	public int minNumberOf(int first, int second) {
		
		return (first > second)? second : first; //first가 크면 second 반환 아니면 first 반환 
	}
	
	public static int maxNumberOf(int first, int second) {
		return ( first > second)? first : second;
	}
}
