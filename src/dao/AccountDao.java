package dao;

import java.util.List;

import entity.Account;

public interface AccountDao {
	/*
	 * 1.添加数据
	 * 2.查看数据，返回信息
	 * 3.修改
	 * 4.删除
	 * 
	 * */
	
	
	public boolean add(Account account);
	public List<Account> selectall();
	public boolean update(int accID,double balance);
	public boolean delete(int accID);
	public List<Account> selectByID(int accID);
}
