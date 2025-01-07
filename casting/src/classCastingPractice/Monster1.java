package classCastingPractice;

public class Monster1 {
	private String name;
	private int hp;
	private String weapon;
	private String option;
	
	public Monster1() {;}

	public Monster1(String name, int hp, String weapon, String option) {
		super();
		this.name = name;
		this.hp = hp;
		this.weapon = weapon;
		this.option = option;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}
	
	void dropItem() {
		System.out.println("몬스터가 아이템을 떨궜습니다.");
	}
	
	void hit() {
		System.out.println("몬스터가 공격합니다.");
	}

	void die() {
		System.out.println("몬스터가 쓰러졌습니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
