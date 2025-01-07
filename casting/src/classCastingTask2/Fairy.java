package classCastingTask2;

public class Fairy extends Monster{
	
	String skill;
	public Fairy() {;}
	
	public Fairy(int hp, String live, String weapon, String skill) {
		super(hp, live, weapon);
		this.skill = skill;
	}
	@Override
	void getItem(){
		System.out.println("요정의 날개를 얻었습니다.");
	}
	@Override
	void hit() {
		System.out.println("요정이 공격합니다.");
	}
	@Override
	void die() {
		System.out.println("요정을 쓰러트렸습니다.");
	}
	




}




