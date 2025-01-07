package chatTest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client05 {
	public static void main(String[] args) {
		String name = "taehyoek";
		String ip = "localhost";
		Socket socket = null;
		PrintWriter output = null;
		BufferedReader input = null, keyInput = null;
		
		try {
		
			socket = new Socket(ip,45678);
			output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			keyInput = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("서버와 연결됐당");
		
			ClientThread clientThread = new ClientThread(input);
			clientThread.start();
			String line = "";
			
			while((line = keyInput.readLine()) != null) {
				System.out.println(name + ":" + line);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
class ClientThread extends Thread{
	
	private BufferedReader input;

	public ClientThread(BufferedReader input) {
		this.input = input;
	}
	
	@Override
	public void run() {
		String line = "";
		try {
			while((line = input.readLine())!=null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("서버로부터 메세지 수신중 오류");
			e.printStackTrace();
		} finally {
			try {
				if(input != null) {
					input.close();
				}
			} catch (IOException e) {
				 System.out.println("입력 스트림 닫는 중 생긴 오류");
				e.printStackTrace();
			}
		}
	}
}


