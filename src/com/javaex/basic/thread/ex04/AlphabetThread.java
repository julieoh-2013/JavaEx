package com.javaex.basic.thread.ex04;

public class AlphabetThread implements Runnable {

	@Override
	public void run() {
		
 
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println("AlphabetThread : "+ch);
			
			//	출력속도를 지연
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
 
	}
	
}
