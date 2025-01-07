package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.MemberVO;

public class MemberDAO {
//	1. 연결
	Connection connection;
	
//	2. 쿼리 실행
	PreparedStatement preparedStatement;

//	3. 결과
	ResultSet resultSet;
	
//	로그인시 고용 저장소 세션(서버쪽 임시)
	public static Long session;
	
//	아이디 중복검사
	public boolean checkId(String memberId) {
		connection = DBConnecter.getConnect();
		String query = "SELECT ID FROM TBL_MEMBER"
				+ " WHERE MEMBER_ID = ?";
		boolean check = false;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberId);

//			결과값이 있을 때
			resultSet = preparedStatement.executeQuery();
			resultSet.next();
			resultSet.getLong(1);
			
		} catch (SQLException e) {
//			못찾으면 오류
			check = true;
			System.out.println("checkId query 오류");
			e.printStackTrace();
		} finally {
			try {
				
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("checkId query 종료시 오류");
				e.printStackTrace();
			}
		}
		return check;
	}
	
	
	
	
//	회원가입
	public void join(MemberVO memberVO) {
		connection = DBConnecter.getConnect();
		String query = "INSERT INTO TBL_MEMBER"
				+ "(ID, MEMBER_ID, MEMBER_PASSWORD, MEMBER_NAME, MEMBER_ADDRESS) "
				+ "VALUES(MEMBER_SEQ.NEXTVAL, ?, ?, ?, ?)";
		
		try {
//			쿼리를 보낼 준비
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemberId());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			preparedStatement.setString(3, memberVO.getMemberName());
			preparedStatement.setString(4, memberVO.getMemberAddress());
			
//			결과값이 없다.
			preparedStatement.executeUpdate();
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("join query 종료시 오류");
				e.printStackTrace();
			}
		}
	}
//	로그인
//	아이디-> 비밀번호 DB랑 검사
//	결과가 있고 ID
	public boolean login(MemberVO memberVO) {
		connection = DBConnecter.getConnect();
		String query = "SELECT ID FROM TBL_MEMBER"
				+ " WHERE MEMBER_ID = ? AND MEMBER_PASSWORD = ?";
		
		boolean check = true;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemberId());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			
			resultSet = preparedStatement.executeQuery();
			resultSet.next();
			session = resultSet.getLong(1);
		
		
		} catch (SQLException e) {
			check = false;
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("login query 종료시 오류");
				e.printStackTrace();
			}
		}
		return check;
		
	}
//	마이페이지
	public MemberVO findById() {
		connection = DBConnecter.getConnect();
		String query = "SELECT ID, MEMBER_ID, MEMBER_PASSWORD,"
				+ " MEMBER_NAME, MEMBER_ADDRESS, RECOMMENDER_ID"
				+ " FROM TBL_MEMBER WHERE ID = ?";
		MemberVO memberVO = new MemberVO();
		
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, session);
		
			resultSet = preparedStatement.executeQuery();
			resultSet.next();
			
			memberVO.setId(resultSet.getLong(1));
			memberVO.setMemberId(resultSet.getString(2));
			memberVO.setMemberPassword(resultSet.getString(3));
			memberVO.setMemberName(resultSet.getString(4));
			memberVO.setMemberAddress(resultSet.getString(5));
			memberVO.setRecommenderId(resultSet.getString(6));
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("findById query 종료시 오류");
				e.printStackTrace();
			}
		}
		return memberVO;
	}
	
	
//	로그아웃
	public void logout() {
		session = null;
	}
	
//	정보수정
	public void update(MemberVO memberVO) {
		connection = DBConnecter.getConnect();
		String query = "UPDATE TBL_MEMBER "
				+ "SET MEMBER_ID = ?, MEMBER_PASSWORD = ?, MEMBER_NAME = ?, MEMBER_ADDRESS = ? "
				+ "WHERE ID = ?;";
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemberId());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			preparedStatement.setString(3, memberVO.getMemberName());
			preparedStatement.setString(4, memberVO.getMemberAddress());
			preparedStatement.setLong(5, session);
		
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("update query 종료시 오류");
				e.printStackTrace();
			}
		}
		
	}
	
	
//	비밀번호 변경
//	1. 비밀번호 찾기
	public void findPassword(MemberVO memberVO) {
		connection = DBConnecter.getConnect();
		String query = "UPDATE TBL_MEMBER SET MEMBER_PASSWORD = ? "
				+ "WHERE MEMBER_ID = ?";
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemberPassword());
			preparedStatement.setString(2, memberVO.getMemberId());
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("findPassword query 종료시 오류");
				e.printStackTrace();
			} 
		}
		
	}
	
//	2. 새로운 비밀번호 변경
	public void updatePassword(String memberPassword) {
		connection = DBConnecter.getConnect();
		String query = "SELECT ID FROM TBL_MEMBER"
				+ " WHERE MEMBER_ID = ?, AND MEMBER_PASSWORD = ?;";
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, session);
			preparedStatement.setString(2, memberPassword);
			
			resultSet = preparedStatement.executeQuery();
			resultSet.next();
			resultSet.getLong(1);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("updatePassword query 종료시 오류");
				e.printStackTrace();
			}
		}
		
		
	}
	
//	3. 로그인 하고 나서 수정
	public void changePassword(String memberPassword) {
		connection = DBConnecter.getConnect();
		String query = "UPDATE TBL_MEMBER "
				+ "SET MEMBER_PASSWORD = ? "
				+ "WHERE ID = ?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberPassword);
			preparedStatement.setLong(2, session);
			preparedStatement.executeUpdate();
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("changePassword query 종료시 오류");
				e.printStackTrace();
			}
		}
		
	}
	
//	회원탈퇴
	public void delete(MemberVO memberVO) {
		connection = DBConnecter.getConnect();
		String query = "DELETE FROM TBL_MEMBER WHERE ID = ?";
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, session);	
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("delete query 종료시 오류");
				e.printStackTrace();
			} 
		}
		
	}
	
//	추천수
	public int getCountOfRecommeder(String memberId) {
		connection = DBConnecter.getConnect();
		String query = "SELECT COUNT(ID) FROM TBL_MEMBER "
				+ "WHERE RECOMMENDER_ID = ?";
		int recommenderCount = 0;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberId);
			resultSet = preparedStatement.executeQuery();
			resultSet.next();
			recommenderCount = resultSet.getInt(1);
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("getCountOfRecommeder query 종료시 오류");
				e.printStackTrace();
			}
		}
		return recommenderCount;
	}
	
//	나를 추천한 사람
	public ArrayList<MemberVO> getRecommender() {
		connection = DBConnecter.getConnect();
		String query = "SELECT ID, MEMBER_ID,MEMBER_PASSWORD, MEMBER_NAME, MEMBER_ADDRESS "
				+ "FROM TBL_MEMBER "
				+ "WHERE RCOMMENDER_ID = (SELECT MEMBER_ID FROM TBL_MEMBER WHERE ID = ?)";

		ArrayList<MemberVO> members = new ArrayList<>();
		MemberVO memberVO = new MemberVO();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, session);
	
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				memberVO.setId(resultSet.getLong(1));
				memberVO.setMemberId(resultSet.getString(2));
				memberVO.setMemberPassword(resultSet.getString(3));
				memberVO.setMemberName(resultSet.getString(4));
				memberVO.setMemberAddress(resultSet.getString(5));

//				memberVO.setId(resultSet.getLong("ID"));
//				memberVO.setMemberId(resultSet.getString("MEMBER_ID"));
//				memberVO.setMemberPassword(resultSet.getString("MEMBER_PASSWORD"));
//				memberVO.setMemberName(resultSet.getString("MEMBER_NAME"));
//				memberVO.setMemberAddress(resultSet.getString("MEMBER_ADDRESS"));
			
				members.add(memberVO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("getRecommender query 종료시 오류");
				e.printStackTrace();
			}
		}
		return members;
	}
	
//	내가 추천한 사람
//	recommender_id == "나"
	public MemberVO getMyRecommender() {
		connection = DBConnecter.getConnect();
		String query = "SELECT ID, MEMBER_ID, MEMBER_PASSWORD,MEMBER_NAME,MEMBER_ADDRESS, RECOMMENDER_ID"
				+ " FROM TBL_MEMBER "
				+"WHERE MEMBER_ID = (SELECT RECOMMENDER_ID FROM TBL_MEMBER WHERE ID = ?)";
		
		MemberVO memberVO = new MemberVO();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, session);

			resultSet = preparedStatement.executeQuery();
			resultSet.next();
			
			memberVO.setId(resultSet.getLong(1));
			memberVO.setMemberId(resultSet.getString(2));
			memberVO.setMemberPassword(resultSet.getString(3));
			memberVO.setMemberName(resultSet.getString(4));
			memberVO.setMemberAddress(resultSet.getString(5));

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("getMyRecommender query 종료시 오류");
				e.printStackTrace();
			}
		}
		return memberVO;
		
		
		
	}

	
}
