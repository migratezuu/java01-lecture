package com.greedy.section03.overriding;

public /* fianl */class SuperClass { //final을 붙이면 Sub에서 상속이 불가하다.

	public void method(int num) {}
	
	private void privateMethod() {}
	
	public final void finalMethod() {}
	
	protected void protectedMethod() {}
	
}
