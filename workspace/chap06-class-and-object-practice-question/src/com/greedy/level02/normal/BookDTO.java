package com.greedy.level02.normal;

public class BookDTO {
	
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountrate;
	
	public BookDTO() {}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void  setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDiscountRate(double discountrate) {
		this.discountrate = discountrate;
	}

	

	public String getTitle() {
		return title;
	}
	public String getPublisher() {
		return publisher;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public double getDiscountRate() {
		return discountrate;
	}
	
	
	public BookDTO(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountrate = discountrate;
		
	}
	
	public BookDTO(String title, String publisher, String author, int price, double discountrate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountrate = discountrate;
		
	}
	
	
	
	public String printInformation() {
		return  this.title +" "
				+ this.publisher +" "
				+this.author +" "
				+ this.price+ " "
				+ this.discountrate;
	}


	
	
	

}
