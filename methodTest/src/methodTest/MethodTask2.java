package methodTest;

public class MethodTask2 {
//	(a)
//	이름을 출력해주는 메소드
//	1~10까지 짝수만 출력해주는 메소드
//	10을 5번 출력해주는 메소드
//	나이에 10을 더해주는 메소드
//	두 정수를 곱해주는 메소드
//	세 정수를 더해주는 메소드
	void printName(String name) {
		System.out.println(name);
	}
	
	void printNumber() {
		for(int i=0; i<10; i++) {
			if(i%2==0) {
				System.out.println(i);
			}else {
				continue;
			}
		}
	}
	void print10FiveTimes() {
		for(int i=0; i<5; i++){
			System.out.println(10);
		}
	}
	
	int addToAge(int age) {
		return age+10;
	}
	int multiply(int num1, int num2) {
		return num1*num2;
	}
	
	int Plus(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
	
	
	
		
//	(b)	
//	홍길동을 n번 출력하는 메서드
	void printHong(int input) {
		for(int i =0; i<input; i++) {
			System.out.print("홍길동");
		}
	}
	

//	두 정수의 나눗셈 후 몫과 나머지 두개를 구하는 메소드
	int[] calc(int num1, int num2) {
		int[] arData = new int[2];
		arData[0]=num1 / num2;
		arData[1]=num1 % num2;
		
		return arData;
	}
	
	
	
//	1~n까지의 합을 구해주는 메소드
	
	int sum(int n){
		int result=0;
		for(int i=0; i<n;i++) {
			result=+i;
		}
		return result;
	}
	
	
	
	
	
	public static void main(String[] args) {
		MethodTask2 mt = new MethodTask2();
		mt.printHong(10);
//		int[] result =null;
//		result = mt.calc(0, 0); 이러고 반복문을 돌려야함 
	
	}
}
