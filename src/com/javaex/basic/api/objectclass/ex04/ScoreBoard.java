package com.javaex.basic.api.objectclass.ex04;

public class ScoreBoard implements Cloneable{
	private int scores[];//reference 변수를 담는 멤버변수 갖는 객체의 경우 clone()을 오버라이드 안하면 얕은 카피 됨.
	
	// 생성자
	public ScoreBoard(int[] scores) {
		this.scores = scores;
	}

	public ScoreBoard getClone() {
	 ScoreBoard clone = null;
		 try {
			clone = (ScoreBoard)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		 return clone;
	}
	
	@Override
	public String toString() {
		String output = "ScoreBoard(";
		
		for (int i = 0; i < scores.length; i++) {
			output += scores[i];
			if(i < scores.length-1) { // 마지막에 콤마 안넣으려는 코드 0,0,0,0, -> 0,0,0,0
				output+=",";
			}
		}
		output +=")";
		return output;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
}
