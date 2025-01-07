package anonymousTest;

public class Starbucks {
//	register라는 메서드로 form을 불러와 getMenus 추상메서드를 가져옴
	public void register(Form form) {
		String[] menu = form.getMenus();
//		메뉴 만든만큼 1. 메뉴 만들기
		for(int i=0; i< menu.length; i++) {
			System.out.println(i + 1 + "." + menu[i]);
		}
		
//		스타벅스가 판매 지점을 검토해서
//		무료나눔 행사 중이라면 "무료나눔 행사 승인" 출력
//		무료나눔 행사 중이 아니라면, 판매
//		if else로 upcasting 되어 있는 (Form (form))이랑 Form이랑 타입 비교해서 맞으면 강남점
//		FormAdpater랑 타입이 맞으면 잠실점이니 아래와 같이 출력한다.
//		위의 register에 form을 넣을 값으로 입력했으니 form의 타입과 어댑터 타입이 맞는지 검사
		if(form instanceof FormAdapter) {
			System.out.println("무료나눔 행사 승인");
		}else if(form instanceof Form){
			form.sell("아메리카노");
		}else {
			System.out.println("다른 지점!");
		}
		
	}
}
