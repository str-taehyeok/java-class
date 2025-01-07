package arrayTest;

public class ArrayTask1 {
	public static void main(String[] args) {
//	10~1까지 중 짝수만 배열에 담고 출력
//		(브론즈)
//		int[]arData = {10,8,6,4,2};
//		for(int i=0; i<arData.length; i++ ) {
//			System.out.println(arData[i]);
//		}
		
		int[]arData=new int [5];
		for(int i =0; i< arData.length; i++) {
			arData[i]=(5-i)*2;
			System.out.println(arData[i]);
		}
	}
}
