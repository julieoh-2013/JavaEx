package com.javaex.basic.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		// 벡터의 선언
		Vector<Integer> v = new Vector<>();
		System.out.println("Size : "+ v.size() + ",  Capacity : "+ v.capacity());
		
		// 1부터 10까지 값을 담아봅시다
		for(int i=1; i<=10;i++) {
			// 값을 넣어 봅시다.
			v.addElement(i);
		}
			// v.addElement(Integer.valueOf(i)); // autoboxing됨
			System.out.println("Size : "+ v.size() + ",  Capacity : "+ v.capacity());
		 
			// 허용량 초과  => capacity 자동으로 증가 10->20
			v.addElement(11);
			System.out.println("Size : "+ v.size() + ",  Capacity : "+ v.capacity());
			
			// 중간에 값을 넣어봅시다. => 추가되고 나머지 하나씩 뒤로밀림
			v.insertElementAt(5, 7);
			System.out.println(v);
			
			// 객체 조회 : 특정인덱스의 객체 반환
			int val = v.elementAt(5);
			System.out.println(val);
			
			// 객체의 인덱스를 조회해 봅시다.
			System.out.println("indexOf(7) :" + v.indexOf(7));
			
			// 없는 객체의 인덱스 => -1 음수가 나옴
			System.out.println("indexOf(0) :" + v.indexOf(0));
			
			// 객체 포함 여부를 반환
			System.out.println("v.contains(10) : " + v.contains(10));
			
			// 객체를 삭제
			v.removeElementAt(10);
			System.out.println(v);
			
			// 내용을 하나씩 불러와서 출력
			for(int i=0; i < v.size() ; i++) {
				Integer item = v.elementAt(i);
				System.out.println(item);
			}
			
			// TODO: 개선해봅시다.
			
			// 버퍼를 비워봅시다.
//			v.clear();
			System.out.println(" v = : "+v);
			System.out.println("Size : "+ v.size() + ",  Capacity : "+ v.capacity());
			
			// Generic의 활용
			Vector<? super Number> v2 = new Vector<>();  // super가 number인 ?를 type값으로 주입하라
			v2.addElement(Integer.valueOf(10));
			v2.addElement(Float.valueOf(3.14159f));
//			v2.addElement(new String("Java")); //Number를 상속받지 않은 다른객체를 제한할수 있다.
			System.out.println(v2);
	
			//	Enumeration을 이용해서 항목을 차례대로 꺼낼수 있따
			Enumeration<Integer> e = v.elements();
			System.out.println("Enumeration=======");
			
			while(e.hasMoreElements()) {
				Integer item = e.nextElement();
				System.out.println(item);
			}
	}
}
