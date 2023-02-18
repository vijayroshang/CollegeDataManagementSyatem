package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Connection;
import DTO.StudentData;
@WebServlet("/find")
public class Find extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int row_num = Integer.parseInt(req.getParameter("row_num"));
	Connection connection = new Connection();
	StudentData findStd = connection.find(row_num);
	
	req.setAttribute("find", findStd);
	res.getWriter().println("name: "+findStd.getName());;
	res.getWriter().println("DOB: "+findStd.getDOB());;
	res.getWriter().println("branch: "+findStd.getBranch());;
	res.getWriter().println("marks 1: "+findStd.getMarks1());;
	res.getWriter().println("marks 2: "+findStd.getMarks2());;
	res.getWriter().println("marks 3: "+findStd.getMarks3());;
	req.getRequestDispatcher("disp.jsp").include(req, res);
			
	}
}
