package classCastingTask2;

public class Character {
	
	private String nickName;
	private int age;
	private String job;
	private int damage;
	
	public Character() {;}
	
	public Character(String nickName, int age, String job, int damage) {
		super();
		this.nickName = nickName;
		this.age = age;
		this.job = job;
		this.damage = damage;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	void hunt(Monster monster) {
		if(monster instanceof Oak) {
			Oak o = (Oak)monster;
			System.out.println(nickName + "플레이어가 사냥에 성공했습니다.");
			o.getItem();
		}else if(monster instanceof Fairy) {
			Fairy f = (Fairy)monster;
			System.out.println(nickName + "플레이어가 사냥에 성공했습니다.");
			f.getItem();
		}else if(monster instanceof Human){
			Human h = (Human)monster;
			System.out.println(nickName + "플레이어가 사냥에 성공했습니다.");
			h.getItem();
		}
	}
}
