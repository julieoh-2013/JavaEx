package com.javaex.basic.thread.ex04;

public class MainThread {
	public static void main(String[] args) {
		// 쓰레드를 불러와 실행
//		Thread thread = new DigitThread();
		Thread thread = new Thread(new DigitThread());
		Thread thread2 = new Thread(new AlphabetThread());
		
		// 첫번째 쓰레드에 우선순위 부여 1~10  중간 5 최대 10 낮은 1 -> thread에 상수로 정의되어 있다
		// 자원이 많을때는 큰차이 없다.
		thread.setPriority(Thread.MAX_PRIORITY); //10
		thread2.setPriority(Thread.MIN_PRIORITY); //1
		
		// 쓰레드의 실행
		thread.start();;
		thread2.start();
		
		// Thread와 thread2를 메인쓰레드의 흐름에 합류
		try {
			thread.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인 쓰레드 종료!");
	}
}
