package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbconnections.studentdb;
import models.student;
import services.studentservice;

@WebServlet("/register")

public class studentservlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String branch = req.getParameter("branch");
		String email = req.getParameter("email");
		long phno = Long.parseLong(req.getParameter("phno"));
		
		student std = new student(0, name,branch,email,phno);
		studentservice service = new studentservice(studentdb.getconnection());
		boolean i = service.addstu(std);
		
		if(i) {
			resp.sendRedirect("welcome.jsp");
		}
		else {
			resp.sendRedirect("register.jsp");
		}
		
		
	}

}
