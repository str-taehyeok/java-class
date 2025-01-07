package interfaceTest2;

public class Person extends SalesAdapter{

//  Person(부모)
//  필드 name, age
//  메서드 eat, sleep, poop이 존재한다. 
//  eat : 먹는다, sleep : 잔다, poop : 싼다.
//  Employee는 Person의 자식이다.
//  Person는 추가로 playHobby 취미를 가지는 메서드가 있다.
//  playHobby : 취미로 자전거 타기
	private String name;
	private int age;
	
	public Person() {;}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	void eat() {
		System.out.println("먹는다.");
	}
	void sleep() {
		System.out.println("잔다.");
	}
	void poop() {
		System.out.println("싼다.");
	}
	
	   @Override
	   public void sell() {
	      System.out.println("인간은 장사를 팔기 위해 돈을 법니다.");
	   }
	   @Override
	   public void social() {
	      System.out.println("인간을 사회 생활을 합니다.");
	   }
	   

}
