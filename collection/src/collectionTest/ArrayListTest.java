package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest<T> {
//	<?>: 제네릭 - 포괄적인 즉 이름이 없는이라는 뜻
//	지금 당장 무슨 타입일지 알 수 없을 때 사용하는 타입
//	사용자가 어떤 타입의 데이터를 넣을지 모르니까 객체화 할 때 타입이 정해진다.
	T data;
	
	public static void main(String[] args) {
//		ArrayList<String> datas = new ArrayList<String>();
		
//		추가(삽입)
//		datas.add("a");
//		datas.add("b");
//		datas.add("c");
//		datas.add("d");
//		System.out.println(datas.size());
		
//		블록을 잡고 -> alt + shift + z
//		try {
//			System.out.println(datas.get(-5));
//		} catch (IndexOutOfBoundsException e) {
//			System.out.println("인덱스를 똑바로 입력하세요!");
//		} catch (Exception e){
//			System.out.println("알 수 없는 오류");
//			e.printStackTrace();
//		}

		ArrayList<Integer> datas = new ArrayList<Integer>();
		
	
		datas.add(10);
		datas.add(30);
		datas.add(50);
		datas.add(60);
		datas.add(40);
		datas.add(20);
		datas.add(70);
		datas.add(80);
		datas.add(90);
		
		Collections.shuffle(datas);
		
//		실습 35분
//		추가(삽입)
//		50뒤에 500을 삽입
//		if(datas.contains(50)) {
//			try {
//				datas.add(datas.indexOf(50) + 1, 500);
//			} catch (Exception e) {
//				System.out.println("인덱스 똑바로 입력해!!");
//				e.printStackTrace();
//			}
//		}
//		System.out.println(datas);
		
//		수정
//		90을 9로 수정
//		if(datas.contains(90)) {
//			try {
//				int prev = 0;
//				prev = datas.set(datas.indexOf(90), 9);
//				System.out.println("이전 값: " + prev + "\n수정 완료");
//				System.out.println(datas);
//			} catch (Exception e) {
//				System.out.println("인덱스 똑바로 입력!");
//				e.printStackTrace();
//			}
//		}
		
//		삭제
//		80 삭제
//		1) 인덱스로 삭제
//		if(datas.contains(80)) {
//			try {
//				int prev = 0;
//				prev = datas.remove(datas.indexOf(80));
//				System.out.println(prev);
//				System.out.println(datas);
//			} catch (Exception e) {
//				System.out.println("인덱스 똑바로!");
//				e.printStackTrace();
//			}
//		}
		
		
//		2) 값으로 삭제
//		wrapperClass, 랩핑
		if(datas.remove(Integer.valueOf(80))) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
		
//		검색
//		모든 값을 출력
		for(int i = 0; i < datas.size(); i++) {
			System.out.println(datas.get(i));
		}
		
//		toString 재정의
		System.out.println(datas);
		
	}
}

