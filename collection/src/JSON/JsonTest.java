package JSON;

import java.util.HashMap;

import org.json.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("id", "ksh1234");
		userMap.put("password", "1234");
		userMap.put("name", "김세환");
		userMap.put("age", 17);
		
		JSONObject json = new JSONObject(userMap);
		System.out.println(json.toString());
		
	}
}
