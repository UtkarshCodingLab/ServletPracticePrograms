package com.loginformexample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dashboard")
public class UserDashBoard extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] ValuesArray = req.getCookies();
		
		if(ValuesArray==null)
		{
			resp.sendRedirect("index.html");
		} else {
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.println("<h1>Email="+ValuesArray[0].getValue()+"</h1>");
			out.println("<h1>Password="+ValuesArray[1].getValue()+"</h1>");
			out.print("<a href='logout'>Logout</a>");
		}
	}
	
}
