package com.greedy.section03.abstraction_test1;

import java.util.Scanner;

public class Slot {
	
//	Nojingu nojingu = new Nojingu();
	
	private int menuIn;
	private boolean isOn;

	public void sendMoney() {
	}

	public void menuUp(Nojingu nojingu) {

			Scanner sc = new Scanner(System.in);
		
				System.out.println("");
				System.out.println("=======자판기 메뉴=======");
				System.out.println("1. 콜라       1500원 ");
				System.out.println("2. 밀크티      2500원 ");
				System.out.println("3. 사이다      1500원 ");
				System.out.println("4. 초록매실     2000원 ");
				System.out.println("5. 초코우유     1000원 ");
				System.out.println("6. 딸기우유     1000원 ");
				System.out.println("7. 바나나우유    1500원 ");
				System.out.println("8. 포카리스웨트   3000원 ");
				System.out.println("9. 파워에이드    2500원 ");
				System.out.println("10. 자판기 종료");
				System.out.println("");
				System.out.print("메뉴 선택 : ");
				int menuIn = sc.nextInt();
				
				switch(menuIn) {
				case 1: 
					menutoNo(menuIn, nojingu);
					break;
				case 2: 
					menutoNo(menuIn, nojingu);
					break;
				case 3: 
					menutoNo(menuIn, nojingu);
					break;
				case 4: 
					menutoNo(menuIn, nojingu);
					break;
				case 5: 
					menutoNo(menuIn, nojingu);
					break;
				case 6: 
					menutoNo(menuIn, nojingu);
					break;
				case 7: 
					menutoNo(menuIn, nojingu);
					break;
				case 8: 
					menutoNo(menuIn, nojingu);
					break;
				case 9: 
					menutoNo(menuIn, nojingu);
					break;
				case 10:
					System.out.println("자판기를 종료합니다.");
					return;
					
				default : System.out.println("잘못된 번호를 선택하였습니다."); break;
				
				}
				
	}

	public void menutoNo(int menuIn, Nojingu nojingu) {
		
		int a = 1000;
		int b = 1500;
		int c = 2000;
		int d = 2500;
		int e = 3000;
		
		if(menuIn == 1) {
			System.out.println("1번 콜라를 선택하셨습니다. 가격은 " + b +"입니다.");
			nojingu.takeoffMoney();
		} else if(menuIn == 2){
			System.out.println("2번 밀크티를 선택하셨습니다. 가격은 " + d + "입니다.");
			nojingu.takeoffMoney();
		} else if(menuIn ==3){
			System.out.println("3번 사이다를 선택하셨습니다. 가격은 "+ b +"입니다.");
			nojingu.takeoffMoney();
		} else if(menuIn ==4){
			System.out.println("4번 초록매실을 선택하셨습니다. 가격은 "+ c +"입니다.");
			nojingu.takeoffMoney();
		} else if(menuIn ==5){
			System.out.println("5번 초코우유를 선택하셨습니다. 가격은 " + a + "입니다.");
			nojingu.takeoffMoney();
		} else if(menuIn ==6){
			System.out.println("6번 딸기우유를 선택하셨습니다. 가격은 " +a+ "입니다.");
			nojingu.takeoffMoney();
		} else if(menuIn ==7){
			System.out.println("7번 바나나우유를 선택하셨습니다. 가격은 "+b+ "입니다.");
			nojingu.takeoffMoney();
			
		} else if(menuIn ==8){
			System.out.println("8번 포카리스웨트를 선택하셨습니다. 가격은 "+e+ "입니다.");
			nojingu.takeoffMoney();
			
		}else if(menuIn ==9){
			System.out.println("9번 파워에이드를 선택하셨습니다. 가격은 "+ d +"입니다.");
			
		}
		
	}



}
