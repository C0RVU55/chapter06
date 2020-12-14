package com.javaex.ex03;

public class ThreadApp {

	public static void main(String[] args) throws Exception {
		// Thread(인터페이스)

		// Thread thread = new Thread(); 인터페이스라서 오버라이딩이 안 되니까 Thread 올려봤자 원하는 메소드 못 씀.
		// 생성자에 클래스 주소를 넣어서 접근함. 변수 선언해서 (인터페이스 구현한)클래스 올리고 그 변수를 생성자에 넣는 거랑 같은 거.
		// 아마 Thread 클래스의 생성자가 (Runnable runnable){this.runnable=runnable}일 거라 추측 가능.
		Thread thread = new Thread(new DigitRunnableImpl());
		thread.start();

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}

	}

}
