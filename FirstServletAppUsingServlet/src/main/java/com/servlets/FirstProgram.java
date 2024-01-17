package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstProgram implements Servlet{
	
	ServletConfig con;
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy method call");
		
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init method call");
		con = config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service method call destroy");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("Welcome to servlet");
		out.println("Today"+new Date().toString());
		System.out.println(getServletConfig());
		System.out.println(getServletInfo());
	}
	
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return con;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "My First Program";
	}


}
