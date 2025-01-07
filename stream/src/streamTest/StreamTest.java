package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
	
	public String addRoot(String url) {
		return "/app" +url;
	}
	
	public static void main(String[] args) {
		
//		시작점과 끝점을 알려줌
//		IntStream.range(0, 10); //-> 10번 반복 10은 포함x
//		IntStream.rangeClosed(0, 10); //-> 11번 반복 10 포함
		
//		forEach()
//		IntStream.range(0, 10).forEach(num->{System.out.println(num);});
//		IntStream.range(0, 5).forEach(number->{System.out.println(number+10);});
		
//		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
		
		
//		일반적인 for문
//		for(int i=0; i < numbers.size(); i++) {
//			System.out.println(numbers.get(i));
//		}
//		빠른 for문
//		for(int number : numbers) {
//			System.out.println(number);
//		}
//		Stream forEach	-> 인덱스가 있으면 쓸수잇음
//		numbers.forEach(num->{System.out.println(num);});
//		참조형 (소속::메서드)
//		numbers.forEach(System.out::println);
//		ArrayList<Integer> datas2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
//		
//		datas2.forEach(System.out::println);
		
//		ArrayList<Integer> data3 = new ArrayList<>();
//		IntStream.range(0, 10).forEach((num)->{data3.add(num * 5);});
//		System.out.println(data3);
		
//		10~1까지 ArrayList에 담고 출력, 참조형x 연산후 add
//		인덱스 0부터 4까지 삭제
		
//		ArrayList<Integer> data4 = new ArrayList<>();
//		IntStream.range(0, 10).forEach(num -> {data4.add(10-num);});
//		data4.forEach(System.out::println);
		
//		IntStream.range(0, 5).forEach((num)->{data4.remove(4-num);});
//		IntStream.range(0, 5).forEach((num) -> {data4.remove(0);});
//		data4.forEach(System.out::println);
		
//		String datas = "ABCDEFG";
//		문자열 Stream : chars()
//		datas.chars().forEach(c->{System.out.print((char)c);});
		
//		map() : 기존 값을 다른 값으로 변경, 맵은 반드시 return 해야한다.
//		ArrayList<Integer> datas2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
//		datas2.stream().map(n -> n+10).forEach(n->{System.out.println(n);});
//		IntStream.range(0, 5).map(n -> n+10).map(n -> n - 5).forEach(System.out::println);
		
//		() -> {};
//		() -> {return;}
//		매개변수가 1개면 ()와 자료형 생략, 리턴값이 있으면 {} 생략
//		String str1 = "ABCDE"; 
//		str1.chars().map(c-> c+5).forEach(c->{System.out.println((char)c);});
		
//		wrapper Class
//		User user1 = new User(Long.valueOf(1), "김태혁", 27, "개발자");
//		User user2 = new User(Long.valueOf(2), "홍길동", 17, "도적");
//		User user3 = new User(Long.valueOf(3), "장보고", 28, "장군");
//		User user4 = new User(Long.valueOf(4), "이순신", 33, "거북선메이커");
//		User user5 = new User(Long.valueOf(5), "이성계", 47, "사람");
		
//		ArrayList<User> users = new ArrayList<>();
//		
//		users.add(user1);
//		users.add(user2);
//		users.add(user3);
//		users.add(user4);
//		users.add(user5);
		
//		직업만 추출(map()), 직업 앞에 "직업: "(map())붙이기 출력하기!(forEach())
		
//		users.stream().map(u-> u.getJob()).map(job -> "직업:" + job).forEach(System.out::println);
//		users.stream().map(User::getJob).map(job -> "직업:" + job).forEach(System.out::println);
		
//		아래의 4개의 URL을 LIST에 담은 후 모든 경로 앞에 /app을 붙인다.
//		/news, /game, /brand, /rank
//		StreamTest streamTest = new StreamTest();
//		ArrayList<String> urls = new ArrayList<>(Arrays.asList("/news","/game","/brand","/rank"));
//		클래스가 다른 메서드의 참조형		
//		urls.stream().map(streamTest::addRoot).forEach(System.out::print);

//		정렬 sorted
//		ArrayList<Integer> numbers2 = new ArrayList<Integer>(Arrays.asList(30, 50, 10, 40, 90, 20, 80, 50));
//		오름차선
//		numbers2.stream().sorted().forEach((n) -> {System.out.println(n);});
//		내림차순
//		numbers2.stream().sorted(Collections.reverseOrder()).forEach(n -> {System.out.println(n);} );
		
//		결과를 다른 자료형으로 바꾸고 싶을 때: collect();
//		ArrayList<Integer> numbers3 = new ArrayList<Integer>(Arrays.asList(30, 50, 10, 40, 90, 20, 80, 50));
//		List<Integer> list = numbers3.stream().sorted().collect(Collectors.toList());//->collect를 이용하면 다른 자료구조로 바꿀수 잇음
		
//		문자열로 바꾸기
		ArrayList<Integer> numbers3 = new ArrayList<Integer>(Arrays.asList(30, 50, 10, 40, 90, 20, 80, 50));
		String str = numbers3.stream().sorted().map(n->n+10).map(String::valueOf).collect(Collectors.joining(","));
		System.out.println(str);
//		
//		ArrayList<String> numbers4 = new ArrayList<>(Arrays.asList(str.split(",")));
//		System.out.println(numbers4);
//		
//		filter
//		1~100까지 홀수만 출력
//		IntStream.rangeClosed(1, 100).filter((num)-> num % 2 !=0).forEach(System.out::println);
//		
////		1부터 100까지 ArrayList 짝수만 담고 출력
//		IntStream.rangeClosed(1, 100).filter((num)-> num % 2 ==0).forEach(System.out::println);
		
		ArrayList <Integer> even = new ArrayList<>();
		
		IntStream.rangeClosed(1,100).filter(n -> n % 2 == 0).forEach(even::add);
		even.forEach(System.out::println);
		
		
		
		
	}
}
