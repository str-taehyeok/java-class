package classCastingTest;

class Car{
	public Car() {;}
	void engineStart() {
		System.out.println("열쇠로 시동킴");
	}
}
class SuperCar extends Car{
	public SuperCar() {;}
	@Override
	void engineStart() {
		super.engineStart();
	}

	void openRoof() {
		System.out.println("뚜껑 오픈!");
	}
}

public class ClassCastingTest {
	public static void main(String[] args) {
		Car matiz = new Car();
		Car kia = new SuperCar(); //->넘치는건 괜찮다. 자식이 부모한테 상속받으니 더 큼 (upCasting)
		SuperCar ferrari = new SuperCar();
		SuperCar kiaFullOption = (SuperCar)kia;
		kiaFullOption.openRoof();
		SuperCar lamb = (SuperCar)kia; //->부모의 클래스를 자식의 클래스로 형변환 했기 때문에 사용가능(downCasting)
		
//		SuperCar benz = new Car(); 부모가 자식을 다 채울 수 없어서 오류
//		SuperCar lamb = (Car)kia; ->부모클래스라 오류
		
//		type instanceOf type : (타입을 확인하는 친구) 참 또는 거짓
		System.out.println(matiz instanceof Car);
		System.out.println(matiz instanceof SuperCar);
		System.out.println(kia instanceof Car);
		System.out.println(kia instanceof SuperCar);
		System.out.println(ferrari instanceof Car);
		System.out.println(kiaFullOption instanceof Car);
	}
}





