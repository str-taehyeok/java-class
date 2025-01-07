package inputTest;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "이름을 입력해주세요" , name= null 
			,	firstName = null , lastName = null;
		
		System.out.println(message);
//		lastName = sc.next();
//		firstName=sc.next();
		
		name=sc.nextLine(); 
		
		System.out.println(name + "님 환영합니다.");
		
	}
	
	
}