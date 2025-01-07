package chat01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server01 {
	public static void main(String[] args) {
//		소켓 선언
//		서버소켓
		ServerSocket serverSocket = null;
		
//		클라이언트 소켓
		Socket socket = null;
		
//		입력 스트림을 읽기 위한 BufferedReader
		BufferedReader reader = null;
		
		try {
			serverSocket = new ServerSocket(7000);
			System.out.println("서버가 실행되었습니다.");
			
//			accept() 클라이언트가 연결될 때까지 대기
			socket =serverSocket.accept();
//			클라이언트가 서버에 연결 요청을 보내면 받아들인다.
			System.out.println("클라이언트가 연결되었습니다.");
//			클라이언트로부터 데이터를 읽기 위해 BufferedReader를 생성한다.
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String message = reader.readLine();
			System.out.println("클라이언트의 메세지 :" + message);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(reader != null) {
					reader.close();
				}
				if(socket != null) {
					socket.close();
				}
				if(serverSocket != null) {
					serverSocket.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
	}
}
