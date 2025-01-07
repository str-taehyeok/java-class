package inheritanceTest;

class A{
	String name;
	int age;
	
	public A() {
		System.out.println(this);
		System.out.println("부모 생성자 호출");
	}
	
	public A(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}

class B extends A{
	public B() {;}
	public B(String name, int age) {
		super(name, age);
		System.out.println(this);
		System.out.println("자식 생성자 호출");
	}
	
	void printData() {
		
	}
}




public class InheritanceTest {
	public static void main(String[] args) {
		B b = new B("김태혁",1234);
		System.out.println(b.name);
		
	}
}







