package com.greedy.section01.extend;

public class RacingCar extends Car{
	
	public RacingCar() {
		System.out.println("RacingCar 클래스의 기본생성자 호출됨...");
		
	}
	
	@Override
	public void run() {
		
		
		
		System.out.println("레이싱카가 전속력으로 질주합니다!!");
	}

	@Override
	public void soundHorn() {} // 아무것도 안써도 이걸써야 안울려,.,,,빼앵....
	
	@Override
	public void stop() {
		System.out.println("레이싱카가 멈춥니다!!");
		
	}
	
	
}
