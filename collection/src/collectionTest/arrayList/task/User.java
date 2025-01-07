package collectionTest.arrayList.task;

import java.util.Objects;

public class User {
//	1. 필드 구성
//	2. private
//	3. 생성자
//	4. getter, setter
//	5. toString 재정의
//	6. equals, hashcode 재정의

	private String id;
	private String name;
	private String password;
	private String phone;
	
	public User() {;}

	public User(String id, String name, String password, String phone) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", phone=" + phone + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

//	중복이 없는 값만
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
}



















