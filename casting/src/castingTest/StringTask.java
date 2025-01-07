package castingTest;

public class StringTask {
	public static void main(String[] args) {
		
		int number1 =0, num2=0, num3 = 0;
		String str1="8.24" , str2="7.8";
		//number1+str1+str2로 115만들기
		number1=1;
		num2=(int)Double.parseDouble(str1);
		num3=(int)Double.parseDouble(str2);
		
		System.out.println(String.valueOf(number1)+(num2+num3));
		

		//String ->int
		//String.valuOf(int값)
		//String이랑 다른 애들이랑 클래스가 달라서 맞추기 위해선
		//int Integer
		//boolean Boolean
		//double Double
		//float Float
		//char Character
		
	}
}
