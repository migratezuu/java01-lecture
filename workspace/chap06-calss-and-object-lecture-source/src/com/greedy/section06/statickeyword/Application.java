package com.greedy.section06.statickeyword;

public class Application {

	public static void main(String[] args) {
		
		StaticFieldTest sft1 = new StaticFieldTest();
		
		System.out.println("non-static field : " + sft1.getNonStaticCount());
		System.out.println("static field :" + sft1.getStaticCount());

		sft1.increaseNonStaticCount();
		sft1.increaseStaticCount();
		
		System.out.println("non-static field : " + sft1.getNonStaticCount());
		System.out.println("static field : " + sft1.getStaticCount());
	
		StaticFieldTest sft2 = new StaticFieldTest();
		
		System.out.println("non-static field : " + sft2.getNonStaticCount());
		System.out.println("static field : " + sft2.getStaticCount());
	
		StaticMethodTest smt = new StaticMethodTest();
		smt.nonStaticMethod();
		
		StaticMethodTest.staticMethod(); // 인스턴스 생성 안함
//		smt.staticMethod(); //인스턴스 생성 후 접근은 가능하지만 static은 원래 이걸 안쓰려고 쓰는거임 => 에러 아니고 경고 나오는 이유~
	
		
	
	}

}
