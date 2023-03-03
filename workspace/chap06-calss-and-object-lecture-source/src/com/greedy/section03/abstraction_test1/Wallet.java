package com.greedy.section03.abstraction_test1;

import java.util.Scanner;

public class Wallet {

	private int money;
	int spend = 0;

	Scanner sc = new Scanner(System.in);
	
	public Wallet() {
		money = 5000;
		System.out.println("지갑 생생");
	}

	public void givejinguMoney() {

		System.out.print("지갑에서 얼마를 꺼낼까? :");
		int much = sc.nextInt();
		
		spend += much;
		money -= spend;
		
		System.out.println(money);
		
		if(money < much) {
			System.out.println("잔액 부족!!");
		} else {
			System.out.println("==============");
			System.out.println("구매가 완료되었습니다!");
			System.out.println("지갑 남은돈은 " + (money) +"입니다.");
			System.out.println("총 결제 금액은 : " + spend + "입니다."); //spand누적 안돼
		}
		
		label:
		while(true) {
			System.out.println("===================");
			System.out.println("더 이용하시겠습니까?" );
			System.out.print("더 이용하시려면 1번 아니면 2번을 입력하세요. : ");
			int more = sc.nextInt();

			switch(more) {
			case 1 : 
				break label;
			default :
				System.out.println("자판기를 종료합니다.");
				break;
			}
		}
	}
	
	public void showMoney() {
		System.out.println(this);
		System.out.println(money);
		System.out.println("현재 잔액은 : " + (money) + "입니다.");
	}
}
