package classCastingTask2;

//	캐릭터 hunt()

//	몬스터(부모) 오크, 요정, 휴먼
//	오크의 가족을 얻었습니다.
//	요정의 날개를 얻었습니다.
//	휴면의 갑옷을 얻었습니다.


public class CastingTask2 {
	public static void main(String[] args) {
		Character player1 = new Character("김태혁",27,"전사",30);
		Fairy fairy = new Fairy(30, "조용한 습지", "지팡이","침뱉기");
		Oak oak = new Oak();
		Human human = new Human();
		
//		빠른 for문, 향상된 for문, forEach,...
//		for(타입변수: 순서가 있는객체)[]
		
		Monster[] monsters= {fairy,oak,human};
		for(Monster monster: monsters) {
			player1.hunt(monster);
		}
		
//		for(int i=0; i<monsters.length; i++) {
//			player1.hunt(monsters[i]);
//		}
		
		
		
	}
}
