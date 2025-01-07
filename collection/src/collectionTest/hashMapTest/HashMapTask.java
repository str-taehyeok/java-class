package collectionTest.hashMapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTask {
	
	void hello() {
		System.out.println("안녕!");
	};
	
	public static void main(String[] args) {
		
		HashMap<String, Object> user = new HashMap<String, Object>();
		user.put("userId", 1);
		user.put("id", 3);
		user.put("title", "오늘은 수요일!");
		user.put("body", "점심 뭐먹지?");
		
//		수정 = 데이터가 있으면 수정된다.
		user.put("userId", 20);
		System.out.println(user.get("userId"));
		
		System.out.println(user);
		System.out.println(user.get("id"));
//		Set<Entry<String, Object>> set = user.entrySet();
		Iterator<Entry<String, Object>> iter = user.entrySet().iterator();
		
		
		while(iter.hasNext()) {
			System.out.println(iter.next().getValue());
		}
		
//		HashMapTask a = new HashMapTask();
//		a.hello();
//		new HashMapTask().hello();

//		hashMap 만들기
//		 "userId": 1,
//	     "id": 3,
//	     "title": "오늘은 수요일",
//	     "body": "오늘 점심 뭐먹지?"
		
		
	}
}
