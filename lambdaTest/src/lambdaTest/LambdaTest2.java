package lambdaTest;

public interface LambdaTest2 {
	public static void main(String[] args) {
//      1) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다구현 PrintString, strCount()
//      ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"
		PrintString ps = (String str , char c) -> {
			int count = 0;
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i)==c) {
					count++;
				}
			}
			return count;
		};
		System.out.println(ps.strCount("apple", 'p'));
		
//      2) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove removeStr()
		Remove remove = (String str1, char c1) -> {
			String result = "";
			for(int i=0; i < str1.length(); i++) { //-> String result = str1.replcaeAll(String.valuOf(c), "");
				if(str1.charAt(i)!=c1) {
					result += str1.charAt(i); 
				}
			}
			return result;
		};
		System.out.println(remove.removeStr("가나다가나다라마", '가'));
		
		
		
		
//      3) 문자열에서 중복된 값 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
//		System.out.println("abcdefg".contains("b")); -> b있니? true , false
		Dedupe dedupe = (String str2)->{
			String result1 ="";
			for(int i=0; i<str2.length(); i++) {
//				가나 가나다 가나다라 - >가나다라
				if(!result1.contains(String.valueOf(str2.charAt(i)))) {
					result1 += str2.charAt(i);
				}
			}
			return result1;
		};
		String result = dedupe.getDedupe("가나가나다가나다라가나다라마");
		System.out.println(result);
		
		
		
		
	}
}
