package com.ty;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page-c")
public class PageC extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("PageC got triggered");

//		resp.sendRedirect("test.jsp");// html page, jsp page, url of servlet , third party website url

		resp.getWriter().print("<html><body><h1>Welcome to PageC Servlet</h1></body></html>");
	}
}
