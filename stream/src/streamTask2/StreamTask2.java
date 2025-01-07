package streamTask2;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamTask2 {
//      이름, 취미, 소개
//      홍길동, 축구_농구_야구, 나는 축구왕!
//      이순신, 개발_당구_축구, 나는 개발자 좋아!
//      장보고, 피아노, 피아노만 한 우물!
//      김철수, 스포츠댄스_개발, 취미로 춤을 춘다~
//      김영희, 골프_야구, 운동 선수는 나의 꿈
//      흰둥이, 개발_축구_농구, 개발도 운동도 다 잘해요!
	public static void main(String[] args) {
//   1) Apple, banana, Melon 중 첫 번째 문자가 대문자인 문자열 출력

//		String[] strFruit = {"Apple", "banana","Melon"};
//		ArrayList<String> fruit = new ArrayList<>(Arrays.asList(strFruit));
//		
//		fruit.stream().filter(f -> f.charAt(0) <= 90).forEach(System.out::print);
		
//   2) 한글을 정수로 변경
//		String han = "공일이삼사오육칠팔구";
//		String data ="공칠이삼"
		
//		data.chars().map(c->han.indexOf(c)).forEach(System.out::print);
//   3) 정수를 한글로 변경
		String hangle = "공일이삼사오육칠팔구";
		String data = "1024";
		
		data.chars().map(c-> c-48).forEach(c->{System.out.print(hangle.charAt(c));});
		
		
//   4) ArrayList에 있는 모든 값을 더한 후 출력
		ArrayList<Integer> sum = new ArrayList<Integer>();
		int result = 0;
		for(int a: sum) {
			result += a;
		}
		System.out.println(result);
//   5) 각각의 User가 들어가 있는 ArrayList<User>가 존재한다.
//      모든 User의 취미를 검토하여, 개발을 좋아하는 사람만 출력하기.
		
		
		
		

		
		
//		
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
		
		users.stream().filter(u -> u.getHobby().contains("개발")).map(u->u.getName()).forEach(System.out::println);
		
		
		
		
	}
}
