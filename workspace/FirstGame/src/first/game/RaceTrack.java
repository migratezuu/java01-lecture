package first.game;

import java.util.Scanner;

public class RaceTrack {
public static void raceTrack(Total total) {
		

		int score1 = 0;
		int score2 = 0;
		int score3 = 0;
		int score4 = 0;
		int totalScore = 0;
		
		Scanner sc = new Scanner(System.in);
		
		String[] hair = {"댕기머리", "털모자", "밀짚모자", "머리띠", "헬멧"};
		String[] clothes = {"한복", "스키복", "비치웨어", "커플룩", "레이싱슈트"};
		String[] shoes = {"꽃신", "스키부츠", "쪼리", "운동화", "레이싱부츠"};
		String[] prop = {"부채", "스키장갑", "튜브", "솜사탕", "레이싱글러브"};
		
		
		System.out.println("슈의 레이싱장 데이트 의상을 뽑아주세요.");
		System.out.println("모든 선택은 '1'버튼으로 진행됩니다.");
		
		System.out.print("헤어스타일 : ");
		int no1 = sc.nextInt();
		if (no1 == 1) {
			double random =Math.random();
			int num=(int)(Math.random() * (hair.length -1));
			System.out.println("'" + hair[num] + "'이(가) 뽑혔습니다.");	
			if (num == 4) {
				score1 = 25;
			}else {
				score1 = 10;
			}
		}
		
		System.out.println("의상 :");
		int no2 = sc.nextInt();
		if (no2 == 1) {
			double random =Math.random();
			int num=(int)(Math.random() * (clothes.length -1));
			System.out.println("'" + clothes[num] + "'이(가) 뽑혔습니다.");
			if (num == 4) {
				score2 = 25;
			}else {
				score2 = 10;
			}
		}
		System.out.println("신발 : ");
		int no3 = sc.nextInt();
		if (no1 == 1) {
			double random =Math.random();
			int num=(int)(Math.random() * (shoes.length -1));
			System.out.println("'" + shoes[num] + "'이(가) 뽑혔습니다.");
			if (num == 4) {
				score3 = 25;
			}else {
				score3 = 10;
			}
		}
		System.out.println("소품 : ");
		int no4 = sc.nextInt();
		if (no4 == 1) {
			double random =Math.random();
			int num=(int)(Math.random() * (prop.length -1));
			System.out.println("'" + prop[num] + "'이(가) 뽑혔습니다.");
			if (num == 4) {
				score4 = 25;
			}else {
				score4 = 10;
			}
		}
			
		totalScore = score1 + score2 + score3 + score4;
		
		System.out.println("======================");
		System.out.println("슈의 데이트 복장 점수는 : " +  totalScore + "입니다.");
		System.out.println("슈의 데이트 결과는? : ");
		if (totalScore >= 86) {
			System.out.println("오늘 데이트는 정말 완벽했어...☆");
		}else if (totalScore >= 70 && totalScore <86 ) {
			System.out.println("오늘 예쁜데?...☆");
		}else if(totalScore >=45 && totalScore <70) {
			System.out.println("슈 여기서는 조금 안어울리는 것 같아..");
		}else {
			System.out.println("슈, 나 집갈래");
		}
		
		System.out.println("======================\r\n");
		
	}
}
