package com.javaex.basic.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
//		List<String> l = new LinkedList<>();  // 둘다 교체 사용가능
		
		//	객체추가
		l.add("Java");
		l.add("C");
		l.add("C++");
		l.add("Python");
		
		//	객체의 삽입
		l.add(2,"C#");
		
		// List는 중복을 허용하므로
		l.add("Java");
		System.out.println(l);
		System.out.println("총 객체수 :"+ l.size());
		
		//	객체의 삭제
		l.remove(2);
		l.remove("Python");
		System.out.println(l);
		System.out.println("총 객체수 :"+ l.size());
		
		// Iterator의 사용
		System.out.println("===Iterator====");
		Iterator<String> it = l.iterator();
		while(it.hasNext()){
			String item = it.next();
			System.out.println(item);
		}
		
		//	비워봅시다
		l.clear();
		System.out.println(l);
		System.out.println("총 객체수 :"+ l.size());
	}
}
