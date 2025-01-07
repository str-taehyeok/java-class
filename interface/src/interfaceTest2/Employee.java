package interfaceTest2;

public class Employee extends Person  {
//	필드 name, age, history, phone
	private String name;
	private int age;
	private int history;
	private String phone;
	
	public Employee() {;}
	
	public Employee(String name, int age, int history, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.history = history;
		this.phone = phone;
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

	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public void sell() {
		System.out.println("아주 잘 판매한다.");
	}
	@Override
	public void social() {
		System.out.println(this.history + "년 정도 일했습니다.");
	}
	@Override
		public void comeInMoney() {
		System.out.println("직장인은 돈을 번다.");
	}
}
