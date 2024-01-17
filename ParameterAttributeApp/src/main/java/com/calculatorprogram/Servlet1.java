package com.calculatorprogram;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int Number1 = Integer.parseInt(req.getParameter("firstNum"));
		int Number2 = Integer.parseInt(req.getParameter("secondNum"));
		
		int sum=Number1+Number2;
		
		req.setAttribute("addition", sum);
		
		RequestDispatcher rd = req.getRequestDispatcher("/servlet2");
		rd.forward(req, resp);
		
		
	}
	
}
