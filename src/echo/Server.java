package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		// Network Thread 각각의 컴퓨터에서 돌아가는 서버와 클라이언트 서버 프로그램을 만듦
		
		// IP확인법 : 명령 프롬프트에서 ipconfig
		// 172.30.1.41 10001(포트번호는 중복되지만 않으면 개발자가 정할 수 있음)
		// 집 아이피는 컴 껐다키면 바뀌는 유동아이피인 경우가 많음. 그래서 회사는 고정 아이피 사서 서버 운영함.

		// 서버 올리기
		// 서버 소켓 객체 생성
		ServerSocket serverSocket = new ServerSocket(); // 힙 영역에 올라갈 클래스

		// bind : IP와 포트번호 설정(다른 컴에 접속할 수 있는 주소체계)
		serverSocket.bind(new InetSocketAddress("172.30.1.41", 10001)); // 바인딩 후 대기중

		System.out.println("<서버 시작>");
		System.out.println("----------------");
		System.out.println("[연결을 기다리고 있습니다.]");

		// accept : 요청오면 받음
		Socket socket = serverSocket.accept();
		System.out.println("[클라이언트가 연결되었습니다.]");

		// socket <---> socket 종이컵 전화기
		// 메세지 받기용 스트림 : 로직에 영향이 없다면 비슷한 코드끼리 모아두는 게 좋음
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);

		// 메세지 보내기용 스트림
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);

		// 반복 구간
		while (true) {
			// 메세지 받기
			String msg = br.readLine();

			if (msg == null) {
				break;
			}
			System.out.println("받은메세지:" + msg);

			// 메세지 보내기
			bw.write(msg);
			bw.newLine();
			bw.flush();
		}

		bw.close();
		br.close();

		System.out.println("-------------------");
		System.out.println("<서버 종료>");

		serverSocket.close();

	}

}
