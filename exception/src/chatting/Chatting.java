package chatting;

import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = null;
		System.out.println("상대방에게 보내는 메세지:");
		message = sc.nextLine();
		System.out.println(message);
		
		if(message.contains("바보")) {
			throw new BadWordException("비속어 사용하지마라 친구야");
		}else {
			System.out.println(message);
		}
		
	}
}
