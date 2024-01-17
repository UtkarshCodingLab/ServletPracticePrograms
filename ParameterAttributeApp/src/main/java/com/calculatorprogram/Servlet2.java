package com.calculatorprogram;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int Number1 = Integer.parseInt(req.getParameter("firstNum"));
		int Number2 = Integer.parseInt(req.getParameter("secondNum"));
		
		int sum=(int)req.getAttribute("addition");
		
		int mul=Number1*Number2;
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("The Summation of two numbers is "+sum);
		out.print("<br>");
		out.print("The Multiplication of two numbers is "+mul);
	}
	
}
