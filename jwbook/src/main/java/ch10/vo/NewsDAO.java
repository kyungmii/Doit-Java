package ch10.vo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NewsDAO {
	final String JDBC_DRIVER = "org.h2.Driver";  
	final String JDBC_URL = "jdbc:h2:tcp://localhost/~/jwbookdb";
	
	public Connection open() { //open메서드 사용 -> Connection 객체를 반환  
		Connection conn = null;  //메서드 호출하여 db 연결 
		try {
			Class.forName(JDBC_DRIVER); //드라이버클래스로드 
			conn = DriverManager.getConnection(JDBC_URL, "jwbook", "0407");
		} catch (Exception e) { 
			e.printStackTrace(); // 예외발생 => 에러메시지와 StackTrace 출력(
		}
		return conn; //conn 객체 반환 되어 db연결상태 
	}
	 
	public void addNews(NewsDO n) throws Exception { //뉴스 추가 
		Connection conn = open();
		//open메서드 사용 -> Connection 객체를 반환
		String sql = "insert into news(title,img,date,content) "
				+ "values(?,?,CURRENT_TIMESTAMP(),?)";
		// sql news 테이블에 새로운 뉴스 생성 current_timestamp => 현재시간 자동 생성 
		PreparedStatement pstmt = conn.prepareStatement(sql); 
		// 객체 생성 하여 db 전달 sql문  
		
		try(conn; pstmt) {
			pstmt.setString(1, n.getTitle()); //제목
			pstmt.setString(2, n.getImg()); //이미지
			pstmt.setString(3, n.getContent()); //내용 
			pstmt.executeUpdate(); //연결문장 
		}
	}
	
	public List<NewsDO> getAll() throws Exception {   //모든뉴스 조회 
		Connection conn = open();
		List<NewsDO> newsList = new ArrayList<>(); 
	     //getAll 메서드 ->db에서newsdo 객체의 리스트로 반환 
		
		String sql = "select aid, title, "
				+ "formatdatetime(date, 'yyyy-MM-dd hh:mm:ss') "
				+ "as cdate from news" ; // sql 데이터선택 
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		try(conn; pstmt; rs) {
			while(rs.next()) {
				NewsDO n = new NewsDO();
				n.setAid(rs.getInt("aid"));
				n.setTitle(rs.getString("title"));
				n.setDate(rs.getString("cdate"));
				
				newsList.add(n);
			}
			return newsList;
		}
	}
	
	public NewsDO getNews(int aid) throws SQLException {//특정뉴스 조회 하기 
		Connection conn = open();
		
		NewsDO n = new NewsDO();
		String sql = "select aid, title, img, formatdatetime(date, 'yyyy-MM-dd hh:mm:ss') as cdate, content from news where aid=?";

		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, aid);
		ResultSet rs = pstmt.executeQuery();
		
		rs.next();
		
		try(conn; pstmt; rs) {
			n.setAid(rs.getInt("aid"));
			n.setTitle(rs.getString("title"));
			n.setImg(rs.getString("img"));
			n.setDate(rs.getString("cdate"));
			n.setContent(rs.getString("content"));
			// pstmt.executeQuery();
			return n;
		}
	}
	public void delNews(int aid) throws SQLException { //삭제 
		Connection conn = open(); 
		
		String sql = "delete from news where aid=?";   
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		try(conn; pstmt) {
			pstmt.setInt(1, aid);
			// 삭제된 뉴스 기사가 없을 경우
			if(pstmt.executeUpdate() == 0) {
				throw new SQLException("DB에러");
			}
		}
	}
}
