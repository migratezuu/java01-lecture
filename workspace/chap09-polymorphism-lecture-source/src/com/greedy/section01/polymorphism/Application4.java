package com.greedy.section01.polymorphism;

public class Application4 {

	public static void main(String[] args) {

		Application4 app4 = new Application4();
		Animal randomAnimal = app4.getRandomAnimal();
		randomAnimal.cry();

	}


	public Animal getRandomAnimal() { //리턴타입에도 다형성 적용 가능함

		int random = (int)(Math.random() * 2);

		return random == 0? new Rabbit() : new Tiger();

	}

}
