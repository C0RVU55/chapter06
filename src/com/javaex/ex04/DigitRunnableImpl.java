package com.javaex.ex04;

public class DigitRunnableImpl implements Runnable {

	@Override
	public void run() {
		for (int cnt = 0; cnt < 10; cnt++) {
			try {
				Thread.sleep(1000);
				System.out.println(cnt);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
