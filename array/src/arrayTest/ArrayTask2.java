package arrayTest;

import java.util.Scanner;

public class ArrayTask2 {
	public static void main(String[] args) {
//		(브론즈)
//		1~10까지 배열에 담고 출력
//		int[] ar= {1,2,3,4,5,6,7,8,9,10};
//		for(int i=0; i<ar.length; i++) {
//			System.out.println(ar[i]);
//		}
//		
//		int []arData = new int[10];
//		for(int i=0; i<arData.length; i++) {
//			arData[i] = i+1;
//			System.out.print(arData[i]);
//		}
//		
//		1~100까지 배열에 담은 후 홀수만 출력
//		int []arData2 = new int[100];
//		for(int i=0; i<arData2.length; i+=2) {
//			arData2[i] += i+1;
//			System.out.println(arData2[i]);
//		}
//		for(int i=0; i<arData2.length; i+=2) {
//		arData2[i] += i+1;
//		if(i%2==1) {continue}
//		System.out.println(ardata2[i]);
		
//		(실버)
//		1~100까지 배열에 담은 후 짝수의 합을 출력 //if(i%2!=0){sum +=arData[i]}
//		int[] ar= new int[100];
//		int sum = 0;
//		
//		for(int i=0; i<ar.length; i+=2) {
//			ar[i] = i+2;
//			sum += ar[i];
//		}
//		System.out.println(sum);
//		
//		A~F까지 배열에 담고 출력
//		int[] arData1 = new int [6];                	//char[] arData=new char[6];
//		for(int i=0; i<arData1.length;i++) {			//(char)(65+i)
//			arData1[i] = i+'A';
//			System.out.print((char) arData1[i]);
//		}
//		A~F까지 중 C를 제외하고 배열에 담은 후 출력
//		int[] arData2 = new int [5];
//		for(int i=0; i<arData2.length; i++) {
//			arData2[i]= i+'A';
//			System.out.print((char)((i<2 ? 65:66)+i));
//		}
 //		(골드)
//		5개의 정수를 입력 받고 배열에 담은 후 최대값과 최소값을 출력
//		Scanner sc = new Scanner(System.in);
//		int min = 0 , max = 0;
//		int[] arData3 = new int [5];
//		String message ="5개의 정수를 입력해주세요." , exampleMessage = "ex) 1 3 5 7 9";
//		
//		System.out.println(message);
//		System.out.println(exampleMessage);
////		int choice= num=sc.nextInt();
//		
//		for(int i=0; i<arData3.length; i++) {
//			arData3[i]=sc.nextInt();
//		}
//		
//		max =arData3[0];
//		min =arData3[0];
//		
//		for(int i=1; i<arData3.length; i++) {
//			if(max < arData3[i]) {max=arData3[i];}
//			if(min > arData3[i]) {min=arData3[i];}
//		}
//		System.out.println("최솟값:"+min);
//		System.out.println("최대값:"+max);
		
//		(다이아) 그룹문제
//		사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균구하기
//		Scanner sc = new Scanner(System.in);
//		int[] arData3 = null;
//		int count = 0;
//		String cmessage ="입력할 정수의 개수를 입력하세요.";
//		String message ="정수를 입력해주세요." , exampleMessage = "ex) 1 3 5 7 9...";
//		System.out.println(cmessage);
//		count =sc.nextInt();
//		
//		
//		System.out.println(message);
//		System.out.println(exampleMessage);
//		arData3 = new int[count];
//		
//		for(int i=0; i< count; i++) {
//			arData3[i] = sc.nextInt();
//			System.out.print(arData3[i]);
//			
//	      (다이아)
//	      사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고
//	      평균 구하기
	      Scanner sc = new Scanner(System.in);
	      int[] arData = null;
	      String message1 = "정수의 개수를 입력하세요.", message2 = "번 째 정수";
	      int length = 0, total = 0;
	      double average = 0.0;
	      
	      System.out.println(message1);
	      
	      length = sc.nextInt();
	      arData = new int[length];
	      
	      for(int i = 0; i < arData.length; i++) {
	         System.out.println(i+1+message2);
	         arData[i] = sc.nextInt();
	      }
	      
	      for(int i = 0; i < arData.length; i++) {
	         total += arData[i];
	      }
	      
	      average = (double)total/length;
	      
	      System.out.print("[");
	      for(int i = 0; i < arData.length; i++) {
	         System.out.print(arData[i]);
	         if(i != length) {
	            System.out.print(" ");
	         }
	      }
	      System.out.println("]");
	      System.out.println("평균 :" + average);
	      
	      
	      
	      
	      
	      
	   
	
					

		
		
		
		
		
		
		
	}
}
