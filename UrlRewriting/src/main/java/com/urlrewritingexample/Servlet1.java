package com.urlrewritingexample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("nameInput");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1> Username: "+name+"</h1>");
		out.print("<a href='servlet2?username="+name+"'>Servlet2</a>");
		
	}
	

}
