package classTest;

public class A_Explain {

	int data;		//->필드
	void add() {}	//->필드
	public A_Explain() {;} // 이미 주소값이라는 명확한 return값이 있으므로 건드리지 마라는 뜻의 기본 생성
	
	public static void main(String[] args) {
		A_Explain 내꺼 = new A_Explain();
		A_Explain 내꺼아님 = new A_Explain();
		System.out.println(내꺼.data);
		System.out.println(내꺼아님.data);
		
	}

}
