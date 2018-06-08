package com.javaex.basic.oop.casting;

public class Animal {
	protected String name; // 상속객체들이 접근가능
	
//	public Animal() {		
//	}
	// 생성자
	public Animal(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println(name+"is eating.");
	}
	
	public void walk() {
		System.out.println(name +"is walking.");
	}
}
