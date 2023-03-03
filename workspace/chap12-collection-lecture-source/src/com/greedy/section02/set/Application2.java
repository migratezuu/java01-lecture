package com.greedy.section02.set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application2 {

	public static void main(String[] args) {
		
		/* LinkedHashSet 클래스
		 * HashSet이 가지고 있는 기능을 모두 가지고 있고,
		 * 추가적으로 저장 순서를 유지하는 특징을 가지고 있다.
		 * JDK 1.4부터 제공한다.
		 * */
		
		LinkedHashSet<String> Ihset = new LinkedHashSet<>();
		Ihset.add("java");
		Ihset.add("oracle");
		Ihset.add("jdbc");
		Ihset.add("html");
		Ihset.add("css");
		
		System.out.println("Ihset : " + Ihset);
		
		TreeSet<String> tset = new TreeSet<>(Ihset);  //TreeSet은 기본적으로 오름차순 정렬
		System.out.println("tset : " + tset);
		
		
		
	}

}
