package classCastingTask2;

public class Monster {
	private int hp;
	private String live;
	private String weapon; //경험치, 이름
	
	public Monster() {;}

	public Monster(int hp, String live, String weapon) {
		super();
		this.hp = hp;
		this.live = live;
		this.weapon = weapon;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getLive() {
		return live;
	}

	public void setLive(String live) {
		this.live = live;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	void getItem(){
		System.out.println("아이템을 떨궜습니다.");
	}
	void hit() {
		System.out.println("몬스터가 공격합니다.");
	}
	void die() {
		System.out.println("몬스터를 쓰러트렸습니다.");
	}
}
