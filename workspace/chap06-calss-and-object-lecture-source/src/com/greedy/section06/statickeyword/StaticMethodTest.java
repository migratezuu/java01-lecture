package com.greedy.section06.statickeyword;

public class StaticMethodTest {

	private int count;
	
	public void nonStaticMethod() { //반드시 인스턴스 생성 후 참조연산자로 호출
		this.count++;
		
		System.out.println("nonstaticMethod 호출됨...");
	}
	
	public static void staticMethod() { //인스턴스를 생성하지 않고 호출 =>this 안돼~(this는 인스턴스 있어야 가능하거든요)
			
		//this.count++;   =>this는 static메소드에서 사용 불가
	
		System.out.println("staticMethod 호출됨...");
	} 
	
	
}
