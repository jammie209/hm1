package dao;

import java.util.List;

import entity.Subject;

public interface SubjectDao {
	/*
	 * 1.添加数据
	 * 2.查看数据，返回信息
	 * 3.修改
	 * 4.删除
	 * 
	 * */
	
	
	public boolean add(Subject subject);
	public List<Subject> selectall();
	public boolean update(String subjectTitle,String subjectOptionA,String subjectOptionB,
			String subjectOptionC,String subjectOptionD,String subjectAnswer,String subjectParse);
	public boolean delete(int subjectID);
	public List<Subject> selectByID(String string);
}
