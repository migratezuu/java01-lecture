package com.greedy.bankgame;

public interface MainBank {
	
    //(인출하는 메소드) 반드시 구현한다.
    int withDraw(int amount);
    //(입금하는 메소드) 반드시 구현한다.
    int deposit(int amount);
    //잔액조회메소드(조회하는 메소드) 반드시 구현한다.
    int getBalance();    
    
}
