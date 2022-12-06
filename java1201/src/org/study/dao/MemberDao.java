package org.study.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.study.dbconnect.DBConnect;
import org.study.dto.MemberDto;

public class MemberDao {

	public MemberDao() {
		System.out.println("Dao");
	}

	
	public int insertDo(String userId, String userPw, int age) {
		System.out.println("아이디 : "+userId+", 비밀번호 : "+userPw+", 나이 : "+age);
		int result =0;

		Connection conn = null;	//DB연동
		PreparedStatement pstm = null;	//SQL처리
		String query="";	//쿼리문
		
		try {
			// 1. DB연동 // 1-1 드라이버찾기 // 1-2 DB연결
			conn = DBConnect.getConnection();	//connect null > 연결X
			query="insert into member(userId,userPw,age) values(?,?,?)";
			// 2. SQL 실행
			pstm=conn.prepareStatement(query);// DB 연동 쿼리 실행
			// DB table insert
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setInt(3, age);
			//3. 실행, 결과 반환
			result = pstm.executeUpdate();	//성공 1, 실패 나머지
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
				try {
					if(conn != null) conn.close();
					if(pstm != null) pstm.close();
				} catch (Exception e) {
				}finally {		}
		}
		return result;
	}
	
	//회원조회 return 객체(DTO), null

	public ArrayList<MemberDto> selectDo(){
		
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;	//DB데이터를 저장하는 객체
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "select * from member ";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();	//DB데이터를 저장
			// DB데이터가 없으면 null
			
			if(rs!=null) {
				//DB데이터가 있으면
				while(rs.next()) {
					//레코드1 get
					String userId =rs.getString(1);	//rs.getString("userId); 와같음 1열에 있는것 가져옴
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
				
					lists.add(new MemberDto(userId, userPw, age));
				}
			}
			
		} catch (SQLException e) {
			
		}
		
		return lists;
		
	}
		
	
	//회원수정 return 정수 1(성공)
	
	public int updateDo(String userId,String userPw, int age) {

		int result =0;

		Connection conn = null;	//DB연동
		PreparedStatement pstm = null;	//SQL처리
		String query="";	//쿼리문

		try {
			conn = DBConnect.getConnection();
			query = "update member set userPw=?, age=? where userId=?";
			pstm=conn.prepareStatement(query);
		

			pstm.setString(1, userPw);
			pstm.setInt(2, age);
			pstm.setString(3, userId);
			
			result = pstm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstm != null) pstm.close();
			} catch (Exception e) {
			}finally {		}
	}
	return result;
		
		
	}


	//회원탈퇴 return 정수 1(성공)
	
	public int deleteDo(String userId) {
		int result = 0;

		Connection conn = null;	//DB연동
		PreparedStatement pstm = null;	//SQL처리
		String query="";	//쿼리문
		
		try {
			conn=DBConnect.getConnection();
			query = "delete from member where userId = ?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);

			result = pstm.executeUpdate();
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) conn.close();
				if(pstm!=null) pstm.close();
			} catch (SQLException e) {
			} finally {
				
			}
		}
		return result;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
