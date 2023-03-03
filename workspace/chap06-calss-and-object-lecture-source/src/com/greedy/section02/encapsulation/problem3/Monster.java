package com.greedy.section02.encapsulation.problem3;

public class Monster {

	//String name;  //변수 선언
	String kinds; //kinds로 변경해도  Application 내에 메소드는 영향이 없다.
	int hp;
	
	public void setInfo(String info) { //메소드
		//this.name = info;
		this.kinds = info;
	}
	
	public void setHp(int hp) { //메소드
		if(hp >0) {
			this.hp = hp;
		}
	}
	
	public String getInfo() {
		
		return "몬스터의 이름은 " + this.kinds + "이고, 체력은 " + this.hp + "입니다."; 
	}
}

