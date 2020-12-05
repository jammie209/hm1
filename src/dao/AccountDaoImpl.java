package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import entity.Account;

public class AccountDaoImpl implements AccountDao{
	Connection conn = (Connection) DBConn.getConn();
	
	@Override
	public boolean add(Account account) {
		boolean flag = false;		
		
		try {
			String sql="insert into caccount values("+account.getPersonID()+","
					 +account.getAccID()+","
				     +account.getBalance()+")";
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
	public List<Account> selectall() {
		List<Account> list = new ArrayList<Account>();
		try {
			String sql = "select * from caccount";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Account account = new Account();
				account.setPersonID(rs.getInt("personID"));
				account.setAccID(rs.getInt("accID"));
				account.setBalance(rs.getDouble("balance"));
				list.add(account);
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
	public List<Account> selectByID(int accID) {
		List<Account> list = new ArrayList<Account>();
		try {
			String sql = "select * from caccount where accID=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, accID);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Account account = new Account();
				account.setPersonID(rs.getInt("personID"));
				account.setAccID(rs.getInt("accID"));
				account.setBalance(rs.getDouble("balance"));
				list.add(account);
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
	public boolean update(int accID,double balance) {
		boolean flag = false;
		try {
			String sql = "update caccount set balance = " + balance + " where accID = " + accID;
			
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
	public boolean delete(int accID) {
		boolean flag = false;
		
		try {
			String sql = "delete from caccount where accID = " + accID;
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int i = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			if(i>0) flag = true;
		} catch (SQLException e) {
			System.out.println("删除失败！");
			e.printStackTrace();
		}
		
		return flag;
	}
}
