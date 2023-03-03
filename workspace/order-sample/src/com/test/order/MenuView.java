package com.test.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuView {
	
	public void showMainMenu() {

		Scanner sc = new Scanner(System.in);
		Order order = new Order();
		while(true) {
			
			System.out.println("=--  메뉴 ----=");
			System.out.println("1. drink");
			System.out.println("2. food");
			System.out.println("9. end");
			System.out.print("input : ");
			int no = sc.nextInt();
			
			switch(no) {
				case 1 : 
					drinkSubMenu(order);
					System.out.println(order);
					break;
			}
		}
		
	}
	
	private void drinkSubMenu(Order order) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("==== drink menu ====");
			System.out.println("1. cola");
			System.out.println("2. cider");
			System.out.println("9. back");
			int no = sc.nextInt();
			
			switch(no) {
				case 1 : order.getDrinkOrderList().add(new Drink(1)); break;
				case 2 : order.getDrinkOrderList().add(new Drink(2)); break;
				case 9 : return;
			}
		}
		
	}
	
}
