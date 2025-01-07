package staticTask;

public class Company {

//	필드
//	필드값을 구성한다.
//	name 이름
//	age 나이
//	income 수입
	int age, income;
	String name;
//	money 회사의 총 수입
	static long money;
//	기본 생성자 생성
	public Company() {;}
//	초기화 생성자 생성: 이름, 나이
	public Company(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public static void main(String[] args) {
//	필드 구성 후 객체화
//	객체화 시 생성자로 초기화
		Company employee1 = new Company("김태혁",27);
		Company employee2 = new Company("홍길동",21);
		Company employee3 = new Company("이순신",22);
		Company employee4 = new Company("장보고",23);
//	회사원 employee1 총 수입 10000
//	회사원 employee2 총 수입 1000
//	회사원 employee3 총 수입 2000
//	회사원 employee4 총 수입 -10000
		employee1.income += 10_000;
		employee2.income += 1_000;
		employee3.income += 2_000;
		employee4.income -= 10_000;
//		수입을 배열에 담고 for문을 돌려 총 수입에 누적복합한다.
//		int[] arData = {employee1.income, employee2.income, ==
//				employee3.income, employee4.income};
//		for(int i=0; i<arData.length;i++) {
//			money+=arData[i];
//		}
//		회사의 총 수입 출력
//		System.out.println(money);
		Company.money += employee1.income;
		Company.money += employee2.income;
		Company.money += employee3.income;
		Company.money += employee4.income;
		System.out.println(Company.money);
		
	}
}
