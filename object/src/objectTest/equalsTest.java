package objectTest;

public class equalsTest {
	public static void main(String[] args) {
		String data1="ABC";
		String data2="ABC";
		String data3= new String("ABC");
		String data4= new String("ABC");
		
		System.out.println(data1 == data2); //->기본 자료형의 참조 불변성
		System.out.println(data1.equals(data2));
		System.out.println(data3 == data4);
		System.out.println(data3.equals(data4));
	
	
	
	}
}
