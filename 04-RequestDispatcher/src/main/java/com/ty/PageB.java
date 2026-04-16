package com.ty;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page-b")
public class PageB extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("PageB got triggered");

		String name = (String) req.getAttribute("username");
		int age = (int) req.getAttribute("userage");
		Student student =(Student) req.getAttribute("stud");

		resp.getWriter().print("<html><body><h1>Welcome to PageB Servlet</h1>"
				+ "<h2>User Details</h2>"
				+ "<h3>Name : "+name+"</h3>"
				+ "<h3>Age : "+age+"</h3>"
				+ "<h2>Student Details</h2>"
				+ "<h3>Name : "+student.getName()+"</h3>"
				+ "<h3>Sid : "+student.getSid()+"</h3>"
				+ "</body></html>");
	}
}
