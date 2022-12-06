package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.project.commend.MemberSelectAgeDo;
import org.project.dboconnect.*;
import org.project.dto.MemberDto;

import org.project.dao.MemberDao;

import org.project.dao.MemberDao;

import org.project.dto.MemberDto;
import org.project.dto.MemberDto;


public class MemberDao {

	public MemberDao() {
		System.out.println("기본생성자");
	}
	
	//회원가입
	public int insertDo(String userId,String userPw, int age, String email) {
		int result = 0;
		
		Connection conn = null;	//DB연동
		PreparedStatement pstm = null;	//SQL처리
		String query="";	//쿼리문
		
		try {
			// 1. DB연동 // 1-1 드라이버찾기 // 1-2 DB연결
			conn =DBConnect.getConnection();	//connect null > 연결X
			query="insert into member1(userId,userPw,age,email) values(?,?,?,?)";
			// 2. SQL 실행
			pstm=conn.prepareStatement(query);// DB 연동 쿼리 실행
			// DB table insert
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setInt(3, age);
			pstm.setString(4, email);
			
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
		
		//회원조회
	
public List<MemberDto> selectDo(){
		
		List<org.project.dto.MemberDto> lists = new ArrayList<org.project.dto.MemberDto>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;	//DB데이터를 저장하는 객체
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "select * from member1 ";
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
					String email = rs.getString(4);
				
					lists.add(new org.project.dto.MemberDto(userId, userPw, age,email));
				}
			}
			
		} catch (SQLException e) {
			
		}
		
		return lists;
		
	}
	
	
	
	
		//회원수정
		
public int updateDo(String userId,String userPw, int age, String email) {

	int result =0;

	Connection conn = null;	//DB연동
	PreparedStatement pstm = null;	//SQL처리
	String query="";	//쿼리문

	try {
		conn = DBConnect.getConnection();
		query = "update member1 set userPw=?, age=?,email=? where userId=?";
		pstm=conn.prepareStatement(query);
	

		pstm.setString(1, userPw);
		pstm.setInt(2, age);
		pstm.setString(3, email);
		pstm.setString(4, userId);
		
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
	
	
	
	
		
		
		//회원삭제
		public int deleteDo(String userId) {
			int result = 0;
			
			Connection conn = null;	//DB연동
			PreparedStatement pstm = null;	//SQL처리
			String query="";	//쿼리문
			
			try {
				conn=org.project.dboconnect.DBConnect.getConnection();
				query = "delete from member1 where userId = ?";
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
		
		//회원 나이 조회
		public List<MemberDto> selectAge(int ageStart,int ageEnd) {
			
			List<MemberDto> members = new ArrayList<MemberDto>();
			
			Connection conn = null;
			PreparedStatement pstm = null;
			ResultSet rs = null;	
			String query = "";

			
			try {
				conn = DBConnect.getConnection();
				query = "select * from member1 where age >= ? and age < ?";
				pstm = conn.prepareStatement(query);

				pstm.setInt(1, ageStart);
				pstm.setInt(2, ageEnd);
				
				rs = pstm.executeQuery();	
	
				if(rs != null) {
					
					while(rs.next()) {
						
						String userId = rs.getString(1);
						String userPw = rs.getString(2);
						int age = rs.getInt(3);
						String email = rs.getString(4);

						members.add(new MemberDto(userId, userPw, age, email));
						

					}
				}
				
			} catch (SQLException e) {
				System.out.println("실패");
				e.printStackTrace();

			}
			
			return members;
			


		}
		
	
}
