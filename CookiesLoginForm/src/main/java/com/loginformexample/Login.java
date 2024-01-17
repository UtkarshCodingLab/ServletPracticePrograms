package com.loginformexample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("emailInput");
		String password=req.getParameter("passwordInput");
		
		Cookie value1 = new Cookie("emailInput",email);
		Cookie value2 = new Cookie("passwordInput",password);
		
		resp.addCookie(value1);
		resp.addCookie(value2);
		
		resp.sendRedirect("dashboard");
		
	}
	
}
