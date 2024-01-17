package com.httpprocotolexample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("username");
		
		Cookie ck = new Cookie("username", name);
		resp.addCookie(ck);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("Welcome to Servlet1 name = "+name);
		out.print("<br> <a href='servlet2'>Servlet2</a>");	
	}
	
}
