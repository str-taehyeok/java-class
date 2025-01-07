package chatTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader input = null;
		PrintWriter output =null;
		Scanner sc = null;
		String outputMessage ="";
		
		try {

			serverSocket = new ServerSocket(7777);
			System.out.println("연결 대기중...");
			
			socket = serverSocket.accept();
			System.out.println("연결 되었습니다.");
			
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String message = input.readLine();
			
			System.out.println("클라이언트에서 서버로 보내기>>" + message);
			
			output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
			sc = new Scanner(System.in);
			outputMessage = sc.nextLine();
			output.println(outputMessage);
			
			
			System.out.println("서버에서 클라이언트로 보내기>>"+outputMessage);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(serverSocket != null) {
					serverSocket.close();
				}
				if(socket != null) {
					socket.close();
				}
				if(input != null) {
					input.close();
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
