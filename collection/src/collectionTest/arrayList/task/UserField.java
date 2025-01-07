package collectionTest.arrayList.task;

import java.util.ArrayList;

public class UserField {
	public ArrayList<User> users = DBConnecter.users;
	public static String userId;
	public static String code;
	final int KEY = 100;
	
//	아이디 검사
	public User checkId(String id) {
		for(User user : users) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	
//	회원가입
	public void join(User user) {
		User userInDb = checkId(user.getId());
		if(userInDb == null) {
			users.add(user);
		}
	}
	
//	로그인
//	public boolean login(User user) {
//		for(User userInDb: users) {
//			if(userInDb.getId().equals(user.getId())) {
//				if(userInDb.getPassword().equals(user.getPassword()))) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}

	public boolean login(User user) {
		User userInDb = checkId(user.getId());
		if(userInDb != null) {
			if(userInDb.getPassword().equals(user.getPassword())) {
				userId = user.getId();
				return true;
			}
		}
		return false;
	}

//	로그아웃
	public void logout() {
		userId = null;
	}
 
//	비밀번호 변경(마이페이지)
	void update(User user) {
		User userInDb = checkId(user.getId());
		if(userInDb != null) {
			userInDb.setPassword(user.getPassword());
		}
	}
	
//	암호화
	String encrypt(String password) {
		String encryptedPassword = "";
		for(int i = 0; i < password.length(); i++) {
			encryptedPassword += (char)(password.charAt(i) * KEY);
		}
		return encryptedPassword;
	}
	
//	비밀번호 변경(비밀번호 변경 30일)
	public boolean update(String password, String newPassword) {
		User foundUser = checkId(userId);
		if(foundUser.getPassword().equals(password)) {
			foundUser.setPassword(encrypt(newPassword));
			return true;
		}
		return false;
	}
	
//	연습겸
//	인증번호 전송
//	인증메일 전송
//	인증번호 확인
	
	public static void main(String[] args) {
		UserField uf = new UserField();
		System.out.println(uf.encrypt("아무거나 암호화시키기"));
	}
}










