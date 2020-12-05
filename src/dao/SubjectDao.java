package dao;

import java.util.List;

import entity.Subject;

public interface SubjectDao {
	/*
	 * 1.�������
	 * 2.�鿴���ݣ�������Ϣ
	 * 3.�޸�
	 * 4.ɾ��
	 * 
	 * */
	
	
	public boolean add(Subject subject);
	public List<Subject> selectall();
	public boolean update(String subjectTitle,String subjectOptionA,String subjectOptionB,
			String subjectOptionC,String subjectOptionD,String subjectAnswer,String subjectParse);
	public boolean delete(int subjectID);
	public List<Subject> selectByID(String string);
}
