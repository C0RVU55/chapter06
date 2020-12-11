package com.javaex.ex01;

public class ThreadApp {

	public static void main(String[] args) throws Exception { // 모든 오류
		// Thread 중간에 새로운 프로그램이 실행되면 준비되는 대로 각자 프로그램 시작.
		// 독립적인 Tread작업 해놓고 코드 짜기
		// 스레드 쓰기 : 클래스 또는 인터페이스
		
		/* Thread 클래스 예상도
		- 독립된 프로그램 실행 준비 (출장 준비)
		run(); 자식클래스에서 정의된 코드 실행
		- 독립된 프로그램 실행 마무리 (출장 마무리)
		*/
		
		// 준비
		Thread thread = new DigitThread(); // 섞어쓰기
		// thread.run(); 그냥 이렇게 하면 오버라이딩돼서 Thread가 아니라 그냥 클래스 실행하게 됨.

		// 스레드 실행 --> 출장 먼저 독립적으로 돌아가게 준비
		thread.start();


		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
			Thread.sleep(1000); //천천히 진행되게 하기 --> 숫자랑 알파벳 각자 준비되는 대로 출력됨.
		}
		// 스레드 끝

	}

}
