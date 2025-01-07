package chatTest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//	입력받을거 분리
//	일하는거
//	전체한테 메시지 뿌리는거
public class Server05 {
	public static void main(String[] args) throws IOException{
		
		ServerSocket serverSocket = null;
		List <PrintWriter> outputList = Collections.synchronizedList(new ArrayList<>());
		
		try {

			serverSocket = new ServerSocket(45678);
			System.out.println("서버 대기중...");
			
			ServerInputThread serverInputThread = new ServerInputThread(outputList);
			serverInputThread.start();
			
			while(true) {
				Socket clientSocket = serverSocket.accept();
				System.out.println("[접속: " + clientSocket + "]");
				ServerThread serverThread = new ServerThread(clientSocket ,outputList);
				serverThread.start();
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(serverSocket != null && serverSocket.isClosed()) {
				try {
					serverSocket.close();
					System.out.println("서버 소켓이 닫혔습니다.");
				} catch (IOException e) {
					System.out.println("서버 소켓을 닫는 중 오류");
					e.printStackTrace();
				}
			}
		}
		
		
		
	}
}


class ServerInputThread extends Thread{
	
	private final List<PrintWriter> outputList;
	public ServerInputThread(List<PrintWriter> outputList) {
		this.outputList = outputList;
	}
	
	@Override
	public void run() {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			String message= null;
			while((message = input.readLine())!=null) {
				System.out.println("서버 :" + message);
				synchronized (outputList) {
					for(PrintWriter out : outputList) {
						out.println("서버 :" + message);
					}
				}
				
				
			}
		} catch (IOException e) {
			System.out.println("서버 입력중 오류");
			e.printStackTrace();
		}
		

		
	}
	
	
	
}
class ServerThread extends Thread{
	private final Socket socket;
	private final List<PrintWriter> outputList;
	private PrintWriter output;
	private BufferedReader input;
	
	public ServerThread(Socket socket, List<PrintWriter> outputList) {
		this.socket = socket;
		this.outputList = outputList;
	
		try {

			output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			synchronized (output) {
				outputList.add(output);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			closeResources();
		}
	}
	
	@Override
	public void run() {
		
		try {
			String line = "";
			while((line = input.readLine())!= null) {
				System.out.println(line);
				
				synchronized (outputList) {
					for(PrintWriter out : outputList) {
						out.println(line);
					}
				}
				
				
			}
		} catch (IOException e) {
	        System.out.println("메세지 수신 중 오류 발생");
			e.printStackTrace();
			closeResources();
		} 
		
	}
	private void closeResources() {
	    try {
			
	    	synchronized (outputList) {
			    outputList.remove(output);
			 }

			 if(input != null) {
			    input.close();
			 }
			 
			 if(output != null) {
			    output.close();
			 }
			 
			 if(socket != null && !socket.isClosed()) {
			    socket.close();
			 }
		} catch (IOException e) {
			System.out.println("자원 해제 중 발생한 오류");
			e.printStackTrace();
		}
	}
	
	
}









