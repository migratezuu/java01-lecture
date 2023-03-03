package com.greedy.section02.deamon;

public class CountDown extends Thread{

	
	@Override
	public void run() {
		for(int i = 50; i >= 0; i--) {
			try {
				System.out.println(i);
				Thread.sleep(1);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
