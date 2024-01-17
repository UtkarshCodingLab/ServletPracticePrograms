package com.urlrewritingexample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userInput = req.getParameter("username");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1> Username: "+userInput+"</h1>");
	}
	
}
