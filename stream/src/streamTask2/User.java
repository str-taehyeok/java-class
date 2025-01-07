package streamTask2;

import java.util.Objects;

public class User {
	private String name;
	private String hobby;
	private String introduce;
	
	public User() {;}

	public User(String name, String hobby, String introduce) {
		super();
		this.name = name;
		this.hobby = hobby;
		this.introduce = introduce;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", hobby=" + hobby + ", introduce=" + introduce + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(hobby);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(hobby, other.hobby);
	}
	
	
}
