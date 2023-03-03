package com.greedy.sction01.init;

public class Application {

	public static void main(String[] args) {

		Car car1 = new Car("페라리", 300);
		Car car2 = new Car("람보르기니", 350);
		Car car3 = new Car("롤스로이스", 250);
		Car car4 = new Car("부가티베이론", 400);
		Car car5 = new Car("포터", 500);
		
		car1.driveMaxSpeed();
		car2.driveMaxSpeed();
		car3.driveMaxSpeed();
		car4.driveMaxSpeed();
		car5.driveMaxSpeed();
		
		Car[] carArray = new Car[5];
		
		for(int i = 0; i < carArray.length; i++) {
			System.out.println("carArray[" + i + "] : " + carArray[i]);
		}
		
//		carArray[0].driveMaxSpeed(); => 컴파일 에러발생(null값을 참조하고 있기 때문에) 
		
		carArray[0] = new Car("페라리", 300);
		carArray[1] = new Car("람보르기니", 350);
		carArray[2] = new Car("롤스로이스", 250);
		carArray[3] = new Car("부가티베이론", 400);
		carArray[4] = new Car("포터", 500);
//		carArray[5] = new Car("해리포터", 1000);  => 존재히지 않는 인덱스 에러발생~
		
		//바로 위에 배열들은 앞에는 반복이 있지만 = 뒤에는 반복이 없어서 사용 불가
		
		for(int i = 0; i < carArray.length; i ++) {  //위에 drivMaxSpeed를 반복처리
			carArray[i].driveMaxSpeed();
		}
		
		//객체배열 할당과 동시에 초기화
		Car[] carArray2 = {
				new Car("페라리", 300),
				new Car("람보르기니", 350), 
				new Car("롤스로이스", 250), 
				new Car("부가티베이론", 400), 
				new Car("포터", 500)
				};
		
		//형성된 for문
		for(Car c : carArray2) {
			c.driveMaxSpeed();
		}
	}

}





