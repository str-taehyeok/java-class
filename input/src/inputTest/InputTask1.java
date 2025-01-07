package inputTest;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
//	 두 정수를 입력한 뒤 덧셈 결과를 출력하시오
//		단, next()만 사용한다.
//		input과 형변환
		  
	      Scanner sc = new Scanner(System.in);
	      String exampleMessage = "ex)3 5",
	      message1 = "두 개의 정수를 입력하세요.",
	      message2 = "첫 번째 정수: ", 
	      message3 = "두 번째 정수: ",
	      format = "%d + %d = %d";
	      int num1 = 0, num2 = 0, result = 0;
	      
	      System.out.println(message1);
	      System.out.println(exampleMessage);
	      
	      num1 = Integer.parseInt(sc.next());
	      num2 = Integer.parseInt(sc.next());
	      
	      result = num1 + num2;
	      
	      System.out.printf(format, num1, num2, result);

		
		
	}


}
