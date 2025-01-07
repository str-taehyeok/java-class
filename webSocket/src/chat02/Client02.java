package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client02 {
	public static void main(String[] args) throws IOException{
		Socket clientSocket = null;
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		Scanner sc = null;
		
		try {
//			클라이언트 소켓 생성, 서버에 접속
			clientSocket = new Socket("localhost", 11011); //-> 내가 접속한 주소 localhost
			
//			네트워크 입출력 스트림 생성
			bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
			String inMessage = "";
			sc = new Scanner(System.in);
			
//			while 데이터 송신
			while(true) {
				
				System.out.println("서버에 보낼 메세지");
				String outMessage = sc.nextLine();
				
				bufferedWriter.write(outMessage+"\n");
				bufferedWriter.flush();
				
//				데이터 수신
				inMessage = bufferedReader.readLine();
				System.out.println("서버로부터 읽어온 메세지\n" + inMessage);
				
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
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
	             if(clientSocket != null) {
	                clientSocket.close();
	             }
	          } catch (IOException e) {
	             e.printStackTrace();
	          }
	       }
	     
		
		
		
	}
}