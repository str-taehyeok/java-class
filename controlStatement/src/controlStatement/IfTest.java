package controlStatement;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
//		두 수를 입력받고 if문으로 더 큰 수를 출력해보기
		
//		스캐너
		Scanner sc = new Scanner(System.in);
//		정수 변수 초기화 시킴
		int num1 = 0, num2 = 0;
		String result = null;
//		출력 메시지
		String message = "두 정수를 입력하세요" , exampleMessage = "예) 3 6";
//		메시지를 출력하고
		System.out.println(message);
		System.out.println(exampleMessage);
//		입력받을 값을 만듬
		num1=sc.nextInt();
		num2=sc.nextInt();
//		조건문을 만든다
		if(num1>num2) {
			result = "더 큰 값:" + num1;
		}else if(num1==num2) {
			result = "두 수가 같습니다.";
		}else {
			result = "더 큰 값:" + num2;
		}
		//각 행마다 조건문을 볼 수 있어서 삼항연산자보다 보기 좋음
		System.out.println(result);
		
		
		
		
	}
}
