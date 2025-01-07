package fileTask2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileTask2 {
	public static void main(String[] args) throws IOException{
		ArrayList <User> users = new ArrayList<>();
		User user1 = new User(1L, "김태혁", 27, "개발자");
		User user2 = new User(2L, "짱구", 20, "유치원생");
		User user3 = new User(3L, "철수", 25, "사업가");
		User user4 = new User(4L, "유리", 22, "전업주부");
		User user5 = new User(5L, "수지", 26, "대사업가");

		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
//		System.out.println(users);
//		ooo님의 직업은 ooo입니다. 틀 jobs.txt에 쓰고 콘솔에 출력하기
//		Stream API를 사용한다.
		
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("jobs.txt"));
		users.forEach(n-> {
			try  {
				bufferedWriter.write(n.getName()+"님의 직업은 " +n.getJob()+"입니다.\n");
				} catch (IOException e){
					e.printStackTrace();
				}
			});
			bufferedWriter.close();
			
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("jobs.txt"));
				String line="";
				while((line = bufferedReader.readLine())!=null) {
					System.out.println(line);
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			bufferedReader.close();
		}
		
		
		
		
		
		
		
		
		
	}
}
