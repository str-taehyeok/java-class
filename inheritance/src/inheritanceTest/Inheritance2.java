package inheritanceTest;

class Human{
	String name;
	public Human() {;}
	public Human(String name) {
		super();
		this.name = name;
	}
	
	void eat() {
		System.out.println("먹기");
	}
	void sleep() {
		System.out.println("자기");
	}
	void walk() {
		System.out.println("두 발로 걷기");
	}
}	
class Monkey extends Human{
	@Override //-> 언어텐션(엄마를 부른건지, 재정의한건지 알려주기 위함)
	void walk() {
		System.out.println("네 발로 걷기");
	}
}
class Snake extends Human{
	void walk() {
		System.out.println("기어 다니기");
	}
}

public class Inheritance2 {
	public static void main(String[] args) {
		Monkey kingkong = new Monkey();
		Snake snake = new Snake();
		kingkong.eat();
		kingkong.sleep();
		kingkong.walk();
		
		snake.walk();
	
	}
}


