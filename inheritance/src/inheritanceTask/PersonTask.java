package inheritanceTask;
//상속 및 분리 실습

public class PersonTask{
//PersonTask
//이름, 나이, 주소, 핸드폰
//각 메서드 출력
//work 일을 한다
//sleep 잠을 잔다
//eat 세 끼를 먹는다
	String name;
	int age;
	String address;
	String phone;
	public PersonTask() {;} //기본 생성자 만들기
//	생성자 초기화
	public PersonTask(String name, int age, String address, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}
//	부모 클래스에서 메서드 만들기
	void work(){
		System.out.println("일을 한다");
	}
	void sleep() {
		System.out.println("잠을잔다");
	}
	void eat() {
		System.out.println("세 끼를 먹는다");
	}


}

	
	
	
	






