package access2;

public class UsesrTask1 {
//	이름, 나이, 인스타, 전화번호
//	필드 구성
	private String name;
	private int age;
	private String insta;
	private String phone;
	
	public UsesrTask1() {;}
	
	public UsesrTask1(String name, int age, String insta, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.insta = insta;
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
	public String getInsta() {
		return insta;
	}
	public void setInsta(String insta) {
		this.insta = insta;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
