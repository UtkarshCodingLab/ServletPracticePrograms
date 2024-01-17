package com.requestdispatchservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class RequestDispatcherClass extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("user_name");
		String password = req.getParameter("password");
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		RequestDispatcher rd;
		
		if("utkarshjain@gmail.com".equals(username) && "utkarsh".equals(password))
		{
		 // Dashboard redirect
			rd=req.getRequestDispatcher("/servlet2");
			rd.forward(req, resp);
		} else {
			// redirect login page
			out.print("<h4>Invalid Email or Password</h4>");
			rd=req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
	}
	
	
}
