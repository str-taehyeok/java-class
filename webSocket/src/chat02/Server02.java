package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server02 {
	public static void main(String[] args) throws IOException{
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		Scanner sc = null;
		
//		서버소켓 생성
		try {
			serverSocket = new ServerSocket(11011);

			System.out.println("연결 대기중...");
			socket = serverSocket.accept();
			System.out.println("클라이언트와 연결 되었습니다.");
			
//		네트워크 입출력 스트림
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			sc = new Scanner(System.in);
			
			while(true) {
//			클라이언트로부터 데이터 수신(클라이언트 -> 서버)
				String inputMessage = bufferedReader.readLine();
				System.out.println("클라이언트 메세지 :" + inputMessage);
			
				System.out.println("클라이언트에게 보낼 메세지를 작성하세요.");
				String outputMessage = sc.nextLine();
				bufferedWriter.write(outputMessage + "\n");
				bufferedWriter.flush();
				
				System.out.println("서버메시지 :"+ outputMessage);
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(sc != null) {
					sc.close();
				}
				if(bufferedReader != null) {
					bufferedReader.close();
				}
				if(bufferedWriter != null) {
					bufferedWriter.close();
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
