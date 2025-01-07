package streamTask2;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamTask3 {
//	1) Apple, banana, Melon 중 첫 번째 문자가 대문자인 문자열 출력
//  2) 한글을 정수로 변경
//  3) 정수를 한글로 변경
//  4) ArrayList에 있는 모든 값을 더한 후 출력
//  5) 각각의 User가 들어가 있는 ArrayList<User>가 존재한다.
//  모든 User의 취미를 검토하여, 개발을 좋아하는 사람만 출력하기.
	public static void main(String[] args) {
		
//		String[] str = {"Apple","banana","Melon"};
//		ArrayList <String> fruit = new ArrayList<>(Arrays.asList(str));
//		
//		fruit.stream().filter(c-> c.charAt(0)<= 90).forEach(System.out::print);
//		
		String data = "공일이삼사오육칠팔구";
		String han = "칠이삼사";
		han.chars().forEach(System.out::println); // -> 칠이삼사 문자형 각각의 아스키 코드를 뽑아줌
//		han.chars().map(n->data.indexOf(n)).forEach(System.out::print);
		
//		String data = "공일이삼사오육칠팔구";
//		String num = "5213";
//		num.chars().forEach(System.out::print);
//		num.chars().map(n -> data.charAt(n-48)).forEach(n->{System.out.println((char)n);});
		
//		ArrayList<Integer> num =new ArrayList<>();
//		int result = 0;
//		for(int a : num) {
//			result += a;
//		}
//		System.out.println(result);
		
	ArrayList<User> users = new ArrayList <User>();
		
		User user1 = new User("홍길동", "축구_농구_야구", "나는 축구왕!");
		User user2 = new User("이순신", "개발_당구_축구", "나는 개발자 좋아!");
		User user3 = new User("장보고", "피아노", "피아노만 한 우물!");
		User user4 = new User("김철수", "스포츠댄스_개발", "취미로 춤을 춘다~");
		User user5 = new User("김영희", "골프_야구", "운동 선수는 나의 꿈");
		User user6 = new User("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		users.add(user6);
		
		users.stream().filter(person -> person.getHobby().contains("개발")).forEach(n -> {System.out.println(n.getName());});

	}
}
