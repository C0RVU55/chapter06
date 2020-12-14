package com.javaex.ex04;

public class UpperRunnableImpl implements Runnable {
	@Override
	public void run() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			try {
				Thread.sleep(1000);
				System.out.println(ch);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
