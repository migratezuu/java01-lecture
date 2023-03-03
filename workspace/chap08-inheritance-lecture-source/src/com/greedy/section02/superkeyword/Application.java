package com.greedy.section02.superkeyword;

public class Application {

	public static void main(String[] args) {


		ProductDTO product1 = new ProductDTO();
		System.out.println(product1.getInformation());

		ProductDTO product2 = new ProductDTO("S-01234", "삼성","갤럭시폴드",2390000, new java.util.Date());
		System.out.println(product2.getInformation());


		ComputerDTO computer1 = new ComputerDTO();
		System.out.println(computer1.getInformation());

		ComputerDTO computer2 = new ComputerDTO("퀼컴 스냅드래곤", 512,12, "안드로이드");
		System.out.println(computer2.getInformation());

		ComputerDTO computer3 = new ComputerDTO("S-01234", "삼성", "갤럭시폴드",239000,new java.util.Date(),
				"퀼컴 드래곤", 512, 12, "안드로이드");
		System.out.println(computer3.getInformation());

		
		
		
	}
}
