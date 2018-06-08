package com.javaex.basic.oop.point.v4;

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
		
		ColorPoint cp = new ColorPoint("red");
		cp.draw();
		
		ColorPoint cp2 = new ColorPoint(10, 10, "blue");
		cp2.draw();
		
		ColorPoint cp3 = new ColorPoint(20, 40, "yellow");
		cp3.draw();
	}
}
