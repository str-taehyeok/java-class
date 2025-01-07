package classTest;

public class StaticTest {
	
	int data = 10;
	static int data_s=10;
	
	public StaticTest() {
;
	}
	void increase(){
		System.out.println(++data);
	}
	void increase_s() {
		System.out.println(++data_s);
	}
	
	
	
	
	public static void main(String[] args) {
//		StaticTest st = new StaticTest(); =>객체화 하는 코드
//		st.increase();
//		st.increase();
//		st.increase();
//		st.increase();
//		st.increase();
//		st=new StaticTest();
//		st.increase();
//		st.increase();
//		st.increase();
//		st.increase();
//		st.increase();
		
		System.gc(); //->가비지 콜렉터 (쓰레기 청소부)
		
		StaticTest st = new StaticTest();
		st.increase_s();
		st.increase_s();
		st.increase_s();
		st.increase_s();
		st.increase_s();
		st=new StaticTest();
		st.increase_s();
		st.increase_s();
		st.increase_s();
		st.increase_s();
		st.increase_s();
		
		
	}
}
