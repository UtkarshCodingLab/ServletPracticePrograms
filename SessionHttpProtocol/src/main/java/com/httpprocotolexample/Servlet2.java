package com.httpprocotolexample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("username");
		
		Cookie[] ck=req.getCookies();
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<h1> Welcome to Servlet2, name= "+ck[0].getValue()+"</h1>");
	}
   
}
