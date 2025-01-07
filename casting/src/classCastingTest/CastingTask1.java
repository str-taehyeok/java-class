package classCastingTest;

// 넷플릭스 구현
//	애니메이션, 영화, 드라마 클래스를 선언
//	사용자가 선택한 영상이 애니메이션이라면"자막지원기능 사용" 출력
//	영화라면"4D기능 사용"출력
//	드라마라면 "굿즈 기능 사용" 출력



public class CastingTask1 {

	void checkVideo(Video video) {
		if(video instanceof Drama) {
			Drama drama = (Drama)video;
			drama.useGoods();
		}else if(video instanceof Movie) {
			Movie mv = (Movie)video;
			mv.use4D();
		}else if(video instanceof Animation) {
			Animation ani = (Animation)video;
			ani.showSubtitle();
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
//	각각 클래스(애니,영화,드라마) 마다 객체화를 시키고, 
//	checkVideo로 확인!
		CastingTask1 c1 = new CastingTask1();
		c1.checkVideo(new Drama());
		c1.checkVideo(new Movie());
		c1.checkVideo(new Animation());
	
	
	
	}
}
