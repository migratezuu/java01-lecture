package com.greedy.sction01.init;

public class Car {
	
	private String modelName;
	private int maxSpeed; //필드로 선언

	public Car(String modelName, int maxSpeed) {
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
	}
	
	
	public void driveMaxSpeed(/*String modelName, int maxSpeed*/) {  //매개변수로 선언
		
		System.out.println(modelName + "이(가) 최고시속" + maxSpeed + "km/h로 달려갑니다.");
	

	}
}



