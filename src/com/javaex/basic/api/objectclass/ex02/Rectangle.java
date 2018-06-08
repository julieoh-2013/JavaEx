package com.javaex.basic.api.objectclass.ex02;

public class Rectangle {
	int width;
	int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public double  area() {
		return width* height;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle r = (Rectangle)obj;
			return area() == r.width*r.height ; 
		}
		return super.equals(obj);
	}
	
	 
}
