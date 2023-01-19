package com.dreedy.section03.stringbuilder;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			
			Fruit fruit = new Fruit();
		
		fruit.sayName(1);
		
		Banana banana = new Banana();
		
		banana.sayName(1);
		
		Fruit banana1 = new Banana();
		
		String result = banana1.sayName(1);
		
		System.out.println(result+":입니다");
		

	}

}


