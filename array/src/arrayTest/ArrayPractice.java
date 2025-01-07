package arrayTest;

import java.util.Scanner;

public class ArrayPractice {
	public static void main(String[] args) {
//		(골드)
//		5개의 정수를 입력 받고 배열에 담은 후 최대값과 최소값을 출력
//		스캐너를 생성한다.
//		Scanner sc = new Scanner(System.in);
//		int 배열에 담는다.
//		int[] arData = new int[5];
//		int min=0, max=0;
//		출력할 메세지와 결과값 입력하고 출력한다..
//		String message = "5개의 정수를 입력하세요." , result="";
//	
//		System.out.println(message);
//		for 문을 작성한다.(입력받을 배열)
//		for(int i=0; i<arData.length; i++) {
//		배열을 입력창을 넣어준다.
//			arData[i]=sc.nextInt();
//		}
//		최댓값과 최소값 담을 변수를 선언한다.
//			min=arData[0];
//			max=arData[0];
//		if문을 작성해 max와 min의 범위를 정한다.(범위 정할 for문)
//		for(int i=1; i<arData.length;i++) {	
//			if(max<arData[i]) {
//				max=arData[i];
//			}if(min > arData[i]) {
//				min=arData[i];
//			}
//			
//		}
//		System.out.println("최대값:"+max);
//		System.out.println("최솟값:"+min);
//		
//		(다이아) 그룹문제
//		사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균구하기
//		스캐너를 생성한다.
//		Scanner sc = new Scanner(System.in);
//		입력받을 정수의 개수의 변수와 합을 구할 변수를 만든다.
//		int count =0, sum=0;
//		평균 값을 넣을 변수를 만든다.
//		double average=0.0;
//		입력할 메세지를 출력한다.
//		String message="입력할 정수의 개수를 입력하세요.", 
//				nextMessage="입력하신 숫자만큼 정수를 입력하세요.";
//		
//		System.out.println(message);
//		개수를 입력할 수 있게 해준다.
//		count=sc.nextInt();
//		System.out.println(nextMessage);
//		입력받은 정수를 저장할 배열을 선언한다.
//		int[] arData = new int[count];
//		받은 개수만큼 반복문을 돌려 배열의 입력값을 받는다.
//		for(int i=0; i<count; i++) {
//			arData[i]=sc.nextInt();
//		}
//		누적복합시켜서 합을구한다.
//		for(int i=0; i<count; i++) {
//			sum+=arData[i];
//		}
//		합을 이용해서 평균을 구한다.
//		average = (double)sum/count;
//		System.out.println(average);
		
		
//		<문자열>
//		사용자에게 입력받은 문자열 중 소문자는 모두 대문자로
//		대문자는 모두 소문자로 변경한다.
//		입력) 안녕hI!!
//		출력) 안녕Hi!!	
		Scanner sc = new Scanner(System.in);
		String message="문자열을 입력해주세요.", input = null, result="";
		
		System.out.println(message);
		
		input=sc.nextLine();
		
		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			if(c>=65&&c<=90) {
				result+=c;
			}else if(c>=97 && c<=122) {
				result+=(char)(c-32);
			}else {
				result+=c;
			}
		}
		System.out.println(result);
		
		
//		그룹문제
//		정수를 한글로 변경하기
//		ex) 입: 1024 출:일공이사
//		힌트
//		입력받은 정수를 문자열로 변경
//		어떤 배열 하나를 선언해서 한글을 담고 있어야 출력할 수 있다.
	}
}
