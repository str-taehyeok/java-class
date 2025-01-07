package classCastingPractice;

public class CastingPractice {
//	캐릭터 hunt()

//	몬스터(부모) 오크, 요정, 휴먼
//	오크의 가족을 얻었습니다.
//	요정의 날개를 얻었습니다.
//	휴면의 갑옷을 얻었습니다.
//	String name, int hp, String weapon, String option, String explain
	public static void main(String[] args) {
		Player kth = new Player("김태혁","전사", 80,100);
		Oak2  oak = new Oak2("오크", 50, "방망이", "방망이 휘두르기", "못생김");
		Human2 human = new Human2("인간1", 40, "도끼", "내려찍기","뛰어다님");
		
		Monster1[] monsters = {oak,human};
		for(Monster1 monster:monsters) {
			kth.hunt(monster);
		}
		
		
		
	}
}
