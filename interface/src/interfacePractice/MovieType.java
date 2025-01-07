package interfacePractice;

public class MovieType {
	void checkGenre(Movies[] mv) {
		for(int i=0; i<mv.length; i++) {
			if(mv[i] instanceof Action1Marker) {
				if(mv[i] instanceof IronMan) {
					IronMan ir = (IronMan)mv[i];
					ir.act();
				}else {
					Taken t = (Taken)mv[i];
					t.protect();
				}
			}else if(mv[i] instanceof AnimationMarker){
				InsideOut io = (InsideOut)mv[i];
				io.emotion();
			}else if(mv[i] instanceof MusicalDramaMarker) {
				ShowMan sm = (ShowMan)mv[i];
				sm.vivid();
			}else if(mv[i] instanceof Romance1Marker) {
				LalaLand land = (LalaLand)mv[i];
				land.love();
			}else if(mv[i] instanceof HorrorMarker){
				Anabell ab = (Anabell)mv[i];
				ab.tremble();
			}else {
				System.out.println("다른 영화");
			}
		}
	}	
		public static void main(String[] args) {
			MovieType mt = new MovieType();
			
			mt.checkGenre(new Movies[] {new IronMan(), new Taken(), new InsideOut(), new ShowMan(), new LalaLand(),
					new Anabell()});
		}
		
		
		
		
		
		
	
}
	
	
	
	
	
	
	
	

