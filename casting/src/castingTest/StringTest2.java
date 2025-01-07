package castingTest;

public class StringTest2 {
	public static void main(String[] args) {
		
		boolean isTrue=false;
		double data1 = 0.0;
		
//		문자열을 다른 타입으로 변경
//		String은 클래스, 기본 자료형과 격이 달라서 변경할 수 없다.
//		System.out.println((int)"1");는 사용할 수 없다.
		System.out.println(Integer.parseInt("1")+(3+8));
		
//		논리형 타입과 실수형 타입의 엄마를 불러와야 string으로 변경가능
		isTrue=Boolean.parseBoolean("true");
		data1=Double.parseDouble("10.25");
		System.out.println(isTrue);
		System.out.println(data1);
		
	}
}
