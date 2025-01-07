package prepareTask;

public class Person {
//   Person 클래스(부모클래스) - extends
//  각 필드의 이름과 타입을 정확히 입력하세요.
//  이름(name), 나이(age), 직업(job), 취미(hobby)
	String name;
	int age;
	String job;
	String hobby;
//  기본 생성자와 매개변수 2개가 있는 생성자,
//  총 2개를 생성자를 생성하세요.
//  이름(name)과 나이(age)를 초기화 생성자로 설정한다.
//  *참조 : this는 생략가능하지만 무조건 사용해야 한다.	
	public Person() {;}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
//  이름을 출력 메소드를 구현하세요.
//  ex) "홍길동"
//  1. 메소드의 이름은 printName이다.
//  2. 리턴타입은 존재하지 않는다.
//  3. 매개변수를 받지 않는다.	
	void printName() {
		System.out.println(name);
	}
//  하고 있는 일을 출력하는 메소드(work) : 리턴타입x, 매개변수 x
//  ex)"OO은 하는 일이 없습니다."
//  *OO은 해당 필드의 직업의 이름을 넣으세요.
	void work() {
		System.out.println(job+"은 하는 일이 없습니다.");
	}
//   출력하는 메소드(hobby) : 리턴타입x, 매개변수 x
//  "취미는 잠자기 입니다."를 출력하는 메소드 
    void hobby() {
    	System.out.println("취미는 잠자기 입니다.");
    }
   

   
   
}
