package controlStatement;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		for (int i=0; i<=100; i++) {
			if (!(i%2==0)) {
				continue;
			} 
			System.out.println(i);
		}	
		//		(브론즈)
//		1~100까지 출력
//		100~1까지 출력
//	 	1~100까지 짝수만 출력
//		
//		for(int i=0; i<100; i++) {
//			System.out.println(i+1);
//		}
//		for(int i=0; i<100; i++) {
//			System.out.println(100-i);
//		}
//		for(int i=0; i<50; i++) {
//			System.out.println(100-i);} //i % 2==0
//		
//		for(int i=0; i<=100; i+=2) {
//				System.out.println(i);} 
//		
//		for(int i=0; i<=100; i++) {
//			if(!(i % 2==0)) {
//				continue;
//			}
//					System.out.println(i); 
//		}
//		(골드) 1~10까지 합
		//합을 담을 변수가 필요하다.
//		int sum = 0;
//		//10번을 반복한다.(for문)
//		for(int i = 0; i<10; i++) {
//			//반복을 돌려서 변수에 누적합한다.
//			sum+=i+1; // sum=sum+i
//		}
//		//출력한다.
//		System.out.println(sum);

		
	
//  (골드)
//  1~n까지 합을 출력
//  ex) 사용자가 15를 입력하면 1~15까지 합을 출력
		Scanner sc = new Scanner(System.in);
		
//		int num = 0;
//		int sum = 0;
//		String message="1~n까지의 합";
//		System.out.println(message);
//		
//		num=sc.nextInt();
//		
//		for(int i=0; i<=num; i++) {
//			sum +=i;
//		}
//		System.out.println(sum);	
			
//  (플레티넘)
//  A ~ F까지 출력
//  A ~ F까지 C를 제외하고 출력, if문은 사용불가
//		char a='A';
//		
//		for(int i=0; i<6; i++) {
//			System.out.println((char)(a+i));
//		}
		
		
//		for(int i=0; i<5; i++) {
//			System.out.print((char)((i>1 ? 66:65)+i));
//		}
//		
//  (다이아)
//  012340123401234 출력 (%)
//  aBcDeF...Z출력
//		int result = 0;
//		
//		for(int i=0; i<15; i++ ) {
//			System.out.print(i%5);
//		}
		
		for(int i=0; i<26; i++) {
			System.out.print((char)((i%2==0 ?97:65)+i)) ; 
			}
//		
//  (마스터)
//    *
//   ***
//  *****
// *******
//*********
//		for (int i = 0; i < 10; i+=2) {
//		      for(int j = 10; j > i; j-=2) {
//		         System.out.print(" ");
//		      
//		      }
//		      for(int k = 1; k < i; k++) {
//		         System.out.print("*");
//		         
//		      }
//		      System.out.println("\n");
//		   }
		
	}
}


