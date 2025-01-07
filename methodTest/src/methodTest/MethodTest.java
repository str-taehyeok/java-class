package methodTest;

public class MethodTest {
//	f(x) = 2x + 1
	int f(int num) {
		return 2*num +1;
	}
	
//	두 정수를 빼주는 메소드
	int minus(int num1, int num2){
		return num1-num2;
	}
//	이름을 출력해주는 메서드
	void print(String name) {
		System.out.println(name);
	}
//	두 정수를 곱해주는 메서드
	int multiply(int num1, int num2) {
		return num1*num2;
	}
//	나이를 출력해주는 메서드
	void printAge(int age) {
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		
//		RAM에 클래스 주소를 할당
		MethodTest mt = new MethodTest();
		System.out.println(mt.minus(20, 30));
		mt.printAge(27);
//		System.out.println(mt.f(50)=101);
		mt.print("김태혁");	
}
	
	
	
	
	
}
