package com.ty;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page-a")
public class PageA extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("PageA got triggered");

		resp.getWriter().print("<html><body><h1>Welcome to PageA Servlet</h1></body></html>");

		String name = "Smith";
		int age = 20;
		Student student = new Student("Allen", "XYZ123");

		req.setAttribute("username", name);
		req.setAttribute("userage", age);
		req.setAttribute("stud", student);

		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");// pass page-b to dispatch req to PageB servlet
		rd.forward(req, resp);
//		rd.include(req, resp);
	}
}
