package classCastingPractice;

public class Human2 extends Monster1{
	String explain;
	String weapon;
	
	public Human2() {;}

	public Human2(String name, int hp, String weapon, String option, String explain) {
		super(name, hp, weapon, option);
		this.weapon = weapon;
		this.explain = explain;
	}

	public String getExplain() {
		return explain;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}
	
	@Override
	void dropItem() {
		System.out.println("사람의 이름을 얻었습니다.");
	}
	@Override
	void hit() {
		System.out.println("인간이 "+this.weapon+"로 공격합니다.");
	}
	@Override
	void die() {
		System.out.println("인간이 쓰러졌습니다.");
	}



}
