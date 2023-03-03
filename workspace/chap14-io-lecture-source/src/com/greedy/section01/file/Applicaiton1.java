package com.greedy.section01.file;

import java.io.File;
import java.io.IOException;

public class Applicaiton1 {

	public static void main(String[] args) {
		
		File file = new File("src/com/greedy/section01/file/test.txt");

		try {
			boolean isCreated = file.createNewFile();
			System.out.println("isCreated : " + isCreated);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일의 크기 : " + file.length()+ "byte");
		System.out.println("파일의 상대 경로 : " + file.getPath());
		System.out.println("파일의 상위 경로 : " + file.getParent());  //부모 경로 
		System.out.println("파일의 절대 경로 : " +file.getAbsolutePath());  //c드라이브부터의 경로 위치
	
		boolean isDeleted = file.delete();
		
		System.out.println("isDeleted : " + isDeleted);
	}

}
