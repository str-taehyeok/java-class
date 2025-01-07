package interfaceTest2;

public class InterfaceTask2 {
//	Sales(인터페이스)
//	sell
//	social
//	comeInMoney

//	회사원 employee
//	필드 name, age, history, phone
//	comeInMoeny 없음	
//	sell, social만 구현
	
//	InterfaceTask2 객체화를 시킨후
//	comeInMoney, sell 사용

//  Person(부모)
//  필드 name, age
//  메서드 eat, sleep, poop이 존재한다. 
//  eat : 먹는다, sleep : 잔다, poop : 싼다.
//  Employee는 Person의 자식이다.
//  Person는 추가로 playHobby 취미를 가지는 메서드가 있다.
//  playHobby : 취미로 자전거 타기

//  Employee의 타입으로 업캐스팅 후, 다시 다운캐스팅하여
//  Employee의 playHobby를 출력하시오.

	
	public static void main(String[] args) {
		Employee kth = new Employee("김태혁",27,2,"01059107212");
		kth.sell();
		kth.comeInMoney();
		kth.social();
		
		Person person = new Person("홍길동",20);
		person.sell();
		person.social();
		
		
	}
}
