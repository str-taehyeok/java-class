package chat01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client01 {
	public static void main(String[] args) {
		Socket socket = null;
//		PrintWriter 클래스 : 텍스트 데이터를 효율적으로 출력할 수 있게 다양한 메소드를 제공하는 클래스
		PrintWriter writer = null;
		
		Scanner sc = null;
		try {

			String serverIp = "192.168.181.14";
			String message = null;
			
			socket = new Socket(serverIp, 7000);
			System.out.println("서버와 연결이 완료되었습니다.");
			
//			서버로 데이터를 전송하기 위해 PrintWriter
			writer = new PrintWriter(socket.getOutputStream(), true);
//			전송할 메세지 작성
			sc = new Scanner(System.in);
			message = sc.nextLine();

//			서버로 메세지 전송
			writer.println(message);
			System.out.println("서버로 [" + message + "]라는 메세지를 보냈습니다.");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) {
					socket.close();
				}
				if(writer != null) {
					writer.close();
				}
				if(sc != null) {
					sc.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
	}
}
