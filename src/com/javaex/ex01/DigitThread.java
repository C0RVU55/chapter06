package com.javaex.ex01;

public class DigitThread extends Thread { // Thread와 상속시킴

	// 필드

	// 생성자

	// 메소드 겟셋

	// 메소드 일반
	@Override
	public void run() { // 부모쪽 run을 써서 아래 코드가 독립적으로 돌아가게 만듦. 어떻게 마무리할지도 정해야 됨.
		for (int cnt = 0; cnt < 10; cnt++) {
			System.out.print(cnt);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace(); // 일단 예외처리한 거
			}
		}
	}
}
