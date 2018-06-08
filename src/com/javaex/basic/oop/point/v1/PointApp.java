package com.javaex.basic.oop.point.v1;

public class PointApp {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point();
		
		p1.setX(10);
		p1.setY(7);
		p1.draw();
		
		p2.setX(22);
		p2.setY(23);
		p2.draw();
		
		
		System.out.println("점[ x ="+p1.getX()+", y="+p1.getY()+" ]를 그렸습니다.");
		System.out.println("점[ x ="+p2.getX()+", y="+p2.getY()+" ]를 그렸습니다. ");
	}

}
