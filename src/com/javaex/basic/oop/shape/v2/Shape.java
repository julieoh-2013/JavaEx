package com.javaex.basic.oop.shape.v2;

public abstract class Shape {
	// 필드 
	protected int x;
	protected int y;
	
	// 생성자
	public Shape() {}
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 추상 메소드 선언
	public abstract double area();
	// public abstract void draw();  // 인터페이스로 위임
}
