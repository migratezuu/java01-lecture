package com.greedy.section06.finalkeyword;

public class FinalFieldTest {

//	private final int nonStaticNum; //0으로 초기화되면 이후 변경 불가능
	
	/* 1. 선언과 동시에 초기화 */
	private final int NON_STATIC_NUM = 1; //final 키워드 때문에 대문자로 작성한다.
	
	/* 2. 생성자를 이용해서 초기화 */
	private final String NON_STATIC_NAME;  //private 는 상수를 안쓰기도 한다...

	public FinalFieldTest(String name) {
		this.NON_STATIC_NAME = name;
	}
	
	
	/* final은 static과 조합해서 사용할 수 있다.*/
	//Static도 jvm이 정한 초기값으로 자동 초기화 되기 때문에 final 사용시 명시적으로 초기값을 작성해야한다.

	private static final int STATIC_NUM = 1; 

	/*생성자로 초기화 불가*/
	private static final double STATIC_DOUBLE;
//	
//	public FinalFieldTest(double staticDouble) {
//		FinalFieldTest.STATIC_DOUBLE = staticDouble;
//	}
	
	/*정적 초기화 블럭을 이용하는 경우는 가능*/
	static {
		STATIC_DOUBLE = 5.0;
	} 



}





