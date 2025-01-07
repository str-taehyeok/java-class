package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask2 {
//	1) 1~10까지 ArrayList에 담고 출력
//	2) ABCDEF를 각각 문자별로 출력
//  3) 1~100까지 중 홀수만 ArrayList에 담고 출력
//  4) A~F까지 중 D를 제외하고 출력하기
//  5) 5개의 문자열을 모두 소문자로 출력하기
	
	public static void main(String[] args) {
//		ArrayList <Integer> num = new ArrayList<>();
//		IntStream.rangeClosed(1, 10).forEach(num::add);
//		num.forEach(System.out::println);
		
//		ArrayList <Character> abc = new ArrayList<>();
//		IntStream.range(0, 6).forEach(c -> abc.add((char)(c+65)));
//		abc.forEach(System.out::print);
		
		ArrayList<Integer> num2 = new ArrayList<>();
		IntStream.rangeClosed(1, 100).filter(n-> n % 2 == 1).forEach(num2::add);
		num2.forEach(System.out::println);
		
		ArrayList <Character> ddd = new ArrayList<>();
		IntStream.range('A', 'F').map(c-> c < 68 ? c: c+1).forEach(c -> ddd.add((char)c));
		ddd.forEach(System.out::print);
		
		String[] color = {"Black", "WHITE", "reD","yeLLow", "PINk"};
		ArrayList <String> ccc = new ArrayList<>(Arrays.asList(color));
		ccc.stream().map(String::toLowerCase).forEach(System.out::println);
		
		
	}
}
