package view;

import dao.MemberDAO;
import vo.MemberVO;

public class View {
	public static void main(String[] args) {
		
		MemberDAO memberDAO = new MemberDAO();
		MemberVO memberVO = new MemberVO();
		
//		MEMBER_ID, MEBER_PASSWORD, MEMBER_NAME, MEMBER_ADDRESS
//		"italy2004" , "1234", "김태혁", "경기도 수원시"
//		객체화된 데이터에 임의 데이터를 삽입 후 join 메서드 실행
		memberVO.setMemberId("italy2004");
		memberVO.setMemberPassword("1234");
//		memberVO.setMemberName("김태혁");
//		memberVO.setMemberAddress("경기도 수원시");
//		System.out.println("회원가입 완료");
		
//		체크 아이디
//		if(memberDAO.checkId(memberVO.getMemberId())) {
//			
//			System.out.println("사용 가능한 아이디");
//			memberDAO.join(memberVO);
//			System.out.println("회원가입 완료");
//		
//		}else {
//			System.out.println("이미 중복된 아이디");
//		}
		
		if(memberDAO.login(memberVO)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
//		마이페이지
		System.out.println(memberDAO.findById());
		
	}
	
}
