package classTest;

public class ClassTask4 {

//	필드없음
	public ClassTask4() {;}
	
//	최소값과 최대값을 구해주는 메서드 구현
//	return type은 Result타입이다.
	Result getMaxAndMin(int[] arData) {
		Result result = new Result(arData[0], arData[0]);
		
//		arData[0]=result.max;  -> new Result(); 안에 초기값을 넣을 수 있는 안써도 됨
//		arData[0]=result.min; 
		for(int i=1; i<arData.length;i++) {
			if(result.max < arData[i]) {
			result.max = arData[i];
			}if(result.min > arData[i]) {
			result.min = arData[i];
			}
		}
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
//		객체화 시킨다.
		ClassTask4 c4 = new ClassTask4();
//	5개의 정수의 값 : 5, 6, 8, 2, 7
		int[] arData= {5, 6, 8, 2, 7};
//		객체화 시킨다.
		Result rs = c4.getMaxAndMin(arData);
		
//	해당 메서드를 사용하면 최소값과 최대값을 구해준다.
		System.out.println(rs.max);
		System.out.println(rs.min);
		
//	ardata는 5개의 정수를 가지고 있는 배열이다.
	
		
		
	}
}




