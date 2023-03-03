package com.test.order;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	
	private List<Drink> drinkOrderList;
	private List<Food> foodList;
	
	public Order() {
		drinkOrderList = new ArrayList<>();
		foodList = new ArrayList<>();
	}

	public List<Drink> getDrinkOrderList() {
		return drinkOrderList;
	}

	@Override
	public String toString() {
		return "Order [drinkOrderList=" + drinkOrderList + ", foodList=" + foodList + "]";
	}
	
	
}
