package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SubjectDao;
import dao.SubjectDaoImpl;
import entity.Subject;

public class SubjectServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String subjectTitle=request.getParameter("subjectTitle");
		String subjectOptionA=request.getParameter("subjectOptionA");
		String subjectOptionB=request.getParameter("subjectOptionB");
		String subjectOptionC=request.getParameter("subjectOptionC");
		String subjectOptionD=request.getParameter("subjectOptionD");
		String subjectAnswer=request.getParameter("subjectAnswer");
		String subjectParse=request.getParameter("subjectParse");
		Subject Subject =new Subject();
		Subject.setSubjectTitle(subjectTitle);
		Subject.setSubjectOptionA(subjectOptionA);
		Subject.setSubjectOptionB(subjectOptionB);
		Subject.setSubjectOptionC(subjectOptionC);
		Subject.setSubjectOptionD(subjectOptionD);
		Subject.setSubjectAnswer(subjectAnswer);
		Subject.setSubjectParse(subjectParse);
		
		SubjectDao sd = new SubjectDaoImpl();
		try{
			sd.add(Subject);
		}catch(Exception e){
			System.out.println("添加失败");
			e.printStackTrace();
		}
		
	}
   
}
