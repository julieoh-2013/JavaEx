package com.javaex.basic.collection.hash;

import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
		//	선언
		HashSet<String> hs = new HashSet<>();
		
		// 객체 추가  - 순서없이 들어감, 중복 제거
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Phthon");
		hs.add("Java");  		//중복 제거
 		
		System.out.println(hs);
		System.out.println("hs size = "+ hs.size());
		
		// 지정한 객체를 포함하고 있는가 : contains()
		System.out.println(hs.contains("C++"));
		System.out.println(hs.contains("Linux"));
		
		//	객체 삭제 
		hs.remove("C++");
		System.out.println(hs);
		
		hs.remove("C++");
	}
}
