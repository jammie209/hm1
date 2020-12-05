package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SubjectDao;
import dao.SubjectDaoImpl;
import entity.Subject;

public class SubjectUpdateServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String subjectID = request.getParameter("subjectID");
		String subjectTitle=request.getParameter("subjectTitle");
		String subjectOptionA=request.getParameter("subjectOptionA");
		String subjectOptionB=request.getParameter("subjectOptionB");
		String subjectOptionC=request.getParameter("subjectOptionC");
		String subjectOptionD=request.getParameter("subjectOptionD");
		String subjectAnswer=request.getParameter("subjectAnswer");
		String subjectParse=request.getParameter("subjectParse");
		
		Subject subject = new Subject();
		//subject.setSubjectID(subjectID);
		subject.setSubjectTitle(subjectTitle);
		subject.setSubjectOptionA(subjectOptionA);
		subject.setSubjectOptionB(subjectOptionB);;
		subject.setSubjectOptionC(subjectOptionC);
		subject.setSubjectOptionD(subjectOptionD);
		subject.setSubjectAnswer(subjectAnswer);
		subject.setSubjectParse(subjectParse);
		
		SubjectDao sd = new SubjectDaoImpl();
		try{
		sd.update( subjectTitle, subjectOptionA, subjectOptionB, subjectOptionC,
				subjectOptionD, subjectAnswer, subjectParse);
		}catch(Exception e) {
			System.out.println("修改失败！");
			e.printStackTrace();
		}
		
	}

}
