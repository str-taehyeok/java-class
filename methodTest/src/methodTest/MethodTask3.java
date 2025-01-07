package methodTest;

public class MethodTask3 {
//	(실버)
//	홀수를 짝수로, 짝수를 홀수로(2->3,5->6)
	
	int changeToNumber(int num) {
		return ++num;
			
		}
	
	
		
//	(골드)
//	문자열을 입력받고 소문자는 대문자로, 대문자를 소문자로 바꿔주는 메소드
	void printSpelling(String data) {
		
		String message="영어 문자를 입력해주세요.", result="";
		System.out.println(message);
		
		for(int i=0; i<data.length(); i++) {
			char c=data.charAt(i);
			if(c>=65&& c<=90) {
				result+=(char)(c+32);
			}else if(c>=97&&c<=122) {
				result+=(char)(c-32);
			}else {
				result+=c;
			}
		}
		System.out.print(result);
	
	}
	
	public static void main(String[] args) {
		MethodTask3 mt = new MethodTask3();
		mt.printSpelling("HelLoㅁ");
	}
	
}	
	
	
	
	