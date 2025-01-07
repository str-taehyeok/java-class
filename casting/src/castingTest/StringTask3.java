package castingTest;

public class StringTask3 {
	public static void main(String[] args) {
//		"12.123"
//		"345.789"
//		"6789.456"
//		3개 값을 더해서 123456789를 출력

		
		int num1=0 , num2=0 , num3=0;
		String str1="12.123" , str2="345.789" , str3="6789.456";
		
		num1=(int)Double.parseDouble(str1);
		num2=(int)Double.parseDouble(str2);
		num3=(int)Double.parseDouble(str3);
		
		System.out.println(String.valueOf(num1)+num2+num3);
		System.out.println(""+num1+num2+num3);
		//스트링 변수 만들고 더블 변수 만들고 인트 변수 만들기가 순서
	}
	
}
