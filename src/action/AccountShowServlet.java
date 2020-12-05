package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AccountDao;
import dao.AccountDaoImpl;
import entity.Account;

public class AccountShowServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		AccountDao sd = new AccountDaoImpl();
		List<Account> list = sd.selectByID(Integer.parseInt(request.getParameter("accID")));
		request.setAttribute("list", list);
		request.getRequestDispatcher("/accountShow.jsp").forward(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		
	}
}
