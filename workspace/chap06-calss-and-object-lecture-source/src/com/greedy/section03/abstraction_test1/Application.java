package com.greedy.section03.abstraction_test1;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {


		Nojingu nojingu = new Nojingu();
		Slot slot = new Slot();
//		Wallet wallet = new Wallet();
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("");
			System.out.println("자판기를 이용하시겠습니다? ");
			System.out.println("=================");
			System.out.println("1. 메뉴 확인하기");
			System.out.println("2. 지갑 확인하기");
			System.out.println("3. 자판기 종료하기");
			System.out.print("메뉴 선택 : ");
			int ok = sc.nextInt();
			
			switch(ok) {
			case 1 : 
				nojingu.choicejuce(slot, nojingu);
				break;
				
			case 2 :
				nojingu.showWallet();
				break;
			default : 
				System.out.println("자판기를 종료합니다.");
				return;
			}
		}
	}
}
