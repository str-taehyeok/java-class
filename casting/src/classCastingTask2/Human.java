package classCastingTask2;

public class Human extends Monster{
	String message;
	public Human() {;}
	
	public Human(int hp, String live, String weapon,String message) {
		super(hp,live,weapon);
		this.message = message;
	}



	@Override
	void getItem(){
		System.out.println("휴먼의 갑옷을 얻었습니다.");
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
