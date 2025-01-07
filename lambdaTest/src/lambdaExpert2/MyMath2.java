package lambdaExpert2;

import java.util.Scanner;

//[심화 실습]
//여러 개의 정수를 입력받아서 알맞은 덧셈, 뺄셈 결과를 확인하는 애플리케이션 제작
//
//입력 예1) 7 + 35 - 9
//출력 예1) 33
//
//입력 예2) -9 + 8 + 10
//출력 예2) 9
//
//* "ABC".split("")은 [A][B][C] 3칸 문자열 배열로 리턴된다.
// "A,B,C".split(",")은 [A][B][C] 3칸 문자열 배열로 리턴된다.
// split("구분점")을 전달하면 문자열에서 동일한 구분점을 기준으로 문자열 값을 잘라낸 후 문자열 배열로 리턴한다.
// 구분점을 여러 개 사용할 때에는 split("구분점|구분점")으로 사용하며, "+", "-"를 구분점으로 사용할 때에는 "\\+", "\\-"로 표현한다.
// 예)"4 + 9".split("\\+")은 [4][9] 2칸 문자열 배열로 리턴
//
//* 사용자가 정상적으로만 입력한다는 가정 하에 구현하도록 한다.
//* 두 정수를 전달받은 후 int로 리턴하는 calc 추상메소드 선언(함수형 인터페이스 제작)
//* 두 정수의 덧셈, 뺄셈을 구해주는 함수형 인터페이스를 리턴하는 static 메소드 선언(람다식 리턴)
//* 전체 식을 전달받은 후 String[]로 리턴하는 getOpers 추상메소드 선언(함수형 인터페이스 제작)
//* main메소드에 getOpers를 람다식으로 구현
//* 첫번째 정수가 음수일 경우 오류 해결


public interface MyMath2 {
//  연산자 1개를 전달 받아서 알맞게 연산하도록 람다식 구현
//	+,-,*,/,% 5개 중 하나인데 값이 정해져 있으니 switch 문 구함
	public static Calc2 calculator(String oper) {
	      Calc2 calc2 = null;
//	      Calc2 에서 num1과 num2에 숫자 받아 놓은 것을 각각의 연산자 경우에 맞춘 수식을 넣어준다.
//	      이 때 calc 에는 더하고 빼고 등등의 값이 담기게 됨
	      switch(oper) {
	      case "+":
	    	  calc2 = (num1 , num2) -> num1 + num2;
	    	  break;
	      case "-": 
	    	  calc2 = (num1 , num2) -> num1 - num2;
	    	  break;
	      case "*":
	    	  calc2 = (num1 , num2) -> num1 * num2;
	    	  break;
	      case "/":  
	    	  calc2 = (num1 , num2) -> num1 / num2;
	    	  break;
	      case "%":	    	  
	    	  calc2 = (num1 , num2) -> num1 % num2;
	    	  break;
	      }
	      return calc2;
	}
	
	
	
	public static void main(String[] args) {
	//   사용자가 수식 입력 
	//   전체 수식에서 연산자만 분리하는 메소드 구현
//		OperCheck2의 interface에 있는 메소드를 람다로 들고옴 , 이 때 expression은 입력 받을 수식을 넣음
		OperCheck2 operCheck2 = expression -> {
//			결과값을 넣을 변수 하나 선언
			String temp ="";
//			for문으로 expression 길이 만큼 반복하는데 + , - 때마다 출력하고 (걸러야 하니까) 공백문자는 쪼개버림
			for(int i=0; i<expression.length();i++) {
				char c = expression.charAt(i);
				if(c=='+'|| c=='-') {
					temp += c;
				}
			}
			return temp.split("");
		};
		
		Scanner sc = new Scanner(System.in);
		String message = "정수의 덧셈, 뺄셈을 구하는 식을 입력하세요", exampleMessage = "ex)3+1-2";
//		사용자가 입력할 수식 받을 변수 선언
		String input2 = null;
//		사용자가 String으로 입력한 정수들을 정수와 연산자를 구분할 배열을 선언
		String[] numbers = null, opers = null;
		int number1 = 0, number2 = 0;
		
		System.out.println(message);
		System.out.println(exampleMessage);
		
		input2 = sc.nextLine();//->입력할 수 있게 만들어주고 공백문자를 바꿀 수 있게 replace 넣음
		
		input2 = input2.replaceAll(" ", ""); // 공백문자를 없애서 붙일 수 있게 함
		System.out.println(input2); // 뭘 썼는지까지 설명함 
		
		numbers = input2.split("\\+|\\-"); //-> 사용자가 입력한 것중에 연산자 쪼개서 빼버림 <절대로 때면 안됨, 공백문자로 인식됨>
		opers = operCheck2.getOper(input2); //-> 사용자가 입력한 식에서 연산자를 구함
		
		number1 = Integer.parseInt(numbers[0].equals("")? opers[0] + numbers[1] : numbers[0]);//->첫번째 열이 -일 때를 구하기 위함
		for(int i = 0; i < opers.length; i++) {
			if(i == 0 && number1 < 0) {continue;};//-> 첫번째가 음수일 때 그냥 반복돌음
			number2 = Integer.parseInt(numbers[i+1]);
			number1 = MyMath2.calculator(opers[i]).calc2(number1, number2); //MyMath에 있는 람다를 가져와서 opers의 첫번째가 +,-인지
		}
		System.out.println(number1);
		
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	