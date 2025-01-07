package dateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		Date date = new Date();
//		System.out.println(date);
//		System.out.println(simpleDateFormat.format(date));
		
		
//		형식이 잘못 됐을 수도 있기 때문에 try~catch문을 강제한다.
		try {
			simpleDateFormat.parse("1900년 12월 4일");
			System.out.println(simpleDateFormat.parse("1900년 12월 4일"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
