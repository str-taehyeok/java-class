package anonymousTest;

public class Building {
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks(); // 강남점 오픈해서 스타벅스에서 만든 양식 오버라이드 등록
		gangnam.register(new Form() {//-> 구현이 안됐으니 인터페이스로 하는거임 form
			
			@Override
			public String[] getMenus() { //->메뉴를 담는다.
				return new String[] {"아메리카노", "카페라떼", "에이드","디카페인"};
			}

			@Override
			public void sell(String menu) { // 판매메서드 가져와서 메뉴를 배열에 담고 판매 메서드 만듬
				String[] menus = getMenus();
				for(int i=0; i<menus.length; i++) {
					if(menus[i].equals(menu)) {
						System.out.println(menus[i] + "판매 완료");
						break;
					}
				}
				
			}
			
		});
//		실습 
//		잠실점 오픈
//		무료나눔 행사중
//		잠실점 오픈해서 form은 한번만 쓰는거기 때문에 Form이 아닌 FormAdapter(타입)을 넣으면 된다.
		Starbucks jamsil = new Starbucks ();
		jamsil.register(new FormAdapter() {
//		FormAdpater 추상클래스에 Form에서 쓰고 싶지 않은 메서드의 강제성을 제거하고 어댑터 클래스로 익명클래스를 연다.
			@Override
			public String[] getMenus() {
				return  new String[] {"아메리카노", "아이스티", "홍차","디카페인"};
			}
		});
		
		
	}
}
