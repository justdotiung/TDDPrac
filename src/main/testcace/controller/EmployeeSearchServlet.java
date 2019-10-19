package main.testcace.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeSearchServlet extends HttpServlet{
	private SearchBiz searchBiz;
	
	public void setModel(SearchBiz searchBiz) {
		this.searchBiz = searchBiz;
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Employee employee = searchBiz.getEmployByEmpid(req.getParameter("empid"));
		
		req.setAttribute("employee", employee);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/SearchResult.jsp");
		dispatcher.forward(req,resp);
	}

}
