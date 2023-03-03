package com.greedy.section02.extend;

public class WildCardFarm {

	
	/*토끼 농장에 있는 토끼가 어떤 토끼이던 상관 없다.*/
	public void anyType(RabbitFarm<?> farm) {   //<?>생성 파라미터가 아무 타입이든 상관 없다는 뜻
		farm.getAnimal().cry();
		
	}
	/* 토끼농장의 토끼는 바니 이거나 그 후손 타입으로 만들어진 토끼농장만 매개변수로 사용 가능*/
	public void extendsType(RabbitFarm<? extends Bunny> farm) {
		
	}
	/*토끼 농장의 토끼는 Bunny이거나 그 부모 타입으로 만들어진 토끼농장만 매개변수로 사용 가능*/
	public void superType(RabbitFarm<? super Bunny> farm) {
		farm.getAnimal().cry();
	}
	
}
