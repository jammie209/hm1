package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AccountDao;
import dao.AccountDaoImpl;
import dao.SubjectDao;
import dao.SubjectDaoImpl;
import entity.Account;

public class AccountAddServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String p=request.getParameter("personID");
		int personID = Integer.parseInt(p);
		String a=request.getParameter("accID");
		int accID = Integer.parseInt(a);
		String b=request.getParameter("balance");
		double balance=Double.parseDouble(b);
		Account account =new Account();
		account.setPersonID(personID);
		account.setAccID(accID);
		account.setBalance(balance);
		
		AccountDao sd = new AccountDaoImpl();
		try{
			sd.add(account);
		}catch(Exception e){
			System.out.println("添加失败");
			e.printStackTrace();
		}
		
	}
}
