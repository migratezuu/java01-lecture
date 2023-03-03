package first.game;

import java.util.Scanner;

public class MainView {

	public void showMainMenu() {

		Scanner sc = new Scanner(System.in);
		Total total = new Total();

		while(true) {

			System.out.println("슈의 데이트 준비\r\n" +"\n" + "슈가 원빈과 데이트를 간다!\r\n"
					+ "뭐를 입지? 뭐를 챙기지? 슈의 의상을 골라주자!\r\n"
					+ "의상은 '1'버튼과 함께 랜덤으로 골라지며 \r\n"
					+ "상황에 따른 의상에 점수가 주어진다.\r\n"
					+ "점수에 따라 데이트의 성공 등급이 주어진다\r\n"
					+ "높은 등급을 얻어보자..~^^…"
					+"\n");
			System.out.println("1. 경복궁");
			System.out.println("2. 수영장");
			System.out.println("3. 스키장");
			System.out.println("4. 놀이공원");
			System.out.println("5. 레이싱장");
			System.out.println("6. 공략 및 점수표");
			System.out.println("7. 플레이 이력");
			System.out.println("8. 플레이 종료");

			int no = sc.nextInt();

			switch(no) {
			case 1: 
				GyeongbokGung.gyeongbokGung(total);
				total.getNameList().add(new NameConcept(1));
				break;
			case 2 :
				SwimmingPool.swimmingPool(total);
				total.getNameList().add(new NameConcept(2));
				break;
			case 3 : 
				SkiResort.skiResort(total);
				total.getNameList().add(new NameConcept(3));
				break;
			case 4 :
				AmusmentPark.amusmentPart(total);
				total.getNameList().add(new NameConcept(4));
				break;
			case 5 :
				RaceTrack.raceTrack(total);
				total.getNameList().add(new NameConcept(5));
				break;
			case 6 : 
				
				break;
			case 7 : 
				System.out.println(total);
				break;
			case 8 : 
				return;
			}

		}



	}







}
