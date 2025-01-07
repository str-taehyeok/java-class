package collectionTest.hashSetTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
//		HashSet<String> mbti = new HashSet<String>();
//		
//		mbti.add("ISTP");
//		mbti.add("ISTP");
//		mbti.add("ENFJ");
//		mbti.add("ESTP");
//		mbti.add("INFP");
//		mbti.add("ENTJ");
//		mbti.add("INFJ");
//		mbti.add("ISFP");
//		System.out.println(mbti);
		
//		데이터를 가져오고 싶을 때 순서를 부여해야 한다.
//		iterator 순서가 없을 때 순서를 부여할 수 있다.
//		Iterator<String> iter = mbti.iterator();
		
//		if(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
//		
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
//		중복된 데이터 삭제하고 싶을 때
		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 7, 8, 1, 2, 3));
		System.out.println(datas);
		datas = new ArrayList<Integer>(new HashSet<Integer>(datas));
		System.out.println(datas);
	
	}
}












