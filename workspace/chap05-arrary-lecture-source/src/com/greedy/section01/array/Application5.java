package com.greedy.section01.array;

import java.nio.file.spi.FileSystemProvider;

public class Application5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*랜덤한 카드 한 장을 뽑아서 출력*/
		String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
		String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9","10", "JACK", "QUEEN", "King", "ACE"};
		
		int randomShapeIndex = (int) (Math.random()* shapes.length);
		int randomCardNumberIndex = (int)(Math.random()* cardNumbers.length);
		
		System.out.println("당신이 뽑은 카드는 : " + shapes[randomShapeIndex] + " " + cardNumbers[randomCardNumberIndex] + "카드입니다.");
		
	}

	
	
}
