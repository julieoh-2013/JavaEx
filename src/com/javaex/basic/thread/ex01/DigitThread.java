package com.javaex.basic.thread.ex01;

public class DigitThread extends Thread{

	@Override
	public void run() {
		// 새 쓰레드의 실행 호출
		for(int i=0; i<30; i++) {
			System.out.println("DigitThread : "+ i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}
	
}
