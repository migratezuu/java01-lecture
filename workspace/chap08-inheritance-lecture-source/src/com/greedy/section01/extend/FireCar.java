package com.greedy.section01.extend;

public class FireCar extends Car{

	public FireCar() {
		/* super() 부모 생성자 호출 구문 
		 * 모든 생성자 맨 첫 줄에 super()를 컴파일러가 자동 추가한다.
		 * */
		super(); //사실 컴파일러가 자동으로 추가해줌... 굳이 안써도 될듯ㅋ
		System.out.println("FireCar 클래스의 기본 생성자 호출됨...");
	}
	
	
	/* @Override 어노테이션
	 * JDK 1.5부터 추가된 문법으로 오버라이딩 성립 요건을 체크하여 성립되지 않는 경우 컴파일 에러 발생
	 * */
	
//	@Override
	public void soundHorn() {
		
		/*super. => 레퍼런스 변수
		 * 부모 인스턴스의 주소를 저장하는 레퍼런스 변수이다.
		 * this.은 자동으로 컴파일러가 추가해주지만 
		 * 명시적으로 부모가 가진 멤버에게 접근해야 하는 경우 super.을 쓴다.
		 * */
		if(super.isRunning()) {
			System.out.println("빠앙~~~~~~~~~ㅋ");
		}else {
			System.out.println("소방차가 앞으로 갈 수 없습니다...");
		}
	}//부모가 가진 메소드랑 같은 이름의 메소드 작성 가능 => 덮어씀 => 메소드 오버라이딩!!  삼각형이 오버라이딩이라는 뜻

	
	public void sprayWater() {
		System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다. ===================>");
	}
}
