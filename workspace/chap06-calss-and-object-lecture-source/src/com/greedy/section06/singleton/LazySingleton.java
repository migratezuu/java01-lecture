package com.greedy.section06.singleton;

public class LazySingleton {

	private static LazySingleton lazy;  //lazy라는 공간만 만든 상태
	
	private LazySingleton() {}

	public static LazySingleton getInstance() {
		
		if(lazy == null) {
			lazy = new LazySingleton(); // 인스턴스 생성
		}
		
		return lazy; //이미 만들어진 lazy만 반환
	
	
	}
	
	
}
