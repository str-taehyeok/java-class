package JSON;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonTest2 {
	public static void main(String[] args) {
		
		User user1 = new User("1", "김세환", "1234", "01000000000");
		User user2 = new User("2", "장보고", "4567", "01000000000");
		User user3 = new User("3", "이순신", "7890", "01000000000");
		User user4 = new User("4", "홍길동", "3489", "01000000000");
		
//		단일 객체는 JSONObject로 생성자로 전달하면 JSON으로 변환시킬 수 있지만,
//		ArrayList에 들어가있는 객체는 사용할 수 없다.
//		따라서 JSONArray를 이용해서 전달해야 한다.
		
		JSONObject userJson = new JSONObject();
		JSONArray usersJSON = new JSONArray();

		ArrayList<User> users = new ArrayList<User>();

		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);

		System.out.println(users);
		
//		stream
		users.stream().map(user -> new JSONObject(user)).forEach(usersJSON::put);	
		System.out.println(usersJSON.toString());
		
	}
}













