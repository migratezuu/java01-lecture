package com.test.order;

public class Drink {
	
	private String name;
	private int price;
	
	public Drink(int menuNo) {
		switch(menuNo) {
			case 1 : name = "cola"; price = 100; break;
			case 2 : name = "cider"; price = 200; break;
			
		}
	}

	@Override
	public String toString() {
		return "Drink [name=" + name + ", price=" + price + "]";
	}
	
	
}
