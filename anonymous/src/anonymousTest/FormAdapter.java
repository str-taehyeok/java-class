		package anonymousTest;
//	form 인터페이스에 있는 추상메서드를 안쓰고 싶으니 Form에다가 어댑터를 단다.
public abstract class FormAdapter implements Form{

	@Override
	public void sell(String menu) {;}

}
