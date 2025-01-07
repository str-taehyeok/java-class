package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
//	throws는 해당 메소드를 사용한 쪽으로 예외를 발생시킨다.
//	따라서 메소드 내에서는 throws에 작성한 예외가 발생하지 않는다.
	public static void main(String[] args) throws IOException{
		
//      new FileWriter(경로, 이어쓰기 여부)
//      절대 경로 : 어디에서 작성해도 찾아갈 수 있는 경로, "대한민국 서울시 강남구 역삼동 123-123 빌라102호"
//      상대 경로 : 현재 위치에 따라 변경되는 경로, "직진해서 우회전하세요.","../../a/b",".a" "/a/b"
//				1. /를 적으면 최상위 폴더 경로
//              2. ./을 찍으면 현재 폴더 경로
//              3. ../을 찍으면 현재 상위 폴더 경로
		
//		쓰기
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./text.txt"));
//		bufferedWriter.write("안녕! 나는 태혁이야~!\n");
//		bufferedWriter.write("여러 줄 출력할 생각이야\n");
//		bufferedWriter.write("오늘은 금요일\n");
//		bufferedWriter.write("점심 뭐먹지~!");
//		bufferedWriter.close();
		
//		읽기
		BufferedReader bufferedReader = null;
	
		try {
			bufferedReader = new BufferedReader(new FileReader("./text.txt"));
			String line = null;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("없는 경로다");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { //->예외가 있던 없던 무조건 파일을 닫아야 함으로 finally 넣어야댐
			System.out.println("무조건 실행");
			bufferedReader.close();
		}
		
		
		
		
		
		
	}
}
