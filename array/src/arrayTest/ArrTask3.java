package arrayTest;

import java.util.Scanner;

public class ArrTask3 {
	public static void main(String[] args) {
//		사용자에게 입력받은 문자열 중 소문자는 모두 대문자로
//		대문자는 모두 소문자로 변경한다.
//		입력) 안녕hI!!
//		출력) 안녕Hi!!
		Scanner sc = new Scanner(System.in);
		String message = "문자열 입력:", input="";
		
		System.out.println(message);
		input = sc.nextLine();
		
		for(int i = 0; i<input.length(); i++) {
			char c=input.charAt(i);
			if(c>=65 && c <=90) {
				c+=(char)(c+32);
			}else if (c>=97 && c<=122) {
				c+=(char)(c-32);	
			}else {
				c+=c;
			}
		}
		
		
//		String message = "문자를 입력해주세요.";
//		String data = "안녕hI!!";
//		String input = " ";
//				
//		System.out.println(message);
//		
//		input=sc.next();
//		
//		for(int i=0; i<data.length(); i++) {
//			char c = data.charAt(i);
//			if(c>=65 && c <=90) {
//				System.out.print('i');
//			}else if (c>=97&& c<=122) {
//				System.out.print('H');
//			}else if(){
//				System.out.print("안녕");
//			}else
//		}
		
	}
}
