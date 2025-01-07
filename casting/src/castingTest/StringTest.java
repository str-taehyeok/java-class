package castingTest;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "안", str2 = "녕";
		int number1=3;
		boolean isTrue=false;
		//문자열끼리는 연결된다.
//		정수가 문자열로 형변환
//		논리형타입이 문자열로 형변환
		
		System.out.println(str1+str2);
		str2=str1+number1;
		str2=str1+isTrue;
		System.out.println(str2);
//		111
		System.out.println("1"+(3 +8));
	}
}
