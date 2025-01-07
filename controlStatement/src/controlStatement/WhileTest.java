package controlStatement;

import java.util.Scanner;

public class WhileTest {
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
      
//      삼항연산자, 논리연산자, nextInt()

      Scanner sc = new Scanner(System.in);
      String message = "Q. 당신이 좋아하는 색을 선택하세요.\n"
            + "1. 빨간색\n"
            + "2. 노란색\n"
            + "3. 검은색\n"
            + "4. 흰색\n"
      		+ "5. 나가기";
      String redMessage = "불같고 열정적이고 적극적이다.";
      String yellowMessage = "발랄하고 밝고 귀엽고 개성있고 착하다.";
      String blackMessage = "묵묵하고 든든하고 냉철하고 멋지다.";
      String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고  배려심이 많다.";
      String errorMessage = "다시 입력해주세요.";
      String result = null;
      int choice = 0;
      
      while(true) {
      //조건식은 boolean이 나온다.
      System.out.println(message);
      choice = sc.nextInt();
      	if(choice==5) 
      	break;
      
      switch(choice) {
      case 1:
    	  result=redMessage;
    	  break;
      case 2:
    	  result=yellowMessage;
    	  break;
      case 3:
    	  result=blackMessage;
    	  break;
      case 4:
    	  result=whiteMessage;
    	  break;
      default:
    	  result=errorMessage;
    	  break;
    		  
      		}
      
	System.out.println(result);
      	}	
	}
}