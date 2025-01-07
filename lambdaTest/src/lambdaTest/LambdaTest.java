package lambdaTest;

//	함수형 인터페이스
//	lambda식은 메서드에서 딱 1개만 선언해서 묶어버리는 것

public class LambdaTest {
	public static void main(String[] args) {
//		LambdaInter lambda = (int num) -> {return true;};
//		System.out.println(lambda.checkEven(21));

//		중괄호로 실행 문장을 작성해서 리턴하는 방법
//		PrintName print = (String firstName,String lastName) -> {
//			String result = firstName + lastName;
//			return result;
//		};
//		
//		중괄호를 생략하는 방법, 1줄로 작성해야 한다.
//		PrintName print = (String firstName,String lastName) -> firstName + lastName;//-> 통째로가 리턴값
//		System.out.println(print.fullname("김", "태혁"));
		
//      1) 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10()
//      3) 문자열을 받으면 뒤집은 문자열로 리턴해주는 람다구현 Reverse reverseString()
//		인터페이스 만들어 놓고 받아야됨 ()와 {} 때려놓고 시작
		PrintNum prn = () -> {
//			for문으로 1~10까지 출력해주는거 만들어
			for(int i=0; i<10; i++){
				System.out.println(i+1);
			} 
		};
		Reverse reverse = (String str1) -> {
	         String result = "";
	         for(int i=0; i<str1.length(); i++) {
	        	 result += str1.charAt(str1.length()-i-1);
	         }
	         return result;
		};
		String a = reverse.reverseString("사바마라다나가");
		System.out.println(a);
		
	}
}
