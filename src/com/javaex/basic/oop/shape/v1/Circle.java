package com.javaex.basic.oop.shape.v1;

public class Circle extends Shape{
	
	// 필드 선언
	protected double radius;  // 반지름
	
	// 생성자
	public Circle() {}
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	 
	@Override
	public double area() { //파이*반지름 제곱
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}

	@Override
	public void draw() {
		 System.out.printf("원 [x=%d, y=%d, r=%f, area=%f]를 그렸어요%n", x, y, radius, area());
	}

}
