package com.greedy.section03.abstraction_test1;

public class Nojingu {

	//Slot slot = new Slot();

	Wallet wallet = new Wallet();

	public void choicejuce(Slot slot, Nojingu nojingu) {
		//wallet.showMoney();
		slot.menuUp(nojingu);
		//takeoffMoney();
	}
	
	public void takeoffMoney() {
		wallet.givejinguMoney();
		// choicejuce(slot);
	}
	
	public void showWallet() {
		wallet.showMoney();
	}

} 
