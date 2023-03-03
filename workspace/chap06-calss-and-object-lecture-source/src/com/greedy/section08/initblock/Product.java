package com.greedy.section08.initblock;

public class Product {

	private String name  = "갤럭시";  //명시적 초기값으로 덮어씀
	private int price = (int)(Math.random() * 100000);
	private static String brand = "삼성";
	

	{	//인스턴스 초기화블럭을 통해 명시적 초기값을 덮어씀
		name = "사이언";
		//price =(int)(Math.random() * 100000);
		int sum = 0;
		for(int i = 0; i < 100000; i ++) {
			sum += (int)(int)(Math.random() * 10);
		}
		price = sum;
		brand = "엘지";
		System.out.println("인스턴스 초기화 블럭 동작함...");
	}
	
	static { //정적 초기화블럭 => 프로그램이 처음 시작할 때 1회만 작동 (1등!!!!!!!)
	//	name = "아이폰";      => 초기에 작동하기 때문에 static으로 정의되지 않으면 안돼~
	//	price = 12020202020;
		brand = "애플";
		System.out.println("정적 초기화 블럭 동작함...");
	}
	
	
	public Product() {
		System.out.println("기본 생성자 호출됨...");
	}
	
	public Product(String name, int price, String brand) {
		this.name = name;
		this.price = price;
		Product.brand = brand;
		
		System.out.println("매개변수 있는 생성자 호출됨...");
	}
	
	public String getInformation() {
		return "Product [name " + this.name 
				+ ", price = " + this.price 
				+ ", brand=" + Product.brand + "]";
	}
}
