package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Connection;
import DTO.StudentData;

@WebServlet("/insert")
public class Insert extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int roll_num=Integer.parseInt(req.getParameter("roll_num"));
		String name=req.getParameter("name");
		String branch=req.getParameter("branch");
		String DOB=req.getParameter("dob");
		int m1=Integer.parseInt(req.getParameter("m1"));
		int m2=Integer.parseInt(req.getParameter("m2"));
		int m3=Integer.parseInt(req.getParameter("m3"));
		
		Connection connection=new Connection();
		StudentData insertStdData = new StudentData();
		insertStdData.setName(name);
		insertStdData.setBranch(branch);
		insertStdData.setDOB(DOB);
		insertStdData.setMarks1(m1);
		insertStdData.setMarks2(m2);
		insertStdData.setMarks3(m3);
		connection.insert(insertStdData);
		
		res.getWriter().print("<h1>Record inserted sucessfully"+"</h1>");
	
	}
}
