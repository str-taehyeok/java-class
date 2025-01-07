package classTest;

public class Person {
	
	String name;
	int age; // ->필드
	
	public Person() {;} //생성자 초기화 때려야됨
	public Person(String name, int age) {
	this.name = name;
	this.age=age;
}
	public static void main(String[] args) {
//		객체화
		Person younghee = new Person("영희", 20);
		System.out.println(younghee.name);
		System.out.println(younghee.age);
		
		Person zzangoo = new Person("짱구", 5);
		System.out.println(zzangoo.name);
		
		Person chulsu = new Person("철수", 27);
		System.out.println(chulsu.name);
		
		
		
	}
	
}
