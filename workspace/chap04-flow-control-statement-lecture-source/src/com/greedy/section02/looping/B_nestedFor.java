package com.greedy.section02.looping;

import java.util.Scanner;

public class B_nestedFor {


	public void printGugudanFromTwoToNine() {

		for(int dan = 2; dan < 10; dan++) { //2단부터 9단까지 단을 하나씩 추가 (구구단 한 단)
			for(int su = 1; su <= 9; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			System.out.println();
		}


	}

	//

	public void printUpgradeGugudanFromTwoToNine() {
		for(int dan = 2; dan < 10; dan++) {
			printGugudanOf(dan);
		}
	}


	public void printGugudanOf(int dan) {

		for(int su = 1; su < 10; su ++) {
			System.out.println(dan + " * " + su + " = " + (dan * su ));

		}
		System.out.println();

	}	

	public void printTime() {

		for(int hour = 0; hour < 12; hour++) {
			for(int min = 0; min < 60; min++) {
				for(int sec = 0; sec<60; sec++) {

				}
			}
		}
	}
	
	public void printStarInputRowTimes() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 행 수를 입력하세여 : ");
		int row = sc.nextInt();
		
		for(int i = 1; i <= row; i++ ) {
	//		for (int j = 1; j < 6; j++) {
	//			System.out.println("*");
	//		}
	//		System.out.println();
			printStar(5);
		}
		
	}
	
	public void printStar(int amount) {
		for (int j = 1; j <=amount; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	public void printTraiangleStar() {
		//입력받은 줄 수 만큼 * 출력
		//단, 삼각형 모양으로 출력할 것
		
	
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력하세요 : ");
		int row = sc.nextInt();
		
		for(int i = 1; i <= row; i++) { //2단부터 9단까지 단을 하나씩 추가 (구구단 한 단)
			for(int j = 1; j <= i; j++) {
				System.out.print("*" );
			}
			System.out.println();
		}
	}
		
		
		
	}
	




















