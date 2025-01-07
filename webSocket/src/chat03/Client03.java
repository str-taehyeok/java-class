package chat03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client03 {
   public static void main(String[] args) {

      String name = "taehyeok";
      String ip = "localhost";
      Socket socket = null;      
      PrintWriter output = null;
      BufferedReader input = null, keyInput = null;
      
      try {
         socket = new Socket(ip, 9999);
         output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
         input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//         사용자가 키보드 입력 값을 읽는다.
         keyInput = new BufferedReader(new InputStreamReader(System.in));
         
         System.out.println("서버와 연결이 되었습니다.");
         
//         서버로부터 메세지를 처리하는 스레드 시작
         ClientThread clientThread = new ClientThread(input);
         clientThread.start();

//         사용자의 입력을 서버로 전송하는 스레드
         String line = "";
         while((line = keyInput.readLine()) != null) {
            output.println(name + ": " + line);
         }
         
      } catch (UnknownHostException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }       
   }
}

// 서버로부터 메세지를 처리하는 스레드
class ClientThread extends Thread {
   
   private BufferedReader input;
   
   public ClientThread(BufferedReader input) {
      this.input = input;
   }
   
   @Override
   public void run() {
      String line = "";
      try {
         while((line = input.readLine()) != null) {
            System.out.println(line);
         }
      } catch (IOException e) {
         System.out.println("서버로부터 메세지 수신중 오류");
      } finally {
         try {
            if(input != null) {
               input.close();
            }
         } catch (IOException e) {
            System.out.println("입력 스트림 닫는 중 생긴 오류");
         }
      }
   }
   
}



