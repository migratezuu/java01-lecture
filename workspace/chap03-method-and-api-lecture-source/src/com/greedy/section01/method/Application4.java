package com.greedy.section01.method;

public class Application4 {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		/*여러 개의 전달 인자를 이용한 매소드 호출 테스트*/
		Application4 app4 = new Application4(); 
		app4.testMethod("이동주", 24, '여');  //한번에 기재
//		app4.testMethod(20, "유관순", '여');   => 값의 개수는 맞지만 순서가 다르게 전달되면 호출하지 못함.
		
		String name = "유관순"; //따로 기재
		int age = 20;
		char gender = '여';
		
		app4.testMethod(name, age, gender);
		
	}
	
	/**
	 * <pre> //문서화주석은 클래스와 매소드 위에 단다.
	 * 이름과 나이와 성별을 전달 받아 한 번에 출력해주는 기능을 제공합니다.
	 * </pre>
	 * @param name 출력할 이름을 전달해주세요.
	 * @param age 출력할 나이를 전달해주세요.
	 * @param gender 출력할 성별을 전달해주세요. 성별은 변경되지 않을 것을 보장합니다.
	 * */
	public void testMethod(String name, int age, final char gender) { //final로 변수 고정
		
		System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세 이며, 성별은 " + gender + "입니다.");
	}
	
}
