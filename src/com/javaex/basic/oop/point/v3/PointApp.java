package com.javaex.basic.oop.point.v3;

public class PointApp {

	public static void main(String[] args) {
//		Point p1 = new Point();
		Point p1 = new Point(23,12);
//		Point p2 = new Point();
		Point p2 = new Point(33,22);
		
//		p1.setX(10);
//		p1.setY(7);
		p1.draw();
		
//		p2.setX(22);
//		p2.setY(23);
		p2.draw();
		
		p2.draw(true);
		p2.draw(false);
	}

}
