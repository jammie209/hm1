package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Account;
import dao.AccountDao;
import dao.AccountDaoImpl;

public class AccountUpdateServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String a=request.getParameter("accID");
		int accID = Integer.parseInt(a);
		String b=request.getParameter("balance");
		double balance=Double.parseDouble(b);
		
		
		Account account = new Account();
		account.setAccID(accID);
		account.setBalance(balance);
		
		AccountDao sd = new AccountDaoImpl();
		try{
		sd.update(accID, balance);
		}catch(Exception e) {
			System.out.println("修改失败！");
			e.printStackTrace();
		}
		
	}
}
