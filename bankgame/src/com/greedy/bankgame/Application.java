package com.greedy.bankgame;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int creditLevel = 10;
	    Scanner sc = new Scanner(System.in);	
        boolean run =true;
        while(run) {
        	System.out.println("====  ATM 서비스 ==");
        	System.out.println("1.카카오뱅크");
        	System.out.println("2.토스");
        	System.out.println("3.KBANK");
        	System.out.print("은행을 선택하세요>");
          int BankNo = sc.nextInt();
        
          switch(BankNo) {
          case 1:
        	     System.out.println("카카오뱅크를 선택하셨습니다");
        	     break;
          case 2: 
        	     System.out.println("토스뱅크를 선택하셨습니다"); 
        	     break;
          case 3: 
        	     System.out.println("KBANK를 선택하셨습니다"); 
        	     break;
          case 4: System.out.println("다시선택하세요"); 
                 break;
          case 5: run=false; break;
          }
          
          // 메뉴선택
          System.out.println("메뉴를 선택하세요");
          System.out.println("1.잔액조회");
          System.out.println("2.인출");
          System.out.println("3.예금");
          System.out.println("4.종료");
          
  	      Scanner scMenu = new Scanner(System.in);	
          int selectMenu = scMenu.nextInt();
	      MainBank mainbank = new Kbank();
	      int balance;
	      
	      CreditDB creditdb= new CreditDB();
	      
	      int creditLevel = creditdb.getCreditLevel();
	      
	      
          switch(selectMenu) {
          case 1: 
        	  System.out.println("잔액조회메뉴 입니다");
        	  balance = mainbank.getBalance();
        	  System.out.println("귀하의 잔액은"+balance+"입니다");
        	  System.out.println("귀하의 신용등급은"+creditLevel+"입니다");                  
        	  break;
          case 2: // 인출 케이스
        	  System.out.println("인출메뉴 입니다");
        	  System.out.println("인출금액을 입력하세요");
        	  Scanner scWidrawAmount = new Scanner(System.in);	
        	  int widrawAmount = scWidrawAmount.nextInt();                  
        	  balance = mainbank.withDraw(widrawAmount);
        	  System.out.println(widrawAmount+"가 인출되었습니다");
        	  System.out.println("귀하의 잔액은"+balance+"입니다");
        	  System.out.println("귀하의 신용등급은"+creditLevel+"입니다");                  

        	  break;
          case 3: 
        	  System.out.println("예금메뉴 입니다");
        	  System.out.println("예금금액을 입력하세요");
        	  Scanner scDepositAmount = new Scanner(System.in);	
        	  int depositAmount = scDepositAmount.nextInt();                  
        	  balance = mainbank.deposit(depositAmount);
        	  System.out.println(depositAmount+"가 예금되었습니다");
        	  System.out.println("귀하의 잔액은"+balance+"입니다");
        	  creditLevel = creditLevel -1;
        	  System.out.println("귀하의 신용등급은 "+creditLevel+" 급입니다");        	  
        	  break;
          case 4: 
        	  run=false; break;
          default:
			  System.out.println("다시선택하세요.");
			  break;	  
          }
      }
        
        
      System.out.println("프로그램 종료 되었습니다.");
	
	}

}
