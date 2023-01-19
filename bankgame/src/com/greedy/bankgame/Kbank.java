package com.greedy.bankgame;

public class Kbank implements MainBank {
    int balance = 10000000;// 잔액
    
	@Override
	public int withDraw(int amount) {
		// TODO Auto-generated method stub
		balance = balance - amount;		
		return balance;		
	}

	@Override
	public int deposit(int amount) {
		return balance = balance + amount;		

	}

	@Override
	public int getBalance() {
		
		return balance;
		// TODO Auto-generated method stub
		
	}

}
