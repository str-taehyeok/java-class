package chatTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Socket clientSocket = null;
		PrintWriter output = null;
		Scanner sc = null;
		BufferedReader input = null;
		
		try {
		
			String ip = "192.168.181.14";
			String message = "";
			clientSocket = new Socket(ip,7777);
			System.out.println("연결 되었습니다.");
			
			output = new PrintWriter(clientSocket.getOutputStream(),true);
			
			sc = new Scanner(System.in);
			message = sc.nextLine();
			
			output.println(message);
			System.out.println("클라이언트에서 서버로 보내기>>"+message);
			
			input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			String inputMessage = input.readLine();
			System.out.println("서버에서 클라이언트로 보내기>>"+inputMessage);
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(clientSocket != null) {
					clientSocket.close();
				}
				if(output != null) {
					output.close();
				}
				if(sc != null) {
					sc.close();
				}
				if(input != null) {
					input.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
