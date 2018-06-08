package com.javaex.basic.api.objectclass.ex05;

import java.util.Arrays;

public class ScoreBoard implements Cloneable{
	private int scores[];
	
	// 생성자
	public ScoreBoard(int[] scores) {
		this.scores = scores;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 얕은 복제 시도
		ScoreBoard clone = (ScoreBoard)super.clone();
	
		// 내부 참조 객체 복제 시도
	 	clone.scores = Arrays.copyOf(scores, scores.length);
		
		//return super.clone();
		return clone;
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
