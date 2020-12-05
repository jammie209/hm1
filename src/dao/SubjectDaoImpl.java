package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.*;

import entity.Subject;

public class SubjectDaoImpl implements SubjectDao {
	
	Connection conn = (Connection) DBConn.getConn();

	
	@Override
	public boolean add(Subject subject) {
		boolean flag = false;
		
		
		try {
			String sql="insert tb_subject values('"+subject.getSubjectID()+"','"
					 +subject.getSubjectTitle()+"','"
				     +subject.getSubjectOptionA()+"','"
					 +subject.getSubjectOptionB()+"','"
					 +subject.getSubjectOptionC()+"','"
				     +subject.getSubjectOptionD()+"','"
				     +subject.getSubjectAnswer()+"','"
				     +subject.getSubjectParse()+"')";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int i = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			if(i>0) {
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}


	@Override
	public List<Subject> selectall() {
		List<Subject> list = new ArrayList<Subject>();
		try {
			String sql = "select * from tb_subject";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Subject subject = new Subject();
				subject.setSubjectID(rs.getInt("subjectID"));
				subject.setSubjectTitle(rs.getString("subjectTitle"));
				subject.setSubjectOptionA(rs.getString("subjectOptionA"));
				subject.setSubjectOptionB(rs.getString("subjectOptionB"));
				subject.setSubjectOptionC(rs.getString("subjectOptionC"));
				subject.setSubjectOptionD(rs.getString("subjectOptionD"));
				subject.setSubjectAnswer(rs.getString("subjectAnswer"));
				subject.setSubjectParse(rs.getString("subjectParse"));
				list.add(subject);
			}
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<Subject> selectByID(String subjectID) {
		List<Subject> list = new ArrayList<Subject>();
		try {
			String sql = "select * from tb_subject where subjectID=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,subjectID );
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Subject subject = new Subject();
				subject.setSubjectID(rs.getInt("subjectID"));
				subject.setSubjectTitle(rs.getString("subjectTitle"));
				subject.setSubjectOptionA(rs.getString("subjectOptionA"));
				subject.setSubjectOptionB(rs.getString("subjectOptionB"));
				subject.setSubjectOptionC(rs.getString("subjectOptionC"));
				subject.setSubjectOptionD(rs.getString("subjectOptionD"));
				subject.setSubjectAnswer(rs.getString("subjectAnswer"));
				subject.setSubjectParse(rs.getString("subjectParse"));
				list.add(subject);
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public boolean update( String subjectTitle,
			String subjectOptionA, String subjectOptionB,
			String subjectOptionC, String subjectOptionD, String subjectAnswer,
			String subjectParse) {
		boolean flag = false;
		try {
			String sql = "update tb_subject set subjectOptionA = '"+subjectOptionA+"',subjectOptionB = '"+subjectOptionB+"',subjectOptionC = '"+subjectOptionC+
					"',subjectOptionD = '"+subjectOptionD+"',subjectAnswer = '"+subjectAnswer+"',subjectParse = '"+subjectParse+"' where subjectTitle = '"+subjectTitle+"'";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int i = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			if(i>0)flag = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean delete(int subjectID) {
		boolean flag = false;
		
		try {
			String sql = "delete from tb_subject where subjectID = '"+subjectID+"'";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int i = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			if(i>0) flag = true;
		} catch (SQLException e) {
			System.out.println("鍒犻櫎澶辫触锛�");
			e.printStackTrace();
		}
		
		return flag;
	}


	



}
