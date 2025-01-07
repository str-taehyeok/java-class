package operExpert;

import java.util.Scanner;

public class Oper {
	public static void main(String[] args) {
//		(마스터)
//		사용자에게 값을 입력받고
//		정수라면 정수입니다를 출력
//		실수라면 실수입니다를 출력
		
//		예) 183-> 입력한 값은 정수입니다.
//		183.5->입력한 값은 실수입니다.
//		삼항 연산자를 사용!
		Scanner sc = new Scanner(System.in);
		String message = "정수 혹은 실수, 확인할 값을 입력하시오." ,
				exampleMessage = "ex) 183 183.3" ,
				intMessage = "정수입니다." ,
				doubleMessage = "실수입니다.",
				result = "";
		
		int num1= 0;
		double num2=0.0;
		
		System.out.println(message + exampleMessage);

		num2=sc.nextDouble();
		num1=(int)num2;
		result = num1==num2 ? intMessage : doubleMessage;
				
		System.out.println(result);
	}

}
