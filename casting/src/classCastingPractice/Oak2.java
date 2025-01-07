package classCastingPractice;

public class Oak2 extends Monster1{
	String explain;
	String weapon;
	
	public Oak2() {;}

	public Oak2(String name, int hp, String weapon, String option, String explain) {
		super(name ,hp, weapon, option);
//		this.weapon = weapon; //-> 여기서 초기화 해야지 되는건가요
		this.explain = explain;
	}
	
	@Override
	void dropItem() {
		System.out.println("오크의 가죽을 얻었습니다.");
	}
	@Override
	void hit() {
		System.out.println("오크가 "+ super.getWeapon() +"로 공격합니다.");
	}
	@Override
	void die() {
		System.out.println("오크가 쓰러졌습니다.");
	}
}
