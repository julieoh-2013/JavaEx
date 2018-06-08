package com.javaex.basic.oop.shape.v2;

public class Rectangle extends Shape implements Drawable{
	// 필드 추가
	protected int width;
	protected int height;
	
	// 생성자
	public Rectangle() {
		
	}
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double area() { //면적구하는 메소드
		return width*height;
	}
	@Override
	public void draw() {
		 System.out.printf("사각형 [x=%d, y=%d, w=%d, h=%d, ared=%f]를 그렸어요.%n", x, y, width, height, area());
	}

}
