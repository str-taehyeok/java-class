package variableTest;

public class VariableTask2 {
	public static void main(String[] args) {
// 		저장공간 2개만 사용 모두 출력하기
// 		datas, numbers 
// 		5, 7845.15, false, B, 85.10F, 자바, S, 98590, D, true, 공백문자
		double numbers= 0.0;
		String datas = "";
		
		datas = "5";
		System.out.println(datas);

		numbers = 7845.15;
		System.out.println(numbers);

		datas="false";
		System.out.println(datas);

		datas="B";
		System.out.println(datas);
		
		numbers = 85.10;
		System.out.println(numbers);
		
		datas="자바";
		System.out.println(datas);

		datas="S";
		System.out.println(datas);
		
		numbers=98590;
		System.out.println(numbers);
		
		datas="D";
		System.out.println(datas);
		
		datas="true";
		System.out.println(datas);

		datas="";
		System.out.println("공백문자"+datas);
	}
}
