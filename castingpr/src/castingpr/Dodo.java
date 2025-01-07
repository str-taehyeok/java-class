package castingpr;

public class Dodo {
	public static void main(String[] args) {
		Mom m = new Mom();
		Mom m1 = new Son();
		Mom m2 = new Daughter();
		// -> upcasting
		Son s = (Son)m;
	}
}
