package com.greedy.section03.overriding;

public class SubClass extends SuperClass{

	@Override
	public void method(int num) {} //매개변수의 이름은 달라져도 되지만 다른건 다 바뀌면 안돼!
	
	
	/* private method는 오버라이딩이 불가하다. */
//	@Override
//	private void privateMethod() {} 
	
	/* final 메소드 오버라이딩 불가*/
//	@Override
//	public final void finalMethod() {}
	
	
	/* 부모 메소드의 접근제한자 범위와 같거나 더 넓은 범위로 오버라이딩 가능*/
//	@Override
//	void protectedMethod() {}					//불가능

//	@Override
//	protected void protectedMethod() {}			//가능
	
	@Override
	public void protectedMethod() {}			//가능
}
