package com.javaex.basic.oop.staticmember;

public class StaticExApp {
	public static void main(String[] args) {
		StaticEx s1 = new StaticEx();
		System.out.println("RefCount : "+ StaticEx.refCount);
		
		StaticEx s2 = new StaticEx();
		System.out.println("RefCount : "+ StaticEx.refCount);
		
		s1 = null;// 사용 해제
		System.out.println("s1 사용해제");
		System.out.println("RefCount : "+ StaticEx.refCount);
		
		System.gc(); // 우선순위올라갈 뿐 바로 해제는 안됨.
		try {
			Thread.sleep(3000);
			System.out.println("RefCount : "+ StaticEx.refCount);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
