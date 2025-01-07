package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
		

		
//      1) 1~10까지 ArrayList에 담고 출력
		ArrayList<Integer> num = new ArrayList<>();
		
		IntStream.rangeClosed(1, 10).forEach(num::add);
		num.forEach(System.out::println);
		
//      2) ABCDEF를 각각 문자별로 출력
		ArrayList<Character> number = new ArrayList<>();
		IntStream.range(0, 6).forEach(n->{number.add((char)(n+65));});
		number.forEach(System.out::println);
		
		String str = "ABCDEF";
		str.chars().forEach(c->{System.out.println((char)c);});
		
//      3) 1~100까지 중 홀수만 ArrayList에 담고 출력
		ArrayList<Integer> num2 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 100).filter(n-> n % 2 != 0).forEach(num2::add);
		num2.forEach(System.out::println);
		
//      4) A~F까지 중 D를 제외하고 출력하기
	    ArrayList<Character> chars2 = new ArrayList<Character>();
	      IntStream.range('A', 'F').map(c -> c > 67 ? c + 1 : c).forEach(c -> chars2.add((char)c));
	      System.out.println(chars2);

		
//		str.chars().filter(c -> c != 'D').forEach(c-> {System.out.println((char)c);});
		
//      5) 5개의 문자열을 모두 소문자로 출력하기
//      Black, WHITE, reD, yeLLow, PINk   String.toLowerCase(), toUppercase()
		String[] strArr = {"Black", "WHITE", "reD", "yeLLow", "PINk"};
		ArrayList <String> change = new ArrayList<>(Arrays.asList(strArr));
		change.stream().map(String::toLowerCase).forEach(System.out::println);
		
		
		
		
	}
}
