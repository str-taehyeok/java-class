package collectionTest.hashMapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		
//		삽입 .put()
		userMap.put("id", "ksh1234");
		userMap.put("password", "1234");
		userMap.put("address", "경기도 구리시");
		userMap.put("age", 20);
		userMap.put("isRich", true);
		
//		collection 자료구조는 toString 재정의가 되어있다.
		System.out.println(userMap);

//		검색 .get()
		System.out.println(userMap.get("address"));
		
//		key가 필요할 때
//		순서가 없는 map구조에 순서를 붙여주기 위해 Iterator를 사용
//		Set<Entry<String, Object>> set = userMap.entrySet();
		Iterator<Entry<String, Object>> iter = userMap.entrySet().iterator();
		
//		iter.hasNext()
//		iter.next()
		while(iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
//			entry 타입에서 key값을 가져올 때
//			entry.getKey()
//			entry 타입에서 value값을 가져올 때
//			entry.getValue()
			
			if(entry.getKey().equals("isRich")) {
				System.out.println(entry.getValue());
			}
		
		}
	}
}

	


















