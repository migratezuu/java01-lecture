package com.greedy.bankgame;

public interface MainBank {
	 //상수 (고객에게 인출해 줄 수 있는 최대 금액)
    public int MAX_INTEGER = 10000000;

    //추상메소드(인출하는 메소드) 반드시 구현한다.
    int withDraw(int amount);

    //추상메소드(입금하는 메소드) 반드시 구현한다.
    int deposit(int amount);
    //잔액조회메소드(조회하는 메소드) 반드시 구현한다.
    int getBalance();

    //defualt 메소드(고객의 휴면계좌 찾아주는 메소드 : 재구현은 선택사항)
    default String findDormancyAccount(String custId){
        System.out.println("**금융개정법안 00이후 고객의 휴면계좌 찾아주기 운동**");
        System.out.println("**금융결제원에서 제공하는 로직**");
        return "00은행 000-000-0000-00";
    }

    //JAVA8에서 가능한 정적 메소드(블록체인 인증을 요청하는 메소드)
    static void BCAuth(String bankName){
        System.out.println(bankName+" 에서 블록체인 인증을 요청합니다.");
        System.out.println("전 금융사 공통 블록체인 로직 수행");
    }

	
}
