package com.gj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		
		name="secondServlet",
		initParams={
			@javax.servlet.annotation.WebInitParam(name="appName",value="secondServlet")	
		},
		urlPatterns={"/secondServlet"}
		)

public class SecondServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=null;
		out=resp.getWriter();
		
		out.println("called seconnd");
		System.out.println("secondservlet doget()");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("secondservlet init()");
	}

}
