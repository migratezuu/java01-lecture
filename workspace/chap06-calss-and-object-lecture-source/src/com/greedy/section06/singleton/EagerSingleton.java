package com.greedy.section06.singleton;

public class EagerSingleton {

	private static EagerSingleton eager = new EagerSingleton();
	
	private EagerSingleton() {} //객체 생성 못하게
	
	public static EagerSingleton getInstance() {  //메소드로 eager만 반환
		return eager;
	}
	
}
