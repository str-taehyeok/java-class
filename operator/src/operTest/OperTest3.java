package operTest;

import java.util.Scanner;

public class OperTest3 {
	public static void main(String[] args) {
//      심리테스트(브론즈), 번호로 입력 받기
//      Q. 당신이 좋아하는 색을 선택하세요.
//      1. 빨간색
//      2. 노란색
//      3. 검은색
//      4. 흰색
//      
//      빨간색 : 불같고 열정적이고 적극적이다.
//      노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
//      검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
//      흰색 : 천사같고 깔끔하고 정리를 좋아하고  배려심이 많다.
		
// 삼항 연산자, 논리연산자, nextInt()
		
//		int num1 = 0, num2 = 0 , num3 =0, num4= 0;
//		String message = "Q. 당신이 좋아하는 색을 선택하세요.\n1.빨간색\n2.노란색\n3.검은색\n4.흰색" , 
//		result = num1 && num2 ? "빨간색" + "불같고 열정적이고 적극적이다."
//				: num2<num3 ? "노란색" + "발랄하고 밝고 귀엽고 개성있고 착하다."
//						: num3<num4 ? "검은색"+ "묵묵하고 든든하고 냉철하고 멋지다."
//						: "흰색" +"천사같고 깔끔하고 정리를 좋아하고  배려심이 많다.";
//		System.out.println(message);
//
//		Scanner sc = new Scanner(System.in);
//		
//		num1=sc.nextInt();
//		num2=sc.nextInt();
//		num3=sc.nextInt();
//		num4=sc.nextInt();
//	
//		
//		System.out.println(result);
		Scanner sc = new Scanner(System.in);
		String message = "Q. 당신이 좋아하는 색을 선택하세요.\n1.빨간색\n2.노란색\n3.검은색\n4.흰색";
		String redMessage = "불 같고 열정적이고 적극적이다.";
		String yellowMessage = "발랄하고 밝고 귀엽고 개성있고 착하다.";
		String blackMessage = "묵묵하고 든든하고 냉철하고 멋지다.";
		String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		String errorMessage = "다시 입력해주세요";
		
		
		System.out.println(message);
		int choice = 0;
		choice = sc.nextInt();		

		String result = choice==1 ? redMessage 
				: choice==2 ? yellowMessage 
						: choice==3 ? blackMessage 
								: choice ==4 ? whiteMessage : errorMessage;
		
		
		
		System.out.println(result);
		
		
		
		
}
}
