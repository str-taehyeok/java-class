package controlStatement;

public class BadWhile {
	public static void main(String[] args) {
		//증감식 들어가면 안됨
		int count = 0;
		while(count != 0)	System.out.println(count + "김태혁");
		count++;
	}
}
