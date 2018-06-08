package com.javaex.basic.api.objectclass.ex03;

public class Point implements Cloneable{
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
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

	@Override
	public String toString() {
		return "Point("+x+","+y+")";
	}

	@Override
	public boolean equals(Object obj) {
		 if(obj instanceof Point) { //다운케스팅 시켜야함
			 Point other = (Point)obj;
			 return  x == other.x &&  y == other.y;
		 }
		return super.equals(obj);
	}
	
	public Point getClone()   {
		Point clone = null;
		
		try {
			clone = (Point)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

	
}
