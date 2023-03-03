package com.greedy.section03.filterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Application2 {

	public static void main(String[] args) {
		
		/* 형변환 보조스트림 
		 * 기본스트림이 byte 기반 스트림이고, 보조 스트림이 char기반 스트림인 경우에 사용한다.
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));         //캐릭터로 형변환해서 대입
	
		try {
			System.out.print("문자열 입력 : ");
			String value = br.readLine();
			
			System.out.println("value : " + value);
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			bw.write("java oralce jdbc");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
