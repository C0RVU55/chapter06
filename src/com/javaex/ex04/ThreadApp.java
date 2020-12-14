package com.javaex.ex04;

public class ThreadApp {

	public static void main(String[] args) {
		// 멀티 스레드
		// Thread 주소로 들어가면 생성자에 인터페이스 구현된 클래스의 주소가 있으니까 이걸 따라가서 해당 클래스 실행.
		// 이미지 파악하기.

		Thread th1 = new Thread(new DigitRunnableImpl());
		Thread th2 = new Thread(new LowerRunnableImpl());
		Thread th3 = new Thread(new UpperRunnableImpl());

		th1.start();
		th2.start();
		th3.start();

	}

}
