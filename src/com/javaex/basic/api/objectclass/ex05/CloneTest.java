package com.javaex.basic.api.objectclass.ex05;

public class CloneTest {

	public static void main(String[] args) {
		ScoreBoard s1 = new ScoreBoard(new int[] {10,20,30,40});
		System.out.println("s1 = "+ s1);
		
		ScoreBoard s2  = s1.getClone();
		System.out.println("s2 = "+s2);
		
		s2.getScores()[0] = 80;
		System.out.println("s1 = "+ s1);
		System.out.println("s2 = "+s2);
		
		
	}

}
