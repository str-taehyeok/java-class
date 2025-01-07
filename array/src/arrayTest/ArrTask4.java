package arrayTest;

import java.util.Scanner;

public class ArrTask4 {
	public static void main(String[] args) {
//		그룹문제
//		정수를 한글로 변경하기
//		ex) 입: 1024 출:일공이사
//		힌트
//		입력받은 정수를 문자열로 변경
//		어떤 배열 하나를 선언해서 한글을 담고 있어야 출력할 수 있다.
//
		String han = "공일이삼사오육칠팔구";
		String data =" ";
		Scanner sc =new Scanner(System.in);
		String message = "입력하시오 : " , result="";
		System.out.println(message);
		data = sc.next();
		
		for(int i = 0; i <data.length(); i++) {
			result +=han.charAt(data.charAt(i)-48);
			}
			System.out.print(result);
			
//		Scanner sc = new Scanner(System.in);
//		String han="공일이삼사오육칠팔구" , input = null;
//		String message = "정수:" , result="";
//		
//		System.out.println(message);
//		input=sc.next();
//		
//		for(int i=0; i<input.length(); i++) {
//			
//			result+=han.charAt(input.charAt(i)-48);
//		}
//			System.out.println(result);
//		
	
	
	}
		
		
}

