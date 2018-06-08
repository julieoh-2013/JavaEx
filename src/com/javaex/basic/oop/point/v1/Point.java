package com.javaex.basic.oop.point.v1;

public class Point {
	// v1
	// 필드
	private int x;
	private int y;
	
	// getters/setters
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		
		System.out.printf("점 [x=%d, y=%d ] 를 그렸습니다%n", x, y);
		
		System.out.println("점 [ x="+x+",  y="+y +" ] 를 그렸습니다");
	}
}
