package exceptionTest;

public class ExceptionTest {
	
	public static void main(String[] args) {
		int[] arData = {10,20,30,40,50};
		try {
			System.out.println(arData[5]);
			System.out.println(arData[4]/0);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("야 index 잘못입력했어~!");
		} catch(ArithmeticException e) {
			System.out.println("0으로 값을 나눌 수 없습니다.");
		} catch(Exception e) { //-> 이건 제일 큰 부모 에러인데(업캐스팅인데) 맨 위로 올라가면 안됨
			System.out.println("알 수 없는 오류 발생!");
			e.printStackTrace();//->어떤 오류인지 알려주는 코드
		}
	
	
	}
}
