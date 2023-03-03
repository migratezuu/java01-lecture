package com.greedy.level02.normal;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		BookDTO book1 = new BookDTO();
		System.out.println(book1.printInformation());
		
		BookDTO book3 = new BookDTO("홍길동전", "활빈당", "허균", 5000000,0.5);
		System.out.println(book3.printInformation());
		
		BookDTO book2 = new BookDTO();
		book2.setTitle("자바의 정석");
		book2.setPublisher("도우출판");
		book2.setAuthor("남궁성");
		book2.setPrice(0);
		book2.setDiscountRate(0.0);
		System.out.println(book2.printInformation());
		
		
	}

}
