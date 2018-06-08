package com.javaex.basic.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

class ClassRoom {
	//	필드
	private String subject;
	private String roomName;
	
	//	생성자
	public ClassRoom(String subject) {
		this.subject = subject;
	}
	public ClassRoom(String subject, String roomName) {
		this(subject);
		this.roomName = roomName;
	}
	@Override
	public int hashCode() {
		return subject.hashCode();
//		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ClassRoom) {
			return obj.hashCode() == this.hashCode();
		}
		 return super.equals(obj);
	}
	@Override
	public String toString() {
		String output = " Class( subject =" + subject
				+ ", room= "+roomName+")";
		return output;
	}
}

public class HashTableEx {
	public static void main(String[] args) {
		Map<String, ClassRoom> map = new Hashtable<>();
		
		// 맵에 데이터 넣기
		map.put("101", new ClassRoom("Java","R101"));
		map.put("201", new ClassRoom("C","R201"));
		map.put("301", new ClassRoom("Python","R301"));
		map.put("401", new ClassRoom("Linux","R401"));
//		map.put("401", new ClassRoom("Linux","R401"));
		
		System.out.println(map);  // 순서가 없다
		
		// 맵에서 데이터를 가져와 봅시다. .get() 메서드
		System.out.println(map.get("301"));
		
		// 맵의 데이터를 변경해 봅시다
		map.put("201", new ClassRoom("C#","R201"));
		System.out.println(map.get("201"));
		System.out.println(map);
		
		//	키가 있는지 확인
		System.out.println(map.containsKey("301"));
		System.out.println(map.containsKey("501"));
		
		//	subject가 Java인 ClassRoom을 받아와 보자
		System.out.println(map.containsValue("Java")); // 못가져온다. why? 문자열이 아닌 객체를 만들어 value로 넣었기 때문
		System.out.println(map.containsValue(new ClassRoom("Java")));
		
		// Iterator 가능한 부분은 keyset이라 먼저 받아와서 iterator 수행
		System.out.println("===Iterator====");
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			ClassRoom room = map.get(it.next());
			System.out.println(room);
		}
		
		// 맵을 비워봅시다
		map.clear();
		System.out.println(map);
	}
	
	
}