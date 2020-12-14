package com.javaex.ex03;

public class DigitRunnableImpl implements Runnable {

	// Thread(Interface) : 인터페이스는 -able로 끝나는 경우가 많아서 작명에 유의. -able의 구현체.
	// 자바는 상속을 하나만 받을 수 있어서 이미 상속 받은 클래스가 있을 때 인터페이스 Thread 사용.
	// Runnable에 run()이 있는데 처음에는 DigitRunnable에 아무것도 없어서 오류남 --> 부모 메소드 오버라이드 하기

	@Override
	public void run() {
		for (int cnt = 0; cnt < 10; cnt++) {
			try {
				System.out.println(cnt);
				Thread.sleep(1000);
			} catch (InterruptedException e) { // thread가 중단되었을 때 발생하는 예외
				e.printStackTrace();
			}

		}

	}
}
