package arrayTest;

public class ArrayTest2 {
	public static void main(String[] args) {
		String data="ABCDEFG";
//		System.out.println(data.length()); //-> 길이
//		문자열 배열, 열열 ->문자열도 길이를 구할 수 있음 
//		System.out.println(data.indexOf('G')); //->검색
//		System.out.println(data.charAt(i));//추출(char)		
		
//		E출력
//		System.out.println(data.charAt(data.indexOf('E')));
		
//		D출력하기
		System.out.println(data.charAt(data.indexOf('D')));
		
		
		for(int i=0; i< data.length(); i++) {
			System.out.println(data.charAt(i));//추출(char)
			
			if(data.charAt(i)==65) {
				System.out.println("응 있어");
			}
		}
		
		
	}
}
