package interfaceTest;

public class Cat implements Pet{

	@Override
	public void sitDown() {
		System.out.println("앉지 않는다.");
	}

	@Override
	public void waitNow() {
		System.out.println("무시한다.");
	}

	@Override
	public void poop() {
		System.out.println("변기에 물도 내린다.");
	}
}
