package classCastingPractice;

public class Player {
	private String nickName;
	private String job;
	private int AttackDamage;
	private int hp;
	
	public Player() {;}

	public Player(String nickName, String job, int attackDamage, int hp) {
		super();
		this.nickName = nickName;
		this.job = job;
		AttackDamage = attackDamage;
		this.hp = hp;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAttackDamage() {
		return AttackDamage;
	}

	public void setAttackDamage(int attackDamage) {
		AttackDamage = attackDamage;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	void hunt(Monster1 monster) {
		if(monster instanceof Oak2) {
			Oak2 o = (Oak2)monster;
			o.hit();
			System.out.println(nickName + "이 공격당하고 있습니다. 공격하세요!");
			o.die();
			System.out.println(nickName + "이 사냥에 성공했습니다!");
			o.dropItem();
		}else if(monster instanceof Human2) {
			Human2 h = (Human2)monster;
			h.hit();
			System.out.println(nickName + "이 공격당하고 있습니다. 공격하세요!");
			h.die();
			System.out.println(nickName + "이 사냥에 성공했습니다!");
			h.dropItem();
		}
	}




}
