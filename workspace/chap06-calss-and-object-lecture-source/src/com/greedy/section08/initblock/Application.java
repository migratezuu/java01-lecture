package com.greedy.section08.initblock;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 초기화 블럭
		 * 복잡한 초기화를 수행할 수 있는 블럭을 제공하며, 인스턴스 초기화 블럭과 정적 초기화 블럭으로 구분된다.
		 * 1. 인스턴스 초기화 블럭
		 *  : 인스턴스가 생성되는 시점에 생성자 호출 이전에 먼저 실행이 된다.
		 *    인스턴스가 생성하는 시점마다 호출이된다.
		 *    인스턴스 변수를 초기화하며 정적 필드에는 실행시점마다 값을 덮어쓴다.
		 *  {
		 *  	초기화 내용 작성
		 *  }
		 *  
		 *  2. 정적 초기화 블럭
		 *   : 클래스가 로드될 때 한 번 동작한다.
		 *     정적 필드를 초기화하며, 인스턴스 변수는 초기화되지 못한다.
		 *   static {
		 *   	초기화 내용 작성
		 *   }
		 *  */
		
		Product product = new Product();
		System.out.println(product.getInformation());
		
		
		Product product2 = new Product("중국폰", 300000, "샤오미");
		System.out.println(product2.getInformation());
		
		
		
	}

}
