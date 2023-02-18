package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Connection;
import DTO.StudentData;
@WebServlet("/fetch")
public class Fetch extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Connection connection= new Connection();
		List<StudentData> stdData= connection.fetchAll();
		
		req.setAttribute("fetch", stdData);
		req.getRequestDispatcher("result.jsp").forward(req, res);
	}
}
