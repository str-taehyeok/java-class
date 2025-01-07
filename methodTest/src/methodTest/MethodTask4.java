package methodTest;

import java.util.Scanner;

public class MethodTask4 {
//	문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
	int getCountOfcharacterInContent(String content, char character){
//		문자열과 문자형을 받는다.
//		반복문을 돌린다.
//		문자열을 문자형으로 분리한다.
//		count를 만들어서 숫자를 센다.
//		count를 반환한다.
		int count = 0;
		for(int i = 0; i < content.length(); i++) {
			if(content.charAt(i) == character) {
				count++;
			}
		}
		return count;
	}	
	
//	5개의 정수를 입력받은 후 원하는 인덱스의 값을 구해주는 메소드
//	배열을 받는다, 인덱스 받는다.
//	배열[인덱스]
	int getValueArrayIndex(int[] arData, int index) {
		return arData[index];
	}
	
//	한글을 정수로 바꿔주는 메소드(일공이사 -> 1024)
//	문자열 받는다.
//	문자열을 하나씩 검사한다.(for)
//	charAt(i)
//	하나씩 검사하기 위해서 한글을 담은 문자열을 만든다.
//	그 한글을 담은 문자열의 인덱스와 입력한 문자와 같으면 인덱스를 넘겨준다.
	
	
	int changeToInteger(String hangle) {
		String hangles = "공일이삼사오육칠팔구";
		String result = "";
		for(int i = 0; i < hangle.length(); i++) {
			result += hangles.indexOf(hangle.charAt(i));
		}
		return Integer.parseInt(result);
	}
	
	public static void main(String[] args) {
		MethodTask4 mt = new MethodTask4();
		mt.changeToInteger("이삼사오");
		Scanner sc = new Scanner(System.in);
		String message = "5개 정수를 입력해주세요", exampleMessage = "ex)1 3 5 7 9";
		String message2 = "문자열에서 찾을 문자형을 입력하세요.", 
				exampleMessage2 = "ex)apple a\na는 2개입니다.";
		String[] arData2 = new String[2];
		int result = 0;
		

		
//		System.out.println(message);
//		System.out.println(exampleMessage);
//		
//		
		int[] arData = new int[5];
		for(int i = 0; i < arData.length; i++) {
			arData[i] = sc.nextInt();
		}
//		
//		System.out.println(mt.getValueArrayIndex(arData, 4));
		System.out.println(message2);
		System.out.println(exampleMessage2);
		
		for(int i = 0; i < arData2.length; i++) {
			arData2[i] = sc.next();
		}
		result = mt.getCountOfcharacterInContent(arData2[0], arData2[1].charAt(0));
		System.out.println(result);
		
	}
	
}
