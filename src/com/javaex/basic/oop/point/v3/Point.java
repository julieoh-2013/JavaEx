package com.javaex.basic.oop.point.v3;

public class Point {
	// v1
	// 필드
	private int x;
	private int y;
	
	// 생성자
	public Point() {
		
	}
	public Point(int x , int y) {
		this(); // 자기 자신의 다른 생성자 호출
		this.x = x;
		this.y = y;
	}
	
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
	}
	
	// 메서드 오버로딩
	public void draw(boolean show) {
		String msg = String.format("점[x=%d, y=%d]을", x, y);
		
		System.out.println(show);
		if(show) {
			msg += "그렸습니다.";
		}else {
			msg +="지웠습니다.";
		}
		System.out.println(msg);
	}
	
}
