package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;

public class FileTask {
//	음식 4개를 출력
//	"스테이크", "돈까스", "피자", "스파게티", "햄버거
	public static void main(String[] args) throws IOException{
		
//		BufferedWriter bufferedWrite = new BufferedWriter(new FileWriter("./test.txt"));

//		bufferedWrite.write("스테이크\n");
//		bufferedWrite.write("돈까스\n");
//		bufferedWrite.write("피자\n");
//		bufferedWrite.write("스파게티\n");
//		bufferedWrite.write("햄버거\n");
//		bufferedWrite.close();
		
		
		
//		while((line = bufferedReader.readLine()) != null) {
//			System.out.println(line);
//		}
	
//		값 수정
//		while((line = bufferedReader.readLine()) != null) {
//			if(line.equals("스파게티")) {
//				temp+= "냉모밀\n";
//				continue;
//			}
//			temp += line + "\n";
//		}
//		bufferedReader.close();
//		System.out.println(temp);
			
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./test.txt"));
//		bufferedWriter.write(temp);
		
//		김치찜
		
//		BufferedReader bufferedReader = new BufferedReader(new FileReader("./test.txt"));
//		String line = null;
//		String temp = "";
//		
//		while((line = bufferedReader.readLine())!=null) {
//			if(line.equals("김치찜")) {
//				continue;
//			}
//			temp += line + "\n";
//		}
//		bufferedReader.close();
//		
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./test.txt"));
//		bufferedWriter.write(temp);
//		
//		bufferedWriter.close();
		
//		음식을 4개 출력
//		stream문법
//		"한우", "갈비살", "삼겹살","항정살"
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("food.txt"));
//		String[] foods = {"한우", "갈비살", "삼겹살","항정살"};
//		Arrays.asList(foods).stream().forEach(food ->{
//			try {
//				bufferedWriter.write(food + "\n");
////				bufferedWriter.newLine(); 비추!
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		});
//		bufferedWriter.close();
		
//		4의 배수
//		4
//		32까지
//		stream 문법으로 gugu.txt를 만들어서 출력하기!
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("gugu.txt"));
		IntStream.rangeClosed(1, 9).map(n -> n * 4).forEach(gugu->{
			try {
				bufferedWriter.write("4"+"\tx\t"+gugu/4 +"\t=\t"+ gugu +"\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		bufferedWriter.close();
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("gugu.txt"));
		String line = "";
		while((line= bufferedReader.readLine())!=null) {
			System.out.println(line);
		}
		
	}
}


