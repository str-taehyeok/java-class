package markerTest;

public class Lab {
	public void checkKinds(Animal[] animal) {
		
		for(int i=0; i < animal.length; i++) {
			if(animal[i] instanceof CarnivoreMarker) {
				System.out.println("육식 동물입니다.");
			}else if(animal[i] instanceof HerbivoreMarker) {
				System.out.println("초식 동물입니다.");
			}else {
				System.out.println("잡식 동물입니다.");
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		Lab lab = new Lab();
		lab.checkKinds(new Animal[]{new Tiger(),new Cow(),new Bear(), new Dog()}); // 실행되는거 보니 인터페이스는 타입이다.
		
		
		
	}
	
	
	
	
}
