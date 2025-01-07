package optionalTest;

import java.util.Objects;

public class User {
	private Long id;
	private String userName;
	private String userId;
	private String userPassword;
	private static Long seq;//-> 시퀀스 유저들의 정보를 자동으로 등록해주는 친구
	
	static {
		seq = 0L;
	}
	
	{
		this.id =seq++;
	}
	
	public User() {;}

	public User(String userName, String userId, String userPassword) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.userPassword = userPassword;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public static Long getSeq() {
		return seq;
	}

	public static void setSeq(Long seq) {
		User.seq = seq;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userId=" + userId + ", userPassword=" + userPassword
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return Objects.equals(id, other.id);
	}

	
}
