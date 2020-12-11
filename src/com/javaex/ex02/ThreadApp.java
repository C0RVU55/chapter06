package com.javaex.ex02;

public class ThreadApp {

	public static void main(String[] args) {
		// Thread

		Thread th1 = new DigitThread(); //new Thread() 가 아니라 섞어쓰기 하는 거 잊지 말기
		Thread th2 = new UpperThread();
		Thread th3 = new LowerThread();
		
		th1.start();
		th2.start();
		th3.start();

	}

}
