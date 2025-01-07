package classCastingTask2;

public class Oak extends Monster{
	
	String option;
	public Oak() {;}
	
	public Oak(int hp, String live, String weapon, String option) {
		super(hp, live, weapon);
		this.option = option;
	}


	@Override
	void getItem(){
		System.out.println("오크의 가죽을 얻었습니다.");
	}
	@Override
	void hit() {
		System.out.println("오크가 공격합니다.");
	}
	@Override
	void die() {
		System.out.println("오크를 쓰러트렸습니다.");
	}
	
}
