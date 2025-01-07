package inputTest;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
		
//		3개의 정수를 한 번에 입력받은 후
//		세 정수의 곱셈을 출력
//		next()
//		25분
		Scanner sc = new Scanner(System.in);
		String examplemessage = "ex) 3 5 6" ,
		message1 = "세 개의 정수를 입력하세요",
		message2 = "첫 번째 정수:",
		message3 = "두 번째 정수:",
		message4 = "세 번째 정수:",
		format = "%d * %d * %d = %d";
		
		int num1=0, num2=0, num3=0 , result=0;
		System.out.println(message1);
		System.out.println(examplemessage);
		
		num1=Integer.parseInt(sc.next());
		num2=Integer.parseInt(sc.next());
		num3=Integer.parseInt(sc.next());
		
		result = num1 * num2 * num3;
		
		System.out.printf(format,num1,num2,num3,result);
		
	}
}
