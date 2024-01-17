package com.loginformexample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class logout extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] ValuesDestroy = req.getCookies();
		ValuesDestroy[0].setMaxAge(0);
		ValuesDestroy[1].setMaxAge(0);
		resp.addCookie(ValuesDestroy[0]);
		resp.addCookie(ValuesDestroy[1]);
		resp.sendRedirect("index.html");
	}
	
}
