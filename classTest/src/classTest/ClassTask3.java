package classTest;

class Market{
//	필드값 생성
	String productName;
	int productPrice;
	int productStock;
	
//	기본 생성자
	public Market() {;}
//	초기화 생성자(productName, productPrice, productStock);
	public Market(String productName, int productPrice, int productStock) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
	}

//	판매메서드 손님이란 클래스도 타입이고 손님의 돈을 가져오고 싶으니 주소값을 넣는다.
	void sell(Customer customer) {
		customer.money-= productPrice - productPrice*(customer.discount / 100.0);
		productStock--;
	}
}


class Customer{
	String name;
	String phone;
	int money;
	int discount;
	
//	기본 생성자
	public Customer() {;}
//	초기화 생성자(name, phone, money, discount)
	public Customer(String name, String phone, int money, int discount) {
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.discount = discount;
		}

}




public class ClassTask3{
	public static void main(String[] args) {
//		마켓 구현 emart("감자", 7000, 300); -> 상품명, 가격, 재고
//		마켓 이마트란 이름으로 객체화
		Market emart = new Market("감자",8000,200);

//		구매자 kth("김태혁", "01059107212", 10000, 30);
//		손님 kth 이니셜로 객체화
		Customer kth = new Customer("김태혁", "01059107212",10000,30);
		
//      emart.sell(kth); -> e마트라고 구현한 곳에 구매자 주소값을 넣는다.
		emart.sell(kth);
//      출력 마트의 재고
		System.out.println(emart.productStock);
//      출력 구매자의 남은돈
		System.out.println(kth.money);
	
	}
}







