package interfaceTest3;

public class MovieLab {	
//	모든 영화는 Movie의 자식이다.
//	checkKinds 구성
//	markerInterface를 이용ㅇ해서 각 분류마다 분류한다.
//	부모로 한 번에 매개변수로 받는다(업 캐스팅)
//	각자 가지고 있는 메서드를(다운캐스팅) 출력
//	마커인터페이스는 이름뒤에 Marker를 붙인다.
	void checkKinds(Movie[] movies) {
		
		for(int i=0; i<movies.length;i++) {
			if(movies[i] instanceof FantasyMarker) {
				Doom d = (Doom)movies[i];
				d.inFantasy();
			}else if(movies[i] instanceof ActionMarker) {
				if(movies[i] instanceof SpiderMan) {
					SpiderMan sm = (SpiderMan)movies[i];
					sm.fly();
					}else {
						CityOfCrime coc = (CityOfCrime)movies[i];
						coc.cry();
					}
			}else if(movies[i] instanceof HorrorMarker) {
				It it = (It)movies[i];
				it.shake();
			}else if(movies[i] instanceof RomanceMarker) {
				BeforeSunrise bs = (BeforeSunrise)movies[i];
				bs.tearsShower();
			}else if(movies[i] instanceof KidsMarker) {
				TinyPing tp = (TinyPing)movies[i];
				tp.broke();
			}else {
				System.out.println("다른 영화");
			}
			
		}
			
	}
	
	
	public static void main(String[] args) {
		MovieLab movie = new MovieLab();
		
		movie.checkKinds(new Movie[]{new Doom(), new SpiderMan(), new It(), new CityOfCrime(),
				new BeforeSunrise(), new TinyPing()});
		
		
	}
	
}
	
	
	
	
	
	
	
	
	

