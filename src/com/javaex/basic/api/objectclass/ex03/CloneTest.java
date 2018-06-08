package com.javaex.basic.api.objectclass.ex03;

public class CloneTest {

	public static void main(String[] args) {
		 	Point p = new Point(11, 11);
		 	System.out.println("p : " +p);
		 	
		 	Point p2 = p.getClone();
		 	//Point p2=p;
		 	System.out.println("p2 : "+ p2);
		 	
		 	p2.setX(222);
		 	p2.setY(444);
		 	
		 	System.out.println("p : " +p);
		 	System.out.println("p2 : "+ p2);
	}

}
